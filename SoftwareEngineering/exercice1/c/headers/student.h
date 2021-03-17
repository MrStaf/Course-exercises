#ifndef STUDENT_H
#define STUDENT_H
#include "person.h"

typedef struct STUDENT_STRUCT 
{
    Person base;
    void* (*printInfo)(Person* person);
} Student;

Student* new_student(char* name, int* age);
#endif