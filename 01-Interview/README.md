# Interview Questions
A list of commonly asked interview questions

1. What is platform independence ?
**WORA** : Write Once Reuse Anywhere, i.e I write the code in Mac and other OS will be having their own JVM that will intepret the .class file and the same code can be used there as well.

2. Whys is Java so popular ?
    - Because Java is platform independent
    - Because it is purely Object Oriented

3. Diff b/w C++ and Java
    - Pointers : In C++ we know the address of the variable where it is stored. In Java we don't have pointers and we can't reference the address of a variable.
    - Structures and Unions : These are available in C++ whereas in Java we have Class(Structres + Methods) and Objects.
    - Memory Management vs Garbage Collection : In C++ we can manage the amount of memory we want, i.e we can dynamically allocate the amount of memory required for something. In Java there is nothing like this because all the memory related things are automated and taken care by the JVM and there is a Garbage Collection, this is done by the JVM. E.g : In java whenever I allocate an object I don't need to deallocate it.
    - Multiple Inheritence :  In Java we don't have multiple inheritence whereas C++ supports it. In java we can implement multiple interfaces but cannot extend multiple classes
    - Java is fully/pure Object Oriented Language.

4. What is an Object Oriented Language ?
    - Encapsulation : Data and Methods of the same class will be allowed to change the values of the variables of that class. We keep the data and the methods that act on the data together.
    - Abstraction : Hiding the complexity. Only what is needed by the user should be visible to them. 
    - Inheritence : One class can inherit all the variable and methods from the parent class.
    - Polymorphism : Same code, different behaviour

5. What are the advantages of OOPS ?
    - Domain Mapping : All the code are wrapped inside a bigger domain
    - Reuse : We reuse the code.

6. Pass by Value vs Pass by Reference ?
If we send a value in the parameters of the function, its value doesn't change(pass by value), whereas if we pass an object the value changes(pass by reference).

7. String vs StringBuffer vs StringBuilder
    - Immutable : The content of this cannot be changed once we have the value in it.(String) StringBuffer is not immutable.
    - StringBuilder is not synchronized
    - Performance : StringBuffer is good because it is mutable and no new objects will be created in the process.

8. 