Microservice Design Pattern.microservice.io

Monolithic and Microservice.

Monolithic - Say online store ( entire backend in one application). Overloaded IDE. Scaling is hard. The product, order and payment all in one application. Changes needs to be done in multiple places and deploy the entire project all the time.

Say in one part like the order has more load and want to only scale the order part then we cannot do that we need to upgrade the entire server.
Microservices.

Separate service for the parts like order, payment, product. If we want to scale one service we can scale it.
It should not be tightly coupled like if one change in one service then we should not change other services.
As connection between two microservice causes latency issus. In monolithic pattern say now API takes 1 ms but in microservice the latency makes the api response to like 12 ms.

Disadvantage.
Say one change in microservice and it is working but it breaks other microservice then it is difficult to debug and find the actual microservice that is not working.

### Patterns

Micro - means small. How much small each microservice should be ?
Decomposition Pattern.

Different phases of Microservices.
**Decomposition** (Decompose by Business Capability, Decompose by sub domain) **Refactoring** **Database**(Database for Service, Shared database) **Communication**(API communication, Even Communication) **Integration**(API gateways).

We choose different parts and then create the microservices.

### Decomposition.

Decompose by Business Capability, Decompose by sub domain(DDD).

Decompose by Business Capability.

Online Order System.
Order Management, Product Management, Account Management, Logging, Billing - Decompose based on business functionality.

Challenge - Overall idea of the business should be available.

Decompose by sub domain.

DDD - Domain Driven Design.

When one module is big then we divide based on sub domain.

Like Order Management is one domain. One domain can have multiple microservices like order tracking, order placing.

Payment is one domain. There can be many microservices like forward payment and reverse payment like refund and all.
