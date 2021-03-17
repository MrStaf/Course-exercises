// import java.lang.reflect.Constructor;
import java.util.*;  
class Person {
    int age;
    String name;
    Person(String n, int a) {
        this.name = n;
        this.age = a;
    }
    void printInfo() {
        System.out.println("I'm "+this.name+" and I'm "+this.age +" years old.");
    }
}

class Student extends Person {
    String uni;
    int student_id;
    String avg_grade;
    Student(String n, int a, String uni, int student_id, String avg_grade){
        // extends from Person
        super(n, a);

        // Custom behavior
        this.uni = uni;
        this.student_id = student_id;
        this.avg_grade = avg_grade;
    }
    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("My university is "+this.uni+", I'm the student n° "+this.student_id+" with "+this.avg_grade+" average grade.\n");
    }
}

class Tutor extends Person {
    String position;
    String department;
    int salary;
    Tutor(String n, int a, String position, String department, int salary){
        // extends from Person
        super(n, a);

        // Custom behavior
        this.position = position;
        this.department = department;
        this.salary = salary;
    }
    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("My position is "+this.position+", I'm in the "+this.department+" department with $"+this.salary+" salary.\n");
    }
}

public class App {

    public static void main(String[] args) throws Exception {
        Student me = new Student("Benoit", 20, "ECE Paris", 25565, "B");
        me.printInfo();
        Tutor tutor = new Tutor("Michel", 42, "Professor", "AI", 75000);
        tutor.printInfo();
        List<Person> list = new ArrayList<Person>();
        list.add(me);
        list.add(tutor);

        for (Person i:list){
            i.printInfo();
        }
    }
}
