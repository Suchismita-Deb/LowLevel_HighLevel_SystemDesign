In application we have to ensure that the db connection, logging or configuration setters are only one instance of a  class throughout the application lifecycle. 

There are multiple instance of the resource meaning the inconsiderate state - Multiple instances represent the same concept that may hold different data. Example - Logger object writing the logs should be same for all class.

Resource conflict - Multiple instances of a resource heavy-class are created, leading to performance issues. Example API version used as v1 in one app and v3 in another app - not needed we should use the same version of the API and not make extra object.


When to use the Singleton Pattern - **Global resource management** - db connection, logging. **Configuration Setting** in the application that needs to be shared.