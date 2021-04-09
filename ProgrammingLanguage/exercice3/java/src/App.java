// Interface
interface Printable {
    public void printToScreen();
    public void printToPrinter();
}

// Person class
class Person implements Printable{
    String name;
    Integer age;
    Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    public void printToScreen() {
        System.out.println("\nName: "+ name);
        System.out.println("Age: "+ age);
    }
    @Override
    public void printToPrinter() {

    }
}

// Extended class
class Student extends Person{
    String uni;
    String degree;
    String courseName;
    Student(String name, Integer age, String uni, String degree, String courseName){
        // Extends from Person
        super(name, age);

        // Custom behavior
        this.uni = uni;
        this.degree = degree;
        this.courseName = courseName;
    }
    @Override
    public void printToScreen() {
        // Extends from Person
        super.printToScreen();

        // Custom behavior
        System.out.println("Uni: "+ uni);
        System.out.println("Degree: "+ degree);
        System.out.println("Course name: "+ courseName);
    }
}

class Employee extends Person{
    String position;
    Integer salary;
    Employee(String name, Integer age, String position,Integer salary){
        // Extends from Person
        super(name, age);

        // Custom behavior
        this.position = position;
        this.salary = salary;
    }
    @Override
    public void printToScreen() {
        // Extends from Person
        super.printToScreen();

        // Custom behavior
        System.out.println("Position: "+ position);
        System.out.println("Salary: "+ salary);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Printable array[] = {
            new Student("Benoît", 20, "ECE Paris", "BSc", "Programming Language"),
            new Person("Michel", 41),
            new Employee("Luci", 999, "Prof", 50000),
        };
        for (Printable pers:array){
            pers.printToScreen();
        }
    }
}
