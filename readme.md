# A Spring Boot 3 and RestTemplate 

## Purpose
For doing a simple external API call using RestTemplate, in Spring Boot 3.

## How to Build Image
```
$ podman build -t default-route-openshift-image-registry.apps-crc.testing/edwin-ns/spring-boot-3-and-rest-template:latest .
Sending build context to Docker daemon  22.04MB
Step 1/5 : FROM registry.access.redhat.com/ubi8/openjdk-17-runtime:latest
 ---> 0d4d53977a4a
Step 2/5 : WORKDIR /work/
 ---> Using cache
 ---> 54c99c5c9e68
Step 3/5 : COPY target/*.jar /work/application.jar
 ---> 7bef5e7894f1
Removing intermediate container 53e57b1487e4
Step 4/5 : EXPOSE 8080
 ---> Running in a237a9a2ce7b
 ---> 66126c75cfb7
Removing intermediate container a237a9a2ce7b
Step 5/5 : CMD java -jar application.jar
 ---> Running in cc844389dd16
 ---> eb8042f0bc94
Removing intermediate container cc844389dd16
Successfully built eb8042f0bc94
Successfully tagged default-route-openshift-image-registry.apps-crc.testing/edwin-ns/spring-boot-3-and-rest-template:latest
```

## How to Run Image
```
$ podman run -p 8080:8080 default-route-openshift-image-registry.apps-crc.testing/edwin-ns/spring-boot-3-and-rest-template:latest
```