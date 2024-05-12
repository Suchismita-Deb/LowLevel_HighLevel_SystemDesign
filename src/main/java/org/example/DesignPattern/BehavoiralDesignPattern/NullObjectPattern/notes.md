Null Object Pattern To handle the null in the code.

```java
public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        System.out.println(v1.getVehicleName("XUV"));
        printVehicleDetail(v1);

    }
    public static void printVehicleDetail(Vehicle vehicle){
        System.out.println(vehicle.getSeatingCapacity());
    }
```

Here there is no null check. If we pass `printVehicleDetail(null);` This will give NullPointerException.

One way to solve it by using if check.
```java
public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        System.out.println(v1.getVehicleName("XUV"));
        printVehicleDetail(v1);

        }
public static void printVehicleDetail(Vehicle vehicle){
    if(v1!=null)
        System.out.println(vehicle.getSeatingCapacity());
        }
```
There will be multiple object and that way it will be difficult to create multiple if check.

### How the designPattern solves the problem.

- Return NullObject in place of Null.
- The NullObject will be either return nothing or return the default behaviour.

In the example we have used the Factory design and created Factory and it will call the class based on the input.