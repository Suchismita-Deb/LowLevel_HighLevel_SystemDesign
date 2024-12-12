### Single Responsibility Principle.

A class should have only one reason to change.

When we do the autowire or injection. It means **HAS-A**.
In the problematic code there are two functions going inside the Invoice class. There are two reason to change the class.

Rule - A class should have only one reason to change.

Here we can make another class to print the invoice.