package com.Constructor_3;
/**
 * 1.It is used to refer to class variables.
 * 2.If same name of variable we use this.
 * */

public class thisKeyword
{
    int x;
    public thisKeyword()
    {
        x = 7;                      //class variable
    }
    public void display()
    {
        int x = 50;
        System.out.println("Local Variable x = " + x);
        System.out.println("Class Variable x = " + this.x);
    }
    public static void main(String args[])
    {
        thisKeyword obj = new thisKeyword();
        obj.display();
    }
}
//previous Constructor
//next MethodOverloading
