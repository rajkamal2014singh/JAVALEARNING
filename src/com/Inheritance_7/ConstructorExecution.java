package com.Inheritance_7;
/**
 * 1.Inheritance is a mechanism in which one class inherits the property of the another class.
 * 2.It supports the code re-usability. The class whose property is inherited is known as base class
 * or super class and the class which inherits the property is known as derived class/sub class.
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
//Order of Execution of constructor : By default the constructor of the base class is called first
class X
{
    public X()
    {
      System.out.println("We are in class X ")  ;
    }
}
class Y extends X
{
    public Y()
    {
        System.out.println("We are in class Y ")  ;
    }
}
class Z extends Y
{
    public Z()
    {
        System.out.println("We are in class Z ")  ;
    }
}
public class ConstructorExecution
{
    public static void main(String args[])
    {
        Z obj = new Z();
    }
}
//previous StaticKeyword
//superKey next
