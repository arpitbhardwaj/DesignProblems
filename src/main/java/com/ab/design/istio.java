package com.ab.design;

/**
 * @author Arpit Bhardwaj
 *
 * Istio is a service mesh
 *
 * A Service Mesh is an extra layer of software you deploy alongside of your cluster (k8s)
 *
 * Features:
 *  Telemetry (Gathering Metrics)
 *  Tracing
 *  Security
 *  Traffic Management (Rerouting requests)
 *
 *
 * Implementation:
 *  Istio is a combination of
 *      Data Plane
 *          A proxy (or sidecar or envoyproxy) container is deployed along with regular container in each pod
 *          All Proxy containers are collectively called as Data Plane
 *      Control Plane
 *          also called istio-system contains basically ~7 different pods
 *              - grafana
 *              - egressgateway
 *              - ingressgateway
 *              - tracing (renamed to jaegar now)
 *              - istiod (istio deamon)
 *              - kiali
 *              - prometheus
 *
 * envoy is an opensource component developed by lyft which delivers most of the features in istio
 *      - you can use envoy directly to build service mesh as it provides all features
 *      - envoy is very generic and do not have tight integration with k8s cluster on the other hand istio has
 *      - that's why engineers prefer istio in k8s cluster
 *      - though istio uses under the hood most of the envoy features
 */
