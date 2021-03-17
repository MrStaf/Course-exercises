#ifndef PERSON_H
#define ANIMAL_H
typedef struct PERSON_STRUCT 
{
    char* name;
    int* age;
    void* (*printInfo)(struct PERSON_STRUCT* self);
} Person;

Person* person_constructor(Person* person, char* name, int*age);

void printInfo(Person* person);
#endif