### Sales Management System.

Implemnet a sales Management system that allows one to track the sales at various in levels in an organisation.

Here we have a company that sells snacks food item and beverages at retail outlets. Flats are all over India. Want to have a system that tracks sales details at following levels store city state all India.
As an example stores sell following items
Food items sandwich boha varappa burger
Beverages tea coffee water. Text line

The system mainly tracks following things price of items on the menu prices will vary across cities within cities the prices will remain the same.
Stock level at a particular store.
Number of units sold at a given store.

No need to think about the database store we can think of it as an in memory store for now. The prices of the product can be hard coded as of now.
Make a working code of the design.


Beginning - Store class and it will encapsulate the Store.
```java
class Store{
  String id;
  Map<Integer, Integer> foodSupply; // Maps enum to an integer.
  Map<Integer, Integer> beverageSupply;
  Map<Integer, Integer> foodRates;
  Map<Integer, Integer> foodUnitSold;
  Map<Integer, Integer> beverageRates;
  Map<Integer, Integer> beverageUnitSold;

  Store(List<Pair<Integer, Integer> food,List<Pair<Integer, Integer> beverage){
      
  } 


  String getUniqueId();
  static void purchaseFood(){
  // purchase the item available and return void.
  }
  static void purchaseBeverage(){
  // purchase beverage available
  }
}
```

purchase can be a separate class and food and beverage inside the class.
```java
class City{
  String id;
  Map<Integer, Integer> foodPrices; // prices remain constant across city. Store will read the price from the city class.
  Map<Integer, Integer> beveragePrices;
  List<Store> store; // City will keep a track of the Store in the city.
}
```

```java
class State{
  String id;  
  // State has many city.
  List<City> city;
}
```

```java
class System{
  //System keeps track of the state.
  List<State> state;
  static void purchaseFood(){
  // purchase the item available and return void.
  }
  static void purchaseBeverage(){
  // purchase beverage available
  }
}
```

```java
enum FoodItem{
  Sandwich, Pizza, Burger;
}
enum BeverageItem{
  Tea, Coffee, Water;
}
```

