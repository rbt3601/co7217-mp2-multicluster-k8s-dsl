# Introduction

In this exercise, I created a manual Ecore metamodel for a Multi-Cluster Kubernetes DSL.  
The purpose of this model is to describe how a single web application can be deployed to multiple Kubernetes clusters, where each cluster can have different configurations such as replica count, resources, and ingress settings.

This metamodel is based on Scenario 1, where the same application is deployed to an EU cluster and a US cluster, but with different values.

In this model, a Kubernetes deployment starts from the **Application**, which represents the overall web application. The application is deployed to one or more clusters, such as EU and US. Each cluster defines its own deployment, which specifies the container image and how many replicas (pods) should run in that cluster. The deployment also includes resource limits, which control how much CPU and memory the pods can use. Optionally, a cluster can define an ingress to expose the application using a specific URL path. This structure follows how Kubernetes works in real life, where an application is deployed to different clusters with different settings while keeping the same overall application definition.

---

## Purpose of Each Class

### **Application**

- The Application class represents the main web application.
- It has a `name` attribute to identify the application.
- This class is the root of the model.
- One application can be deployed to many clusters.

---

### **Cluster**

- The Cluster class represents a Kubernetes cluster (for example, EU or US).
- It has a `name` attribute.
- Each cluster holds its own deployment and ingress configuration.
- This allows the same application to behave differently in different regions.

---

### **Deployment**

- The Deployment class represents a Kubernetes Deployment.
- It contains the container `image` and number of `replicas`.
- Replica count can be different per cluster.
- This matches how Kubernetes deployments work in real life.

---

### **Resources**

- The Resources class represents CPU and memory limits.
- It has `cpu` and `memory` attributes.
- These values can be different for each cluster.
- This allows one cluster to be more powerful than another.

---

### **Ingress**

- The Ingress class represents a Kubernetes Ingress.
- It has a `path` attribute.
- Ingress is optional because not all clusters need external access.
- This allows different URL paths per cluster.

---

## Containment Relationships (Why They Are Used)

Containment is used to show ownership and lifecycle dependency.

- **Application → Clusters (0..*)**  
  One application can contain many clusters.

- **Cluster → Deployment (1..1)**  
  Each cluster must have exactly one deployment.

- **Cluster → Ingress (0..1)**  
  A cluster may or may not have an ingress.

- **Deployment → Resources (1..1)**  
  Every deployment must have resource limits.

Containment makes sure that child elements cannot exist without their parent, which matches Kubernetes behavior.

---

## Scenario 1 Example (EU + US Clusters)

Example of how the model is used:

- **Application name:** `web-app`

- **EU Cluster:**
  - replicas: 3
  - cpu: 500m
  - memory: 512Mi
  - ingress path: `/eu`

- **US Cluster:**
  - replicas: 5
  - cpu: 1000m
  - memory: 1Gi
  - ingress path: `/us`

Both clusters use the same application, but have different configurations.

---
## Scenario 2 – Extended Kubernetes Configuration

Scenario 2 extends the basic deployment model from Scenario 1 by adding advanced Kubernetes features such as services, configuration maps, autoscaling, and health probes. These additions allow the DSL to represent more realistic and production-ready Kubernetes deployments.

### Application
The Application class is extended with a namespace attribute to allow all generated Kubernetes resources to be deployed within a specific namespace.

### Service
The Service class represents a Kubernetes Service.  
It defines how the deployed application is exposed within or outside the cluster.  
The class includes a type attribute, which uses the ServiceType enumeration, as well as port and targetPort attributes.  
The service is optional because not all deployments require network exposure.

### ServiceType (Enumeration)
The ServiceType enumeration represents the different Kubernetes service types.  
It includes the values `ClusterIP`, `NodePort`, and `LoadBalancer`.  
Using an enumeration ensures that only valid Kubernetes service types can be selected.

### ConfigMap
The ConfigMap class represents a Kubernetes ConfigMap.  
It is used to store external configuration values for the application.  
The class has a name attribute and contains one or more key-value configuration entries.  
Config maps are optional because not all applications require externalized configuration.

### ConfigEntry
The ConfigEntry class represents a single configuration entry inside a ConfigMap.  
It contains a key and a value attribute.  
This structure allows flexible definition of application configuration data.

### AutoScaling
The AutoScaling class represents Kubernetes Horizontal Pod Autoscaling.  
It defines the minimum and maximum number of replicas and a CPU utilization threshold.  
Autoscaling is optional and allows the application to automatically scale based on load.

### Health
The Health class represents Kubernetes health probes.  
It defines `readinessPath` and `livenessPath` attributes.  
Health checks are optional because not all deployments require probe configuration, but when present, they improve reliability and availability.

---

## Containment Relationships (Why They Are Used)

Containment is used to model ownership and lifecycle dependency between Kubernetes resources.

- **Application → Clusters (0..*)**  
  One application can be deployed to multiple clusters.

- **Cluster → Deployment (1..1)**  
  Each cluster must contain exactly one deployment for the application.

- **Cluster → Service (0..1)**  
  A cluster may optionally expose the deployment using a service.

- **Cluster → Ingress (0..1)**  
  A cluster may optionally define ingress rules for external access.

- **Cluster → ConfigMap (0..1)**  
  A cluster may optionally include a configuration map for externalized settings.

- **Cluster → AutoScaling (0..1)**  
  A cluster may optionally define autoscaling rules based on resource usage.

- **Deployment → Resources (1..1)**  
  Each deployment must define CPU and memory resource limits.

- **Deployment → Health (0..1)**  
  Health checks are optional and used to monitor container readiness and liveness.

- **ConfigMap → ConfigEntry (1..*)**  
  Each configuration map must contain at least one key-value entry.

Containment ensures that child elements cannot exist without their parent, matching how Kubernetes resources are structured and managed.

---

## Scenario 2 Example (Advanced Cluster Configuration)

**Application name:** `web-app`  
**Namespace:** `production`

### EU Cluster
- replicas: 3  
- cpu: 500m  
- memory: 512Mi  
- service type: ClusterIP  
- service port: 80 → targetPort: 8080  
- ingress path: /eu  
- autoscaling: min 2, max 6, cpu utilization 70%  
- health checks:
  - readiness path: /health/ready
  - liveness path: /health/live

### US Cluster
- replicas: 5  
- cpu: 1000m  
- memory: 1Gi  
- service type: LoadBalancer  
- service port: 80 → targetPort: 8080  
- ingress path: /us  
- autoscaling: min 3, max 10, cpu utilization 75%  
- config map:
  - ENV = production
  - LOG_LEVEL = info

Both clusters deploy the same application but include additional Kubernetes features such as services, autoscaling, health checks, and configuration maps to support production-level requirements.

---

## Scenario 2 Conclusion

- Scenario 2 extends the model to support real-world Kubernetes features such as services, autoscaling, health probes, and configuration management.
- The metamodel remains flexible, allowing optional resources to be defined per cluster.
- This demonstrates how the DSL can model both simple and advanced deployment scenarios without changing the core application structure.


