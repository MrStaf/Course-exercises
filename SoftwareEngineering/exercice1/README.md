# Exercice 1 

## Using any OOP language do the following:
1. Create a simple class hierarchy, including the following classes: Person, Student, Tutor. Tutor and Student must be subclasses of Person.
Let the classes have the following attributes:
Person: name, age
Student: university, student_id, average_grade
Tutor: position, department, salary
Choose suitable data types for the attributes.
2. Supply two constructors for each class: initializing and default. An initializing constructor is a constructor, which provides values for all attributes. A default constructor is a constructor with no parameters.
3. All classes must have a method for writing out all the information, known to the respective objects, i.e. name, age, university, etc. The method must be polymorphic, i.e. it must have the same signature for all classes and must be overridden in each subclass. Let its declaration look like this:
```
void printInfo();
```
>The above declaration is in C++/Java, you can change it, if you are using a different programming language.
>Write the information in the console, or if you hate the console very much, provide a GUI (Graphical User Interface).
4. In your main program/function, create two objects of each class and call printInfo() on each; you would have to do it in 6 separate calls.
5. Now create an array with 6 elements and place your objects into the array. Choose an appropriate base type for the array, so that you can iterate through the array (e.g. by means of a for-loop) and call printInfo() only once, within the body of the for-loop. This should demonstrate the value of polymorphism.
