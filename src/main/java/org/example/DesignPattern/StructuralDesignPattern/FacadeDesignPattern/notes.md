In real world example API gateway in the application.

Problem without Facade.

In microservice there are many API on the basis of business logic like management, order processing and inventory. The client is willing to make call to the microservice then directly pinging to the microservice will be an issue and teh inner microservice should not be visible to client.

The API gateway will be used and the client will call the API gateway and internally it will work for the entire part.
The API gateway acts as a facade.

