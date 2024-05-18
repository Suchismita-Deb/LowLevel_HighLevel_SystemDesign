# Prototype Design Pattern.

It is used to make a copy/clone of the existing object. 
Say the class has lot of instance variable and it is very expensive.
One instance value is private that cannot be copied. In the example obj1 cannot copy the roll number.

Say the student has 100 instance variable and we have to copy for 98 variable then the client needs to know about all the variable and clone the value.
According to the Prototype model the clone method should be managed by the class and not the client. Every class will have the clone method. 

The class manage the clone method so the private value will also be covered.

The prototype will be an interface and it will have the clone method and all the class will implement the method.