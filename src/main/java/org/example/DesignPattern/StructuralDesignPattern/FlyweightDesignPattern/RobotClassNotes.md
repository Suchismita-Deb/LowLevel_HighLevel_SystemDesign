Structural Design Pattern.
Use cases - Text Editor / Word Processor.
Lot of Games. Gaming design.

This pattern helps to **reduce the memory usage** by sharing data among multiple object.

Problem it solves. Example of a Gaming scenario.
In the game we have to create an army of Robot like human robot, roboticDog and many more. Say we have to create 1000 of Human robot and 5000 of Robotic Dog.
Here we are creating 6000 object. 
```java
public class Robot {
    int coordinateX;
    int coordinateY;
    String type;

    Robot(int coordinateX, int coordinateY, String type){
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.type = type;
    }
}
```
int coordinateX; // 4B
int coordinateY; // 4B
String type; // 50B (Say 50 char and one char is 1B)

Each object takes the memory and there is a huge memory use. We need to save the memory.
### When to use the FlyweightPattern.  
**When memory is limited.**
**When object shares the data.**
For all the object the data is shared for the `type`. For all the human robot the type is same `"HumanRobot"`.
*Intrinsic Data* - shared among object and remains same once defined one value. Here the type.
*Extrinsic Data* - changes based on client input and differ from one object to another. Here the coordinateX ad coordinateY.
If two object does not shares the data then we cannot use Flyweight.
**Creation of Object is expensive.**

### How the Flyweight solves the issue.

From the object removes all the extrinsic data and keep the intrinsic data (this object called Flyweight object).

This Flyweight class can be immutable.

Extrinsic data can be passed to the Flyweight class in the method parameter.

Once the Flyweight object is created, it is cached and reused whenever required.

We have the `RoboticDog` and `HumanRobot` as the Flyweight object.

We need to cache we have `RobotFactory`. Here in the map we will first store the object of the specific type. When creating the object will see if it is already created then use the object and only change the position in the display method.

We have the interface and the concrete class and the factory for the caching and then the driver method.

### Word Processor.
 Say we want to write the message 'This is the data' So we created a class containing the char, fontSize.
Now the object will be created for each char like in the text T - 1, t - 2, h - 1, i - 2 and so on. Total - 16 character. 
The object will be created and only the position of the char will be different.

```java
public static void main(String[] args) {
        // This is the data.
        // Total - 16 character.
        // t - 2, a - 2, i - 2 and so on.
        WordProcessor c1 = new WordProcessor('t',"Ariel",12,0,8);
        WordProcessor c2 = new WordProcessor('t',"Ariel",12,0,14);
        WordProcessor c3 = new WordProcessor('i',"Ariel",12,0,2);
    }
```

There will be some million of character creating object like this will be memory consuming.
Here we are creating 2 different object of the same type like t is coming 3 times.

### Resolving the issue.
First interface then concrete class and then cache and then main method.
For all the object only the row and col will be different. Will only put that in the interface. These are the extrinsic data.

So for all the similar object only one time the object will be created and it will be called for the next time.