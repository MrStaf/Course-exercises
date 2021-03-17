# Exercice 2

## Part 1 (arrays)

1. Create a new Java project and add to it the supplied files TriagPrint.java and Matrix.java. You can add them to the project by means of drag-and-drop from Windows File Explorer onto the 'src' folder of your new project (be sure to select the 'Copy files' radio-button in the next dialog). Compile and run the project. It illustrates the creation and usage of arrays in Java. Note the somehow exotic array - it is not rectangular (i.e. there is a different number of columns in each row); this is not possible in all programming languages.
2. Add a method (member-function) to the TriagPrint class, which calculates and returns the average value of each row of a two-dimensional array. Do not write anything to the console from this method - just calculate and return the values as an array (a one-dimensional array, also called a vector). Now call this method so that it calculates the averages for the triag array from the sample code. Lastly, write these averages into the console. Writing to the console from java is done by means of System.out.println(...), you can see examples of using this in the sample code.

## Part 2 (standard classes for strings)

Write a console application, which defines two strings: String s1 = "Hello" and s2 = "World". Write some code, which concatenates the two strings, and then reverses the result and outputs it to the console (so, "dlroW olleH" should appear in the console window).
> Hints:
> - For this (and other) problems, avoid ready solutions, e.g. from StackOverflow or similar sites. They are, of course, very useful, but basic things like this you should learn to do on your own.
> - There is a method, StringBuffer.reverse(), which does exactly what is needed, but the strings are objects of class String, not StringBuffer.
> - Standard typecasting between String and StringBuffer will not work, because the two classes are not related by inheritance.
> - Look at the constructors of the two classes. Use the online documentation; you can get there if you search for "java string" in any decent search engine. This should give you an idea of how to change from String to StringBuffer.
The aim of this problem is not to write "dlrow olleH" in the console; the aim is to learn how objects can be 'converted' from one class to another. In this case you need to convert from String to StringBuffer, and possibly back, but the same model is widely used across the JDK.

## Part 3 (basic object oriented programming)

1. Create a class for an incremental counter (counting 0, 1, 2, ...), named Counter. It should have a private attribute cnt, representing its current value, a constructor, which sets cnt to zero, and two methods, increment() and getValue(). What the methods do should be clear by their names.
2. Complete the following code fragment, using your Counter class. The fragment simulates tossing of a coin 100 times and counts the number of heads and tails, by using two instances (objects) of class Counter.
```
Counter headCount, tailCount;
tailCount = new Counter();
headCount = new Counter();
for ( int flip = 0; flip < 100; flip++ ) {
if (Math.random() < 0.5) ________________ ; // Count a "head".
else ________________ ; // Count a "tail".
}
System.out.println("There were " +_________________+" heads.");
System.out.println("There were " +_________________+" tails.");
```
3. Make the cnt attribute static and rerun the program. Explain the result.
