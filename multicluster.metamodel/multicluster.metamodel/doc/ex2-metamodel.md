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

