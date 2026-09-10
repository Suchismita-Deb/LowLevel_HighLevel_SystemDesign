Abstract Factory Pattern.

When we use factory pattern on top of the factory pattern.
When we have more than one factory and each and every group is also a factory.

Say there is a Vehicle interface and it has class like LuxuryVehicle1, LuxuryVehicle2, OrdinaryVehicle1, OrdinaryVehicle2.
There is one factory for the LuxuryFactory which will give the product object and another factory the OrdinaryFactory which will give the ordinary car product. Factory 1 returns the product object.
Now there is one VehicleFactory which has LuxuryFactory and OrdinaryFactory. Factory 2 returns the factory object.


![AbstractFactoryPattern Design Pattern](AbstractFactoryPattern.png)
The Factory pattern to support multiple UI theme like the window, macOs. The theme has its own set of UI components like the button, scrollbar. 

The challenge is to create an architecture that allows switching between these themes without changing the client code that uses the UI component.

The code shows that there is an issue with tight coupling and the client code create the specific UI component and the hard to extend issue like when we want to add support for macOs Ui component we need to modify the client code to create instance of MacOsButton and MacOSScrollBar.


The Factory pattern solves the problem providing the interface for creating families of related objects. 

The structure - Abstract Factory - Interface for creating abstract products.  
Concrete Factory - Implements the abstract factory and creates concrete products.

There are UIFactory interface and the method will be like the createButton() and createScrollBar() and the class like WindowFactory and MacOsFactory will implement the interface. 
The window Ui then the Window factory and it will implement all window methods. 