A  ride-sharing application where passengers can request rides, and drivers can be matched to them based on proximity. 

The application should handle different types of vehicles (such as cars, bikes, luxury cars) and support multiple fare calculation strategies.

The system must notify both passengers and drivers about ride statuses and calculate the fare based on the type of ride and distance traveled.
   
**Constraints**   
The ride-matching algorithm must assign the nearest driver based on the distance between the passenger and driver.

You must implement at least three fare calculation strategies: Standard, Shared, and Luxury.

The system should be able to support different vehicle types: Car and Bike (with the option to extend for future vehicle types).

Notifications must be sent to both the passenger and driver as the ride progresses through different statuses (pending, ongoing, completed).

**Expected Deliverables**


Explanation of how SOLID principles are applied and why certain design patterns (e.g., Strategy, Observer, Mediator) were used.

Source Code for the ride-sharing application with clean, modular, and maintainable code.

Test Cases to verify correct functionality of the ride-matching system, fare calculation, and notification system.

Class Diagram that showcases how classes and interfaces are structured, including how design patterns are applied. (HomeWork)

**Functional Requirements.**

Ride Request.

Passengers can request a ride by providing their location and the desired destination.
The system should calculate the distance between the passenger’s location and the driver’s location.
The system must assign the nearest available driver to the passenger.

Vehicle Types.

The system should support different vehicle types (e.g., car, bike, luxury car).
Each vehicle type should have a different base fare per kilometer.


Fare Calculation.

The system should use different fare strategies (e.g., standard fare, shared fare, luxury fare).
The fare should be calculated based on the distance traveled and the vehicle type.

Ride Status Notifications.

Both the passenger and the driver should be notified of ride statuses (e.g., ride started, ride completed).
Use the Observer Pattern to notify users about ride status updates.

Ride Matching.

Drivers should be assigned to passengers based on proximity.
After a ride is completed, the driver becomes available for new ride requests.

**Non-Functional Requirements.**

Scalability.

The design should allow the system to easily add new types of vehicles and fare strategies without modifying core functionality.

Maintainability.

Adhere to SOLID principles to ensure that the system is easy to maintain and extend. Ensure that future features can be added with minimal changes to the existing codebase.
Separation of Concerns:
Separate the logic of fare calculation, ride matching, notifications, and user management into distinct components or classes.


Extensibility.

The system should be extensible. New vehicle types (e.g., electric scooters, vans) and new fare strategies (e.g., peak-hour pricing) should be easily added without modifying the core ride-matching logic.

### Solution.

The document outline like the payment and the car type should be extendable meaning following OCP.

There are 2 member in the application - Driver and Passenger. 
Its not db level design dont think in db term. The app should store the driver and passenger and will use List to store the value.


Application project is showing the basic rule and there are modification like the Driver when booked should be updated in the list or maybe a status like Booked or Available. The status is not the only things - the fare, passenger status, driver status are connected to the ride and the nearest driver is booked then the status should be changed.

The SRP is not maintained.
The RideSharingAppService is managing the driver and the passenger in the list.  
It is finding the nearby driver.  
It is booking the driver.  
It is calculating the fare.

The OCP is not maintained.

The addition of a Vehicle type need the code to be updated.

The vehicle should be an interface as it should be extendable.

There are many code repetition like the distance calculation from passenger source to destination and passenger to the driver.

**It is better to make a location class and put the x and y and calculate the distance inside the class.**
The existing code we can see the Driver and Passenger has the name, location. There are code similarity and its better to use User as a class and Driver and Passenger as a subclass.


The thought process - We need to create an object of the User - No.

In that case will make the class as abstract.

