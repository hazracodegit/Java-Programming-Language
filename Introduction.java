### Programming Paradigms 

A programming paradigm is a style or approach for writing programs. It defines how we think about problems, how programs are structured and organised.
Types of Programming Paradigms:
1. Procedural-Oriented Programming Paradigm (POP)
2. Object Oriented Programming Paradigm (OOP)
------------------------------------------------------------------------------------------------------------------------------------------
Procedural Oriented Programming Paradigm :
     *  Procedural Oriented Programming is a programming paradigm in which the entire program is written and divided into
            certain reusable blocks called functions/procedures and these specific blocks perform specific tasks.
     *  Program is broken into small reusable functions. Each function performs a specific task.
     *  Global Data Sharing: 
            -----> Data is often shared globally
            -----> Multiple functions can access the same data
     *  No Data Security: 
            -----> No strict access control
            -----> Data is not protected
            -----> Any function can modify data
  Example of POP program:
#include <stdio.h>

int add(int a, int b) {
    return a + b;
}

int main() {
    int x = 10, y = 20;
    int sum = add(x, y);
    printf("Sum = %d", sum);
    return 0;
}
-------------------------------------------------------------------------------------------------------------------------------------------------------
  Object Oriented Programming Paradigm:
         *  Object-Oriented Programming paradigm is a programming paradigm which deals with the real-world objects and in OOP everything is
                treated as an object.
         *  OOP is a programming approach where a program is organized around objects, and each object contains data (variables) and behavior (methods).
         *  Provides security and hides the data through the OOP principles.
         *  Code Reusability
------------------------------------------------------------------------------------------------------------------------------------------------------
  Classes :
         *  A class is a blueprint or template or logical construct which is used to create objects.
         *  A class can be used to create our own datatype.
                  -----> A class is a user-defined data type used to create objects that can store multiple types of data and methods together.
                                        class Student {
                                                 int id;
                                                 String name;
                                            }
                    // Student is now a new datatype

         *  A class contains variables and methods.
                 -----> attributes, fields, properties, variables, data, data members
                 -----> methods, behaviour, actions
         * Any class can be created using a keyword 'class'.
              Structure of a class:
                       class Class_Name{
                           // variables
                           // methods
                       }
         *  Class_Name should start with a uppercase letter and should be same as the file name.
      Examples : Phone, Car, Laptop are the examples of the classes.
            Properties of Phone: colour, dimensions, storage capacity
            Actions: torch on and off, 
            Objects: vivo phone, oppo phone, apple phone
    ****** A class is a user-defined data type that groups variables and methods into a single unit and is used to create objects.
    * class does not exists physically its just a structure, an object is a physical thing that oocupies space and built from a class.
------------------------------------------------------------------------------------------------------------------------------------------------
  Object: 
        *  An Object is a real-world entity and an instance of a class that is created from a class that has memory.
        *  Basically, an Object has 3 essential properties.
                -----> State of the Object: data members, variables
                -----> Identity of the Object: reference variable(present in stack), points to the object stored in the heap
                -----> Behaviour of the Object: methods
  Syntax to create an Object:  Class_Name reference_variable = new Class_Name();
        *  we will access the properties and methods using the dot operator.
New Keyword: 
        * new Keyword is used for creating objects in the heap memory.
        *  It dynamically allocates the memory for the objects and returns the reference to that object.
       Student s1;  // just declaring the reference variables initially points to null
        s1 = new Student() // object is created in the heap and the reference to that object is stored in s1.
            s1 points to the object in the heap.
         *  Reference variable s1 is stored in the stack memory.
          Student s1 // happens compile time declaration
           s1 = new Student() // allocation and object creation happens at run-time
          when an object is created - it means that it is instantiated


        


