package com.StaticKeyword_6;
/**
 * Static keyword in java
 * 1.It is used with method and variable both
 * 2.Static keyword in java is generally used for memory management.
 * 3.Static keyword can be applied on a variable or on a method.
 * 4.static variable or method will be a part of class only.
 *
 * Static variable
 * 1.If we make any variable static then it will retain its previous value.
 * 2.The static variable will be a part of class itself. The memory will be allocated only once.
 *
 * Static method
 * 1.If we make any method static then it can be accessed without using any object.
 * 2.It becomes a part of class only
 * 3.It can modify static variable.
 * */
class Methods
{
    static int x = 0;
    public static void change()
    {
        x = 3;
        System.out.println("Value of x = " + x);
    }
    public static void display()
    {
      System.out.println("This is a example of static method");
    }
}

public class staticMethod
{
    public static void main(String args[])
    {
        Methods.display();                      //directly using a static method without creating a object
        Methods.change();
       // System.out.println("Value of x = " + Methods.x);
    }
}
//previous Array
//next Inheritance
