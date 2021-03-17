# Exercice 3

## Part 1 (object oriented programming - inheritance, polymorphy, Java specifics - classes and interfaces)

Define a simple class hierarchy with the following classes: *Person, Student, Employee*.
- The three classes must define the following attributes:
    - *Person* must have attributes for age and name.
    - *Student* must add attributes for university, degree (BSc, MSc or PhD) and course name.
    - *Employee* must add attributes for position (e.g. "professor", "assoc. professor", "accountant", etc.) and salary.
- All classes must have initializing constructors. An *initializing constructor* is a constructor, which has a formal parameter for each attribute and is used to set meaningful values upon object creation. For example, here is what the creation of an object of *Employee* should look like (the employee's name is John, he is 38 years of age, assistant professor with a salary of 800 (the currency is not important)):
    ```
    Employee e1 = new Employee("John", 38, "Assistant Prof", 800);
    ```
- Declare an interface, named *Printable*, with two methods:
    ```
    void printToScreen();
    void printToPrinter();
    ```
- Implement the interface throughout the Person/Student/Employee hierarchy, such that each object of any class writes all of its attributes to the screen; ignore the possibility for printing to a printer.
- Define an array with three elements and fill it with an object of each class. Write a for loop which iterates through the array and calls *printToScreen()* on each object.