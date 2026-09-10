There is a collection and using array and then it was changed to list then the fetch like arr[i] will not work in arrayList. 

The mechanism of accessing the element will be changed. Without the iterator pattern the client code needs to understand how the collection is structured and he different collection need different method to traverse.

The code will show that the file with any change will not work.

The Iterator pattern solves the problem.
It uses the common interface that is used by all collections.


The BookIterator class is a nested class and the BookCollection class has a method to return the Iterator.
The Iterator pattern allows for multiple iterator to operate on the same collection and performing concurrent traversal.

The code explain the structure and any change in the collection the BookCollection class will work like the get element or the next element and the main class will not make any change.