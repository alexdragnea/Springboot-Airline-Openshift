# Springboot-Airline-api-openshift
Demo project using https://instantwebtools.net/fake-rest-api for deploying to Openshift with webhook.

```
ab -n 200 https://example
```

#### 200 requests with one pod
![image](https://user-images.githubusercontent.com/58791006/160604384-cb868419-2181-4104-8191-dc26c37e6a68.png)

#### 200 requests with 4 pods
![image](https://user-images.githubusercontent.com/58791006/160605317-09450a88-8a65-4163-b1a8-1740a2cce1d3.png)

#### 200 requests with autoscaling enable (min = 2 pods, max = 7 pods, cpu = 20%)
![image](https://user-images.githubusercontent.com/58791006/160609222-773cf413-180d-483e-98d3-49c4cfa8c608.png)

#### 200 requests with autoscaling enable (min = 2 pods, max = 7 pods, cpu = 5%)
![image](https://user-images.githubusercontent.com/58791006/160610197-5c7a5efb-9fee-4ea7-8079-7892cbda8f64.png)


