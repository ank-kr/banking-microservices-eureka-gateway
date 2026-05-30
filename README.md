\# Banking Microservices with Eureka and API Gateway



This project is a simple banking microservices application built using Spring Boot.



\## Services



\- service-registry: Eureka Server

\- customer-service: Manages customer details

\- account-service: Manages account details

\- api-gateway: Routes requests to microservices



\## Ports



\- service-registry: 8761

\- api-gateway: 8080

\- customer-service: 8081

\- account-service: 8082



\## API Gateway Endpoints



GET http://localhost:8080/api/customers



GET http://localhost:8080/api/accounts



GET http://localhost:8080/api/accounts/customer/1



\## Run Order



1\. Start service-registry

2\. Start customer-service

3\. Start account-service

4\. Start api-gateway

