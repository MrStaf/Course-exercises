#include "headers/person.h"
#include <stdio.h>

Person* person_constructor(Person* person, char* name, int* age)
{
    person->name = name;
    person->age = age;
    person->printInfo = printInfo;
}

void printInfo(Person* person)
{
    printf("My name is %s and I'm %d years old.", person->name, person->age);
}