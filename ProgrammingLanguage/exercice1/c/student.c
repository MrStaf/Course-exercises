#include "headers/student.h"
#include <stdlib.h>

Student* new_student(char* name, int* age)
{
    Student* student = calloc(1, sizeof(struct STUDENT_STRUCT));
    Person* person = person_constructor((Person*)person, name, age);

    student->printInfo = person->printInfo;
    return student;
}