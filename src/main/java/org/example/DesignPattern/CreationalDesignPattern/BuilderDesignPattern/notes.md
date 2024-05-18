# Builder Design Pattern.

It helps in creation of an object.

An object where we have many optional fields. Like if there is a student object then the roll number is mandatory and rest all are optional like location, dob.


Now when will create an object we need to pass those values or else we need to make constructor for all the condition like use can give only roll number, another one like roll and location and dob, another one liken roll and location like many constructor will be created.
if location and dob is in string then we cannot make a constructor like roll and location, and roll and dob then the parameter will be same int and String. So we cannot make contructor.

Builder is like building step by step. Like for building house we can first build the door, window, roof, wall as a part.
First we will `add wall`, `add roof`, `add door`, `add window` like this will add. 

After adding one object it is in the builder object form. The final build() method will make the house object.

StringBuilder is using the Builder pattern. After every method the String builder is giving the builder object. In the StringBuilder when we are using the toString the it is returning the actual object.


### How to solve the issue.

In the Student class we will not make the constructor with all the parameter. We will pass the Builder object and there will add the parameter. This is one issue as in the Buidler object will add all the parameter again and it is code duplication. There will be set the value and also one build method to return the new object.

StudentBuilder can be an interface or an abstract class. It can have concrete class like EngineeringStudent or MBAStudent.

There is a 3layer design.
> Student class. Student builder class.
> Director.
> Client.

Client will call the director.

One thing say I want Engineering Student then created one class of EngineeringStudentBuilder and want MBAStudent then created MBAStudentBuilder. Now if I want a dual degree of Engineering and MBA then I have to make another class of EngineeringMBADualDegree and make the class.
We cannot make any dynamic change in the object like we can do in the Decorator Pattern.
