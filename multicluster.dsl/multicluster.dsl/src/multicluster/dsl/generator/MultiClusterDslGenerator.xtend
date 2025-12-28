package multicluster.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IGenerator2
import multicluster.dsl.multiClusterDsl.Model

class MultiClusterDslGenerator implements IGenerator2 {

   override void doGenerate(Resource resource,IFileSystemAccess2 fsa,IGeneratorContext context) {
    val model = resource.contents.head as Model
    val app = model.application

    for (cluster : app.clusters) {

        val deployment = cluster.deployment

        val content = '''
apiVersion: apps/v1
kind: Deployment
metadata:
  name: «app.name»-«cluster.name»
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
'''

        fsa.generateFile(
            "output/" + cluster.name + "/deployment.yaml",
            content
        )
        
        if (cluster.ingress !== null) {

    val ingressContent = '''
apiVersion: networking.k8s.io/v1
kind: Ingress
metadata:
  name: «app.name»-«cluster.name»-ingress
spec:
  rules:
  - http:
      paths:
      - path: «cluster.ingress.path»
        pathType: Prefix
        backend:
          service:
            name: «app.name»
            port:
              number: 80
'''

    fsa.generateFile(
        "output/" + cluster.name + "/ingress.yaml",
        ingressContent
    )
}
        
    }
}

    override void beforeGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {}
    override void afterGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {}
}

