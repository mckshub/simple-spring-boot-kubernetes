# Deploy a simple spring boot application in Kubernetes cluster


**Build project using maven**

```
mvn clean package
```

Note: 
* Image will be created based on configuration in spring-boot-maven-plugin
* Refer deployment-steps.png & deployment-steps-2.png for results of above commands

**Deploy application using Kubernetes**

###### ~Note: Setting up Kubernetes and Minikube is necessary to complete below step 

```
 kubectl create -f kubernetes/deployment/deploy-definition.yml
```

**List deployment**

```
kubectl get deployments
```

**Scale up the application manually by overriding the replicas argument**

```
kubectl scale deployment app-deployment --replicas=3
```

**Configure Autoscaling based on CPU Utilization**

```
kubectl autoscale deployment app-deployment --min=2 --max=5 --cpu-percent=80
```

**List running pods created out of deployment**

```
kubectl get pods
``` 

**List all details of the deployment**

```
kubectl get all
```

**Delete/Terminate deployment**

```
kubectl delete deployment app-deployment
```



