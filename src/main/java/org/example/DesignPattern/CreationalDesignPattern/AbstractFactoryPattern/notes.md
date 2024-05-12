Abstract Factory Pattern.

When we use factory pattern on top of the factory pattern.
When we have more than one factory and each and every group is also a factory.

Say there is a Vehicle interface and it has class like LuxuryVehicle1, LuxuryVehicle2, OrdinaryVehicle1, OrdinaryVehicle2.
There is one factory for the LuxuryFactory which will give the product object and another factory the OrdinaryFactory which will give the ordinary car product. Factory 1 returns the product object.
Now there is one VehicleFactory which has LuxuryFactory and OrdinaryFactory. Factory 2 returns the factory object.



AbstractFactoryPattern.png