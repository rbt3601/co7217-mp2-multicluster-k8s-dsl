//Input: 

application webapp { 

  namespace "production" 

  /* -------- EU Region (full configuration) -------- */ 

  cluster eu { 

    deployment { 

      image "nginx:latest" 

      replicas 2 

      resources { 

        cpu "500m" 

        memory "256Mi" 

      } 

      health { 

        readinessPath "/health" 

        livenessPath "/health" 

      } 

    } 

  

    service { 

      type LoadBalancer 

      port 80 

      targetPort 8080 

    } 

  

    ingress { 

      path "/" 

    } 

  

    configMap app_config { 

      ENV "production" 

      REGION "eu" 

    } 

  

    autoscaling { 

      minReplicas 2 

      maxReplicas 5 

      cpuUtilization 70 

    } 

  } 

  

  /* -------- US Region (minimal configuration) -------- */ 

  cluster us { 

    deployment { 

      image "nginx:latest" 

      replicas 1 

      resources { 

        cpu "250m" 

        memory "128Mi" 

      } 

    } 

  

    service { 

      type ClusterIP 

      port 80 

      targetPort 80 

    } 

  } 

} 
