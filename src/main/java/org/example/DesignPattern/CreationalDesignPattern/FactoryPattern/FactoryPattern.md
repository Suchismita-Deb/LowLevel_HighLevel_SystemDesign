Factory Pattern is a creational design pattern. When we create an object we follow this pattern.

When we have to create object based on condition.

For condition 1 create a object now for all the 1000 classes we have to add the conditions. 
ShapeFactory **has a** relation in the interface. ShapeFactory **has a** object of the interface Shape.
Class implements interface it **is a** relation.  
Adding another class for the object creation so will just call the class. 
It is Simple Factory.

Example.
The transportation service app where the user can request different types of transport vehicle(Car, Bus, Bike) making the separate object creation directly is complex.

The Transport interface that is implemented by the class and the Transport service that will create the object of the class.

In the NoFactoryTransport we can see that the main code is tightly coupled with the objects.


The Factory Pattern helps to centralize the creation logic and delegates the responsibility of creating objects to factory classes, which decide the specific class to instantiate. It allows the code to adhere to the Open/Closed Principle, making it easier to add new types of objects without modifying existing code.

Real World Use Cases.

GUI framework - Teh type of button or widget to be created is determined by the factory based on the platform (Windows, macOS, Linux).
Database Connection - A factory can create different database connection objects (MySQL, PostgreSQL, SQLite) based on configuration settings.
Document Conversion Tool - The type of the file (Pdf, Docs, HTML) to be created depending on user input or settings.

