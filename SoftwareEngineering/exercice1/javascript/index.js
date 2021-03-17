class Person {
    constructor(name, age)
    {
        this.name = name;
        this.age = age;
    }
    printInfo() {
        console.log(`I'm ${this.name} and I'm ${this.age} years old.`);
    }
}

class Student extends Person {
    constructor(name, age, uni, student_id, avg_grade)
    {
        // extends from Person
        super(name, age);

        // Custom Behavior
        this.uni = uni;
        this.student_id = student_id;
        this.avg_grade = avg_grade;
    }

    // Default constructor
    default() {
        return new Student()
    }
    printInfo() {
        // Using the printInfo of the parent class
        super.printInfo();

        // Custom behavior of printInfo
        console.log(`My university is ${this.uni}, I'm the student n° ${this.student_id} with ${this.avg_grade} average grade.\n`);
        return
    }
}

class Tutor extends Person {
    constructor(name, age, position, department, salary)
    {
        super(name, age);
        this.position = position;   
        this.department = department;   
        this.salary = salary;   
    }
    // Default constructor
    default() {
        return new Tutor()
    }
    printInfo() {
        super.printInfo();
        console.log(`My position is ${this.position}, I'm in the ${this.department} department with $${this.salary} salary.\n`);
    }
}

const me = new Student('Benoit',20,'ECE Paris',25565,'B');
const tutor1 = new Tutor('Michel', 42, 'Professor', 'AI', 75000);

me.printInfo();
tutor1.printInfo();

const arr = [
    me,
    tutor1
]

arr.map(el => el.printInfo());