package multicluster.dsl.generator;

import multicluster.dsl.multiClusterDsl.Application;
import multicluster.dsl.multiClusterDsl.Cluster;
import multicluster.dsl.multiClusterDsl.Deployment;
import multicluster.dsl.multiClusterDsl.Ingress;
import multicluster.dsl.multiClusterDsl.Model;
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
    EList<Cluster> _clusters = app.getClusters();
    for (final Cluster cluster : _clusters) {
      {
        final Deployment deployment = cluster.getDeployment();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("apiVersion: apps/v1");
        _builder.newLine();
        _builder.append("kind: Deployment");
        _builder.newLine();
        _builder.append("metadata:");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("name: ");
        String _name = app.getName();
        _builder.append(_name, "  ");
        _builder.append("-");
        String _name_1 = cluster.getName();
        _builder.append(_name_1, "  ");
        _builder.newLineIfNotEmpty();
        _builder.append("spec:");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("replicas: ");
        int _replicas = deployment.getReplicas();
        _builder.append(_replicas, "  ");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("selector:");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("matchLabels:");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("app: ");
        String _name_2 = app.getName();
        _builder.append(_name_2, "      ");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("template:");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("metadata:");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("labels:");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("app: ");
        String _name_3 = app.getName();
        _builder.append(_name_3, "        ");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("spec:");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("containers:");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("- name: ");
        String _name_4 = app.getName();
        _builder.append(_name_4, "      ");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("image: ");
        String _image = deployment.getImage();
        _builder.append(_image, "        ");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("resources:");
        _builder.newLine();
        _builder.append("          ");
        _builder.append("limits:");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("cpu: ");
        String _cpu = deployment.getResources().getCpu();
        _builder.append(_cpu, "            ");
        _builder.newLineIfNotEmpty();
        _builder.append("            ");
        _builder.append("memory: ");
        String _memory = deployment.getResources().getMemory();
        _builder.append(_memory, "            ");
        _builder.newLineIfNotEmpty();
        final String content = _builder.toString();
        String _name_5 = cluster.getName();
        String _plus = ("output/" + _name_5);
        String _plus_1 = (_plus + "/deployment.yaml");
        fsa.generateFile(_plus_1, content);
        Ingress _ingress = cluster.getIngress();
        boolean _tripleNotEquals = (_ingress != null);
        if (_tripleNotEquals) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("apiVersion: networking.k8s.io/v1");
          _builder_1.newLine();
          _builder_1.append("kind: Ingress");
          _builder_1.newLine();
          _builder_1.append("metadata:");
          _builder_1.newLine();
          _builder_1.append("  ");
          _builder_1.append("name: ");
          String _name_6 = app.getName();
          _builder_1.append(_name_6, "  ");
          _builder_1.append("-");
          String _name_7 = cluster.getName();
          _builder_1.append(_name_7, "  ");
          _builder_1.append("-ingress");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("spec:");
          _builder_1.newLine();
          _builder_1.append("  ");
          _builder_1.append("rules:");
          _builder_1.newLine();
          _builder_1.append("  ");
          _builder_1.append("- http:");
          _builder_1.newLine();
          _builder_1.append("      ");
          _builder_1.append("paths:");
          _builder_1.newLine();
          _builder_1.append("      ");
          _builder_1.append("- path: ");
          String _path = cluster.getIngress().getPath();
          _builder_1.append(_path, "      ");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("        ");
          _builder_1.append("pathType: Prefix");
          _builder_1.newLine();
          _builder_1.append("        ");
          _builder_1.append("backend:");
          _builder_1.newLine();
          _builder_1.append("          ");
          _builder_1.append("service:");
          _builder_1.newLine();
          _builder_1.append("            ");
          _builder_1.append("name: ");
          String _name_8 = app.getName();
          _builder_1.append(_name_8, "            ");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("            ");
          _builder_1.append("port:");
          _builder_1.newLine();
          _builder_1.append("              ");
          _builder_1.append("number: 80");
          _builder_1.newLine();
          final String ingressContent = _builder_1.toString();
          String _name_9 = cluster.getName();
          String _plus_2 = ("output/" + _name_9);
          String _plus_3 = (_plus_2 + "/ingress.yaml");
          fsa.generateFile(_plus_3, ingressContent);
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
