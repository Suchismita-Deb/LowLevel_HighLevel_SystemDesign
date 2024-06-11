### When to use the design pattern.
When the client send the request and donot care about who is handling the request like there is a chain of requestHandler and the request will go to the first one if it cannot solve then to the second one and then to the third one if it solves then it will directly return the request.

Main use cases of the design pattern is like Design ATM, Design Vending Machine, Design Logger(Amazon).

There is an ATM and the client request for 2000 withdraw then it will firstgo to the 2000 handler and see if it can complete then return else it will go to the 1500 rupees handler say it is not completely returning then it will go to the 100 rupees handler.

The requestHandler is an abstract class and there are many concreteRequestHandler which extends the class and if the request is completed then return else go to the next concrete class. SO the abstrcat class will continue to check if the request is completed then return else call the next class.
For the logger we generally follow.
```java
Logger obj = new Logger();
obj.log("Info");
obj.log("Debug");
obj.log("Error");
// Here we donot make an object for the log, error and the debug.
```
In the example we have the `LogProcessor` as an abstact class.