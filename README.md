# co7217-mp2-multicluster-k8s-dsl

## Deployment Scenarios

To demonstrate the capabilities of the proposed Domain-Specific Language (DSL), the project is evaluated using clear multi-cluster deployment scenarios based on real-world Kubernetes use cases.

---

## Scenario 1: Multi-Region Web Application

A web application is deployed across two Kubernetes clusters, one located in the EU and the other in the US.

Both clusters share the same application definition, but differ in the following aspects:

- Replica counts
- CPU and memory resource limits
- Ingress configuration (paths and exposure)

Using the DSL, these cluster-specific differences can be expressed declaratively, and Kubernetes manifests are generated automatically for each cluster from a single unified model.

---

## Scenario 2: Environment-Based Backend API Deployment

A backend API is deployed across three environments:

- Development: minimal resources for local testing
- Staging: moderate resources for validation
- Production: autoscaling and high-availability configuration

The DSL allows environment-specific settings to be adjusted while maintaining a consistent application definition. This approach reduces YAML duplication and helps prevent configuration drift across environments.

In both scenarios, the deployment intent is written directly in the DSL, and the tool automatically generates the appropriate cluster-specific Kubernetes YAML files.

---

## References to Real-World Repositories (Context & Inspiration)

The DSL design is informed by established industry practices for Kubernetes deployment automation and GitOps workflows. In particular, the project references:

- Bitnami NGINX Helm Chart – demonstrating large-scale reuse of parameterized Kubernetes templates
- FluxCD GitOps Example Repository – illustrating declarative, Git-driven multi-environment Kubernetes deployments

These repositories are used only as reference implementations to identify common patterns and best practices.
Unlike Helm templating, the proposed DSL explicitly models application intent and cluster-specific variation, enabling stronger validation and more reliable automation.

---

## Execution Plan: Two-Scenario Generation

### Phase A: Scenario 1 (Required – Foundation)

Scenario 1: Web application deployed to EU and US clusters

Key differences:
- Different replica counts
- Different CPU and memory allocations
- Different ingress configurations

Scenario 1 is used to:
- Define the core DSL structure
- Drive the metamodel (Exercise 2)
- Drive the Groovy-based code generator
- Serve as the primary case for AI comparison

#### Phase A.1: Completion Criteria

Scenario 1 is considered complete only when all of the following conditions are met:

1. DSL file parses successfully using Xtext
2. EMF model is generated correctly
3. Groovy generator executes without errors
4. Output folders are created per cluster
5. Generated Kubernetes YAML differs correctly per cluster
6. Ingress resources are generated conditionally

#### Phase A.2: Supported Scope

Only the following concepts are supported in Scenario 1:

- application
- cluster
- deployment
- resources (CPU, memory)
- replicas
- ingress (optional)

Out of scope:
- Autoscaling
- Services
- ConfigMaps

---

### Phase B: Scenario 2 (Extension – After Scenario 1)

Scenario 2: Backend API deployed to development, staging, and production environments.

Scenario 2 will:
- Reuse the same DSL grammar
- Reuse the same Groovy generator
- Introduce different values, not a new structural model

#### Phase B.1: Scenario Comparison

| Aspect       | Scenario 1: EU / US            | Scenario 2: Dev / Staging / Prod |
|-------------|--------------------------------|----------------------------------|
| Targets     | EU, US clusters                | Dev, Staging, Prod environments  |
| Replicas    | Fixed                          | Fixed or higher                  |
| Resources   | Different per cluster          | Different per environment        |
| Ingress     | On / Off                       | Usually off                      |
| Autoscaling | Not applicable                 | Optional extension               |

If Scenario 2 requires new grammar constructs, this indicates that the DSL is not sufficiently generic and represents a design issue.

#### Phase B.2: Completion Criteria

Scenario 2 is considered complete when:

1. A second .dsl file parses successfully
2. The generator runs without modification
3. Kubernetes YAML is generated for dev, staging, and prod
4. Differences are expressed through overrides, not duplication
5. Autoscaling remains optional

---

## Project Management Note

- Scenario 1 proves correctness
- Scenario 2 demonstrates scalability and extensibility
- Both scenarios use the same DSL and generator

This structure supports Exercises 1–5 and provides strong evidence for Exercise 6 (Project Management).
