#include <stdio.h>
#include "headers/student.h"

int main() {
    int age = 20;
    Student* me = new_student("Benoît", &age);
    me->printInfo((Person*) me);
    return(0);
}