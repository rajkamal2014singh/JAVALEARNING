package com.Interface_14;
/**
 * Interface in java
 * 1.The interface in java is a mechanism to achieve abstraction. There can be only abstract
 * methods in the java interface, not method body. It is used to achieve abstraction and
 * multiple inheritance in java.
 * 2.In other words, we can say that interface can have abstract variable and methods. It cannot
 * have a method body.
 *3.Syntax :
 * interface interface_name
 * {
 *    //declare variable or methods
 *    //If we do not declare a method abstract or variable constant it automatically becomes
 *    //abstract and constant variable
 * }E.g:
 *      interface printable
 *      {
 *          int x=5;
 *          void print();
 *      }
 *      is same as
 *      interface printable{
 *          public static final int x=5;
 *          public abstract void print();
 *      }
 * 4.There can be inheritance in between two interface and class implements interface
 * */
//similar to as abstract class but in these case method is by default abstract type if not initialized and variable is a constant in a
//interface and a interface can extends another interface while classes implements the interface

interface example
{
    public void print();           //if a class implements this method then it must be defined in class
}
public class InterfaceExample01 implements example
{
    public void print()
    {
        System.out.println("Hello");
    }
    public static void main(String args[])
    {
        InterfaceExample01 obj = new InterfaceExample01();
        obj.print();
    }
}
