### Strangler Pattern.

When we refactoring the microservice.

Monolith to Microservice.
Monolith has many components and when we convert to the microservice take small component and send the traffic to the microservice if it works then willcontinue else send to the monolith and then again send few request to the microservice.

Database (Database for Service, Shared database)

Shared database is not that famous.
Say there are 3 microservices and all are using the same database. First if one needs to update the database then it needs to check what other microservice is using the same column.

Join is easy as all are in the same database.
In Database for Service it is solved by **CQRS** pattern.

ACID transaction is easy as it is on single database so when the works completes then only it will show else it will not work.

In Database for Service there are separate database for the microservices and there are local transaction and acid property works only on one database, so it will work on one and it is connected to other database and it did not worked on the other database. This will create a problem. This is solved by SAGA pattern.

Database for Service.

When we have separate database for the separate services then one service cannot call the other db. The service need to call other microservice and that api will give the response from the db.

There may be services which use one sql and other nosql. Db maintainance is easy and one sb can be scaled and managed.

### SAGA

Sequence of Local Transaction. It handle the ACID property.
There is one order app and there are services like order, inventory and payment.

Order made and changes are made in order service db and inventory services db and it fails in the payment service.

ACID property is valid only in one db and when it is about multiple db it will not work.

SAGA pattern works in this case. When db executed for the order service it will send one even to the inventory if it gets successful then it will send event to the payment service. If payment service does not execute then it will send fail event to the inventory and it will roll back the changes.

SAGA pattern is of two types.

**Cheoreography**.

One success event is present and one failure event is present.

Say there are S1 and S2 and S3 services are present.

S1 completed so send successful event and S2 saw the message and completes its task and say S3 failed and it sends a fail event and S2 and S1 saw the event and rollback.

Drawback - All the services will keep on tracking the event and there is a cycle dependencies.

**Orchestration**.

There is one orchestor and when one service is successful then it send to the S2 and is S2 fails then it send to the S1 and there is no cycle dependencies.

### CQRS - Command Query Request Segregation.

Join of two db.

S1 and S2 has 2 db separataely.

One another View Db is created. All Create, Update and Delete operation of data is done in the service db and only read operation (query operation) is done in the view db.

The view will be updated based on the event and when there is change in the db it will get the message.
We can also use Db trigger or procedure for any update in the db.
