Design Vending Machine.

Similar type of problem can be solved with the State Design Pattern.
Vending Machine having 3 shelf of item. Each items has one code and price.
There is a place for cash insert and button for the Insert. After that there is a number panel for the input of the code of the product.
Then there is one button for cancel or refund.
Then there is one place for getting the cash exchange.
Then there is another place for the product to get.

>>VendingMachine.png

When we observe the happy path scenario of the flow. 
> flowOfVendingMachine.png

In every step it is going to some different state and each state has its own function.
In state 1 like Idle state - The Functions like Insert cash button.
In state 2 like the Has money state - The Functions like Insert coins(user adding the coins for the product), select the product code (after insertion of coin user needs to select the code for the product), cancel/refund button(after adding coins user feels like cancel the order then they willclick on cancel button and the cash will be refund).
In state 3 like Selection state - The Functions like choose the product, cancel the product, return the change coins.
In state 4 like the Dispensing state - The Functions like the product dispensed.
Every state hs some specific functions.
**When there is a specific functions in each state the we have to use State Design Pattern.**
Example - Design Tv (State On, Change Channel, State off).



(When we have multiple class then we have to make object of each class and in this case we can make an interface and implements those class then I can call the interface and make object of these class.)

Structure of the State Design Pattern.
One Product class.
One Interface of State that has the method like Operation1, Operation2... OperationN like that. Now there will be class like for State1 it will only implement operation1 and rest all method will be of default return or rexception. Similarly there will be State2, State3 like that. Say State5 is related to Operation1 and Operation5 then it will onl implement these two operations and rest all will be default.
All the operations has the Product object in the parameter as the operation will change the State of the Product.

The Product class has a State.

There will be one interface of State and that will contain all the method and only the class will implement the specific method.