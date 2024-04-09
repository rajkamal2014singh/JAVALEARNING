package com.Constructor_3;
/**Constructor in java
 * 1.Constructor is a special method in java which gets automatically executed when object is created.
 * 2.It is generally used to initialize the data in the object.
 * 3.A constructor does not have a return type.
 * 4.There are two types of constructors
 *      (A)Default Constructor : It does not take any argument.
 *      (B)Parameterized Constructor : It takes argument.
 *       with Different number of arguments we can create multiple parameterized constructor
 * 5.The name of the constructor method is same as that of class name
 * */
public class DefaultConstructor
{
    int roll;
    String name;
    public DefaultConstructor()
    {
        roll =1;
        name="RAJ";
    }
    public void display()
    {
        System.out.println("Roll = "+roll);
        System.out.println("Name = "+name);
    }
    public static void main(String[] args) {
        // write your code here
        DefaultConstructor obj=new DefaultConstructor();
        obj.display();
    }
}

