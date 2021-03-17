#include <iostream>
using namespace std;

class Person {
    public:
        string name;
        int age;
        Person(string n, int a)
        {
            name = n;
            age = a;
        }
        void printInfo()
        {
            cout << "My name is " << name << " and I'm " << age << " years old." << endl;
        }
};

class Student : public Person {
    public:
        string uni;
        int student_id;
        string avg_grade;
        Student(string name, int age, string uni, int student_id, string avg_grade): Person(name, age), uni{uni}, student_id{student_id}, avg_grade{avg_grade}{

        }
        void printInfo()
        {
            Person::printInfo();
            cout << "My university is " << uni << ", I'm the student n° " << student_id << " with "<< avg_grade <<" average grade.\n" << endl;
        }
};

class Tutor : public Person {
    public:
        string position;
        string department;
        int salary;
        Tutor(string name, int age, string position, string department, int salary): Person(name, age), position{position}, department{department}, salary{salary}{

        }
        void printInfo()
        {
            Person::printInfo();
            cout << "My position is " << position << ", I'm in the " << department << " department with "<< salary <<" salary.\n" << endl;
        }
};



int main() 
{
    Student me("Benoît",20,"ECE Paris", 25565, "B");
    me.printInfo();

    Tutor tutor("Michel", 42, "Professor", "AI", 75000);
    tutor.printInfo();

    return 0;
}