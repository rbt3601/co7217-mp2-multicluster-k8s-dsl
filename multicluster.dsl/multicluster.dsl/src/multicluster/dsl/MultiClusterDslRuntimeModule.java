package multicluster.dsl; 

import org.eclipse.xtext.generator.IGenerator2; 

import multicluster.dsl.generator.MultiClusterDslGenerator; 

public class MultiClusterDslRuntimeModule extends AbstractMultiClusterDslRuntimeModule { 

 

    @Override 

    public Class<? extends IGenerator2> bindIGenerator2() { 

    return MultiClusterDslGenerator.class; 

 

    } 

} 