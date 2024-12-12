### Interface Segmented Principle.

Interfaces should be such that client should not implement unnecessary functions they do not need.

ISP states that clients should not be forced to depend on methods they do not use.

```java
interface Animal {
    void eat();
    void fly();
    void swim();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats");
    }

    public void fly() {
        // Dog can't fly, but is forced to implement this method
    }

    public void swim() {
        System.out.println("Dog swims");
    }
}
```

Dog is forced to implement a fly method it doesn’t need.

|Aspect	| Liskov Substitution Principle (LSP)	                                                                                                        | Interface Segregation Principle (ISP)              |
|---|---------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------|
|Focus	| Ensures that subclasses can replace their base classes.                                                                                     | 	Ensures interfaces are small and client-specific. |
Concern	| Behavior and correctness of inheritance.                                                                                                    |	Design of interfaces and their usage.|
Violation	| Subclass alters expected behavior of base class.                                                                                            |	Interfaces force classes to implement unused methods.|
Goal| 	Maintain polymorphism and avoid runtime surprises.                                                                                         |	Improve modularity and reduce dependency overhead.|
Rules| _"Can I replace the base class with the derived class without causing unexpected behavior?"_  If the answer is "no," the design violates LSP. | _"Is this interface forcing a class to implement methods it doesn’t use?"_ If the answer is "yes," the design violates ISP. |