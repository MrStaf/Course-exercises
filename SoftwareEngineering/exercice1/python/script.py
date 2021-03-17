#!/usr/bin/env python3

# Super class
class Person():
    # Calling the constructor
    def __init__(self, _name='', _age=0):
        self.name = _name
        self.age = _age
    
    # Super definition of printInfo
    def printInfo(self):
        print("I'm "+str(self.name)+" and I'm "+str(self.age)+" years old.")

# Child Classes
class Student(Person):
    def __init__(self, _name, _age, _uni='', _student_id=None, _avg_grade=''):
        super().__init__(_name, _age)
        self.uni = _uni
        self.student_id = _student_id
        self.avg_grade = _avg_grade
    
    def printInfo(self):
        # Call the printInfo which comes from Person 
        super().printInfo()
        print("My university is {}, I'm the student n°{} with {} average grade.\n".format(self.uni, self.student_id, self.avg_grade))

class Tutor(Person):
    def __init__(self, _name, _age, _position='', _department=None, _salary=''):
        super().__init__(_name, _age)
        self.position = _position
        self.department = _department
        self.salary = _salary
    
    def printInfo(self):
        # Call the printInfo which comes from Person 
        super().printInfo()
        print("My position is {}, I'm in the {} department with ${} salary.\n".format(self.position, self.department, self.salary))

# Main

me = Student('Benoît', 20, 'ECE Paris', 25565, 'B')
tutor = Tutor('Michel', 42, 'Professor', 'AI', 75000)

me.printInfo()
tutor.printInfo()

arr = [
    me,
    tutor
]

for el in arr:
    el.printInfo()

