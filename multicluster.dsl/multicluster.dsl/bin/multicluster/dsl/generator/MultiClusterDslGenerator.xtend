package multicluster.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IGenerator2
import multicluster.dsl.multiClusterDsl.Model

class MultiClusterDslGenerator implements IGenerator2 {

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

        val model = resource.contents.head as Model
        val app = model.application
        val namespace = app.namespace

        /*Namespace*/
        if (namespace !== null) {
            val namespaceContent = '''
apiVersion: v1
kind: Namespace
metadata:
  name: «namespace»
'''
            fsa.generateFile(
                "output/namespace.yaml",
                namespaceContent
            )
        }

        for (cluster : app.clusters) {

            val deployment = cluster.deployment
            val service = cluster.service
            val configMap = cluster.configMap
            val autoscaling = cluster.autoscaling
            val health = deployment.health

            /*Deployment*/
            val deploymentContent = '''
apiVersion: apps/v1
kind: Deployment
metadata:
  name: «app.name»-«cluster.name»
«IF namespace !== null»
  namespace: «namespace»
«ENDIF»
spec:
  replicas: «deployment.replicas»
  selector:
    matchLabels:
      app: «app.name»
  template:
    metadata:
      labels:
        app: «app.name»
    spec:
      containers:
      - name: «app.name»
        image: «deployment.image»
        resources:
          limits:
            cpu: «deployment.resources.cpu»
            memory: «deployment.resources.memory»
«IF health !== null»
        readinessProbe:
          httpGet:
            path: «health.readinessPath»
            port: «IF service !== null»
            number: «service.port»
            «ELSE»
            number: 80
            «ENDIF»

        livenessProbe:
          httpGet:
            path: «health.livenessPath»
            port: «IF service !== null»
            number: «service.port»
            «ELSE»
            number: 80
            «ENDIF»

«ENDIF»
'''

            fsa.generateFile(
                "output/" + cluster.name + "/deployment.yaml",
                deploymentContent
            )

            /*ConfigMap*/
            if (configMap !== null) {

                val configMapContent = '''
apiVersion: v1
kind: ConfigMap
metadata:
  name: «configMap.name»
«IF namespace !== null»
  namespace: «namespace»
«ENDIF»
data:
«FOR entry : configMap.entries»
  «entry.key»: «entry.value»
«ENDFOR»
'''

                fsa.generateFile(
                    "output/" + cluster.name + "/configmap.yaml",
                    configMapContent
                )
            }

            /*Service*/
            if (service !== null) {

                val serviceContent = '''
apiVersion: v1
kind: Service
metadata:
  name: «app.name»-«cluster.name»
«IF namespace !== null»
  namespace: «namespace»
«ENDIF»
spec:
  type: «service.type»
  selector:
    app: «app.name»
  ports:
  - port: «service.port»
    targetPort: «service.targetPort»
'''

                fsa.generateFile(
                    "output/" + cluster.name + "/service.yaml",
                    serviceContent
                )
            }

            /*Ingress*/
            if (cluster.ingress !== null) {

                val ingressContent = '''
apiVersion: networking.k8s.io/v1
kind: Ingress
metadata:
  name: «app.name»-«cluster.name»-ingress
«IF namespace !== null»
  namespace: «namespace»
«ENDIF»
spec:
  rules:
  - http:
      paths:
      - path: «cluster.ingress.path»
        pathType: Prefix
        backend:
          service:
            name: «app.name»-«cluster.name»
            port:
              number: «IF service !== null»
              number: «service.port»
              «ELSE»
              number: 80
              «ENDIF»

'''

                fsa.generateFile(
                    "output/" + cluster.name + "/ingress.yaml",
                    ingressContent
                )
            }

            /*Autoscaling*/
            if (autoscaling !== null) {

                val hpaContent = '''
apiVersion: autoscaling/v2
kind: HorizontalPodAutoscaler
metadata:
  name: «app.name»-«cluster.name»-hpa
«IF namespace !== null»
  namespace: «namespace»
«ENDIF»
spec:
  scaleTargetRef:
    apiVersion: apps/v1
    kind: Deployment
    name: «app.name»-«cluster.name»
  minReplicas: «autoscaling.minReplicas»
  maxReplicas: «autoscaling.maxReplicas»
  metrics:
  - type: Resource
    resource:
      name: cpu
      target:
        type: Utilization
        averageUtilization: «autoscaling.cpuUtilization»
'''

                fsa.generateFile(
                    "output/" + cluster.name + "/hpa.yaml",
                    hpaContent
                )
            }
        }
    }

    override void beforeGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {}
    override void afterGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {}
}
