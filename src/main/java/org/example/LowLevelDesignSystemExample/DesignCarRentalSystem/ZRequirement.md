First requirement clarification and we need to figure out the objects required.

First search of the Vehicle.
One user -> goto the Car rental system and search for the car available in the location. 

So now we have `User` object and `Location` object.

Now all the car are placed in store. Now we have `Store` object.


Say the user is interested in one particular store. The store should contain the list of 
 vehicle. So we have a `Vehicle` object. The Vehicle can be anything here we are making for car, but we can make it scalable like for bike or anything.

Second Reserve teh car.

User reserved the car. So reservation is an object.


Vehicle is a class and it contains all important field. We can also add more things for the child class.
All the vehicle is attached to the store. There is a rental facility in Delhi and Bangalore the car are in  the store. 
The Store class contains (HAS-A) `VehicleInventoryManagement` and the `VehicleInventoryManagement` contains the list of Vehicle and contains the CRUD operation like adding vehicle, removing and all.

Not adding inventory in the store that will make it difficult to read. Also with a separate *VehicleInventoryManagement* we can make other class for *CarInventoryManagement*, *BikeInventoryManagement*

Store also has the `Location` and also maintain the list of `Reservation`. Reservation is dependent on vehicle and vehicle is a part of the store.