package com.Inheritance_7;
/**
 * 1.Inheritance is a mechanism in which one class inherits the property of the another class.
 * 2.It supports the code re-usability. The class whose property is inherited is known as base
 * class and the class which inherits the property is known as sub class.
 * 3.Java uses "extends" keyword for inheritance.
 * 4.Types of inheritance in java:
 *      1.Single Inheritance
 *      2.Multilevel inheritance
 *      3.Hierarchical Inheritance
 *
 * 5.Java does not supports the concept of multiple inheritance however we can implement multiple
 *   inheritance concept using interface.
 *
 */
class A
{
    public void display()
    {
        System.out.println("We are in class A");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("We are in class B");
    }
}

public class singleInheritance
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.show();
        obj.display();
    }
}
