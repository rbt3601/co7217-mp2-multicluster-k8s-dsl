package multicluster.dsl.generator;

import multicluster.dsl.multiClusterDsl.Application;
import multicluster.dsl.multiClusterDsl.AutoScaling;
import multicluster.dsl.multiClusterDsl.Cluster;
import multicluster.dsl.multiClusterDsl.ConfigEntry;
import multicluster.dsl.multiClusterDsl.ConfigMap;
import multicluster.dsl.multiClusterDsl.Deployment;
import multicluster.dsl.multiClusterDsl.Health;
import multicluster.dsl.multiClusterDsl.Ingress;
import multicluster.dsl.multiClusterDsl.Model;
import multicluster.dsl.multiClusterDsl.Service;
import multicluster.dsl.multiClusterDsl.ServiceType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class MultiClusterDslGenerator implements IGenerator2 {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final Model model = ((Model) _head);
    final Application app = model.getApplication();
    final String namespace = app.getNamespace();
    if ((namespace != null)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("apiVersion: v1");
      _builder.newLine();
      _builder.append("kind: Namespace");
      _builder.newLine();
      _builder.append("metadata:");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("name: ");
      _builder.append(namespace, "  ");
      _builder.newLineIfNotEmpty();
      final String namespaceContent = _builder.toString();
      fsa.generateFile(
        "output/namespace.yaml", namespaceContent);
    }
    EList<Cluster> _clusters = app.getClusters();
    for (final Cluster cluster : _clusters) {
      {
        final Deployment deployment = cluster.getDeployment();
        final Service service = cluster.getService();
        final ConfigMap configMap = cluster.getConfigMap();
        final AutoScaling autoscaling = cluster.getAutoscaling();
        final Health health = deployment.getHealth();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("apiVersion: apps/v1");
        _builder_1.newLine();
        _builder_1.append("kind: Deployment");
        _builder_1.newLine();
        _builder_1.append("metadata:");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("name: ");
        String _name = app.getName();
        _builder_1.append(_name, "  ");
        _builder_1.append("-");
        String _name_1 = cluster.getName();
        _builder_1.append(_name_1, "  ");
        _builder_1.newLineIfNotEmpty();
        {
          if ((namespace != null)) {
            _builder_1.append("namespace: ");
            _builder_1.append(namespace);
            _builder_1.newLineIfNotEmpty();
          }
        }
        _builder_1.append("spec:");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("replicas: ");
        int _replicas = deployment.getReplicas();
        _builder_1.append(_replicas, "  ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("  ");
        _builder_1.append("selector:");
        _builder_1.newLine();
        _builder_1.append("    ");
        _builder_1.append("matchLabels:");
        _builder_1.newLine();
        _builder_1.append("      ");
        _builder_1.append("app: ");
        String _name_2 = app.getName();
        _builder_1.append(_name_2, "      ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("  ");
        _builder_1.append("template:");
        _builder_1.newLine();
        _builder_1.append("    ");
        _builder_1.append("metadata:");
        _builder_1.newLine();
        _builder_1.append("      ");
        _builder_1.append("labels:");
        _builder_1.newLine();
        _builder_1.append("        ");
        _builder_1.append("app: ");
        String _name_3 = app.getName();
        _builder_1.append(_name_3, "        ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("    ");
        _builder_1.append("spec:");
        _builder_1.newLine();
        _builder_1.append("      ");
        _builder_1.append("containers:");
        _builder_1.newLine();
        _builder_1.append("      ");
        _builder_1.append("- name: ");
        String _name_4 = app.getName();
        _builder_1.append(_name_4, "      ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("        ");
        _builder_1.append("image: ");
        String _image = deployment.getImage();
        _builder_1.append(_image, "        ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("        ");
        _builder_1.append("resources:");
        _builder_1.newLine();
        _builder_1.append("          ");
        _builder_1.append("limits:");
        _builder_1.newLine();
        _builder_1.append("            ");
        _builder_1.append("cpu: ");
        String _cpu = deployment.getResources().getCpu();
        _builder_1.append(_cpu, "            ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("            ");
        _builder_1.append("memory: ");
        String _memory = deployment.getResources().getMemory();
        _builder_1.append(_memory, "            ");
        _builder_1.newLineIfNotEmpty();
        {
          if ((health != null)) {
            _builder_1.append("readinessProbe:");
            _builder_1.newLine();
            _builder_1.append("  ");
            _builder_1.append("httpGet:");
            _builder_1.newLine();
            _builder_1.append("    ");
            _builder_1.append("path: ");
            String _readinessPath = health.getReadinessPath();
            _builder_1.append(_readinessPath, "    ");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("    ");
            _builder_1.append("port: ");
            {
              if ((service != null)) {
                _builder_1.newLineIfNotEmpty();
                _builder_1.append("    ");
                _builder_1.append("number: ");
                int _port = service.getPort();
                _builder_1.append(_port, "    ");
                _builder_1.newLineIfNotEmpty();
              } else {
                _builder_1.append("    ");
                _builder_1.append("number: 80");
                _builder_1.newLine();
              }
            }
            _builder_1.newLine();
            _builder_1.append("livenessProbe:");
            _builder_1.newLine();
            _builder_1.append("  ");
            _builder_1.append("httpGet:");
            _builder_1.newLine();
            _builder_1.append("    ");
            _builder_1.append("path: ");
            String _livenessPath = health.getLivenessPath();
            _builder_1.append(_livenessPath, "    ");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("    ");
            _builder_1.append("port: ");
            {
              if ((service != null)) {
                _builder_1.newLineIfNotEmpty();
                _builder_1.append("    ");
                _builder_1.append("number: ");
                int _port_1 = service.getPort();
                _builder_1.append(_port_1, "    ");
                _builder_1.newLineIfNotEmpty();
              } else {
                _builder_1.append("    ");
                _builder_1.append("number: 80");
                _builder_1.newLine();
              }
            }
            _builder_1.newLine();
          }
        }
        final String deploymentContent = _builder_1.toString();
        String _name_5 = cluster.getName();
        String _plus = ("output/" + _name_5);
        String _plus_1 = (_plus + "/deployment.yaml");
        fsa.generateFile(_plus_1, deploymentContent);
        if ((configMap != null)) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("apiVersion: v1");
          _builder_2.newLine();
          _builder_2.append("kind: ConfigMap");
          _builder_2.newLine();
          _builder_2.append("metadata:");
          _builder_2.newLine();
          _builder_2.append("  ");
          _builder_2.append("name: ");
          String _name_6 = configMap.getName();
          _builder_2.append(_name_6, "  ");
          _builder_2.newLineIfNotEmpty();
          {
            if ((namespace != null)) {
              _builder_2.append("namespace: ");
              _builder_2.append(namespace);
              _builder_2.newLineIfNotEmpty();
            }
          }
          _builder_2.append("data:");
          _builder_2.newLine();
          {
            EList<ConfigEntry> _entries = configMap.getEntries();
            for(final ConfigEntry entry : _entries) {
              String _key = entry.getKey();
              _builder_2.append(_key);
              _builder_2.append(": ");
              String _value = entry.getValue();
              _builder_2.append(_value);
              _builder_2.newLineIfNotEmpty();
            }
          }
          final String configMapContent = _builder_2.toString();
          String _name_7 = cluster.getName();
          String _plus_2 = ("output/" + _name_7);
          String _plus_3 = (_plus_2 + "/configmap.yaml");
          fsa.generateFile(_plus_3, configMapContent);
        }
        if ((service != null)) {
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("apiVersion: v1");
          _builder_3.newLine();
          _builder_3.append("kind: Service");
          _builder_3.newLine();
          _builder_3.append("metadata:");
          _builder_3.newLine();
          _builder_3.append("  ");
          _builder_3.append("name: ");
          String _name_8 = app.getName();
          _builder_3.append(_name_8, "  ");
          _builder_3.append("-");
          String _name_9 = cluster.getName();
          _builder_3.append(_name_9, "  ");
          _builder_3.newLineIfNotEmpty();
          {
            if ((namespace != null)) {
              _builder_3.append("namespace: ");
              _builder_3.append(namespace);
              _builder_3.newLineIfNotEmpty();
            }
          }
          _builder_3.append("spec:");
          _builder_3.newLine();
          _builder_3.append("  ");
          _builder_3.append("type: ");
          ServiceType _type = service.getType();
          _builder_3.append(_type, "  ");
          _builder_3.newLineIfNotEmpty();
          _builder_3.append("  ");
          _builder_3.append("selector:");
          _builder_3.newLine();
          _builder_3.append("    ");
          _builder_3.append("app: ");
          String _name_10 = app.getName();
          _builder_3.append(_name_10, "    ");
          _builder_3.newLineIfNotEmpty();
          _builder_3.append("  ");
          _builder_3.append("ports:");
          _builder_3.newLine();
          _builder_3.append("  ");
          _builder_3.append("- port: ");
          int _port_2 = service.getPort();
          _builder_3.append(_port_2, "  ");
          _builder_3.newLineIfNotEmpty();
          _builder_3.append("    ");
          _builder_3.append("targetPort: ");
          int _targetPort = service.getTargetPort();
          _builder_3.append(_targetPort, "    ");
          _builder_3.newLineIfNotEmpty();
          final String serviceContent = _builder_3.toString();
          String _name_11 = cluster.getName();
          String _plus_4 = ("output/" + _name_11);
          String _plus_5 = (_plus_4 + "/service.yaml");
          fsa.generateFile(_plus_5, serviceContent);
        }
        Ingress _ingress = cluster.getIngress();
        boolean _tripleNotEquals = (_ingress != null);
        if (_tripleNotEquals) {
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("apiVersion: networking.k8s.io/v1");
          _builder_4.newLine();
          _builder_4.append("kind: Ingress");
          _builder_4.newLine();
          _builder_4.append("metadata:");
          _builder_4.newLine();
          _builder_4.append("  ");
          _builder_4.append("name: ");
          String _name_12 = app.getName();
          _builder_4.append(_name_12, "  ");
          _builder_4.append("-");
          String _name_13 = cluster.getName();
          _builder_4.append(_name_13, "  ");
          _builder_4.append("-ingress");
          _builder_4.newLineIfNotEmpty();
          {
            if ((namespace != null)) {
              _builder_4.append("namespace: ");
              _builder_4.append(namespace);
              _builder_4.newLineIfNotEmpty();
            }
          }
          _builder_4.append("spec:");
          _builder_4.newLine();
          _builder_4.append("  ");
          _builder_4.append("rules:");
          _builder_4.newLine();
          _builder_4.append("  ");
          _builder_4.append("- http:");
          _builder_4.newLine();
          _builder_4.append("      ");
          _builder_4.append("paths:");
          _builder_4.newLine();
          _builder_4.append("      ");
          _builder_4.append("- path: ");
          String _path = cluster.getIngress().getPath();
          _builder_4.append(_path, "      ");
          _builder_4.newLineIfNotEmpty();
          _builder_4.append("        ");
          _builder_4.append("pathType: Prefix");
          _builder_4.newLine();
          _builder_4.append("        ");
          _builder_4.append("backend:");
          _builder_4.newLine();
          _builder_4.append("          ");
          _builder_4.append("service:");
          _builder_4.newLine();
          _builder_4.append("            ");
          _builder_4.append("name: ");
          String _name_14 = app.getName();
          _builder_4.append(_name_14, "            ");
          _builder_4.append("-");
          String _name_15 = cluster.getName();
          _builder_4.append(_name_15, "            ");
          _builder_4.newLineIfNotEmpty();
          _builder_4.append("            ");
          _builder_4.append("port:");
          _builder_4.newLine();
          _builder_4.append("              ");
          _builder_4.append("number: ");
          {
            if ((service != null)) {
              _builder_4.newLineIfNotEmpty();
              _builder_4.append("              ");
              _builder_4.append("number: ");
              int _port_3 = service.getPort();
              _builder_4.append(_port_3, "              ");
              _builder_4.newLineIfNotEmpty();
            } else {
              _builder_4.append("              ");
              _builder_4.append("number: 80");
              _builder_4.newLine();
            }
          }
          _builder_4.newLine();
          final String ingressContent = _builder_4.toString();
          String _name_16 = cluster.getName();
          String _plus_6 = ("output/" + _name_16);
          String _plus_7 = (_plus_6 + "/ingress.yaml");
          fsa.generateFile(_plus_7, ingressContent);
        }
        if ((autoscaling != null)) {
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("apiVersion: autoscaling/v2");
          _builder_5.newLine();
          _builder_5.append("kind: HorizontalPodAutoscaler");
          _builder_5.newLine();
          _builder_5.append("metadata:");
          _builder_5.newLine();
          _builder_5.append("  ");
          _builder_5.append("name: ");
          String _name_17 = app.getName();
          _builder_5.append(_name_17, "  ");
          _builder_5.append("-");
          String _name_18 = cluster.getName();
          _builder_5.append(_name_18, "  ");
          _builder_5.append("-hpa");
          _builder_5.newLineIfNotEmpty();
          {
            if ((namespace != null)) {
              _builder_5.append("namespace: ");
              _builder_5.append(namespace);
              _builder_5.newLineIfNotEmpty();
            }
          }
          _builder_5.append("spec:");
          _builder_5.newLine();
          _builder_5.append("  ");
          _builder_5.append("scaleTargetRef:");
          _builder_5.newLine();
          _builder_5.append("    ");
          _builder_5.append("apiVersion: apps/v1");
          _builder_5.newLine();
          _builder_5.append("    ");
          _builder_5.append("kind: Deployment");
          _builder_5.newLine();
          _builder_5.append("    ");
          _builder_5.append("name: ");
          String _name_19 = app.getName();
          _builder_5.append(_name_19, "    ");
          _builder_5.append("-");
          String _name_20 = cluster.getName();
          _builder_5.append(_name_20, "    ");
          _builder_5.newLineIfNotEmpty();
          _builder_5.append("  ");
          _builder_5.append("minReplicas: ");
          int _minReplicas = autoscaling.getMinReplicas();
          _builder_5.append(_minReplicas, "  ");
          _builder_5.newLineIfNotEmpty();
          _builder_5.append("  ");
          _builder_5.append("maxReplicas: ");
          int _maxReplicas = autoscaling.getMaxReplicas();
          _builder_5.append(_maxReplicas, "  ");
          _builder_5.newLineIfNotEmpty();
          _builder_5.append("  ");
          _builder_5.append("metrics:");
          _builder_5.newLine();
          _builder_5.append("  ");
          _builder_5.append("- type: Resource");
          _builder_5.newLine();
          _builder_5.append("    ");
          _builder_5.append("resource:");
          _builder_5.newLine();
          _builder_5.append("      ");
          _builder_5.append("name: cpu");
          _builder_5.newLine();
          _builder_5.append("      ");
          _builder_5.append("target:");
          _builder_5.newLine();
          _builder_5.append("        ");
          _builder_5.append("type: Utilization");
          _builder_5.newLine();
          _builder_5.append("        ");
          _builder_5.append("averageUtilization: ");
          int _cpuUtilization = autoscaling.getCpuUtilization();
          _builder_5.append(_cpuUtilization, "        ");
          _builder_5.newLineIfNotEmpty();
          final String hpaContent = _builder_5.toString();
          String _name_21 = cluster.getName();
          String _plus_8 = ("output/" + _name_21);
          String _plus_9 = (_plus_8 + "/hpa.yaml");
          fsa.generateFile(_plus_9, hpaContent);
        }
      }
    }
  }

  @Override
  public void beforeGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
  }

  @Override
  public void afterGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
  }
}
