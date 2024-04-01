package com.SuperKey_8;

//access the overidded variable in the derived class using superKey word
/** super keyword in java
 * super keyword in java will be used for following tasks ;
 * 1.super keyword is used to refer immediate base class variable.
 * 2.super keyword is used to call immediate base class method.
 * 3.super() is used to execute base class constructor.
 * */
class A
{
    String colour = "Black";
}
class B extends A
{
    String colour = "Blue";
    public B()
    {
        System.out.println("Colour(derived class)= " + colour);
        System.out.println("Colour(base class)= " + super.colour);

    }
}
public class superVariable
{
    public static void main(String args[])
    {
        B obj = new B();
    }
}
