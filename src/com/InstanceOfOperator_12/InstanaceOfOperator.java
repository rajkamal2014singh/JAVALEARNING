package com.InstanceOfOperator_12;

/**
 * Instance of operator in java
 * 1.It is an operator which checks whether an object is instance of a class or not. If the object is an instance
 * then it returns true otherwise it returns false.
 * */
//it tells whether the obj created is instanceof that class or not

class A
{

}
class B extends A
{

}
class C extends B
{

}
public class InstanaceOfOperator
{
    public static void main(String args[])
    {
        C obj = new C();
        System.out.println(obj instanceof C);
        System.out.println(obj instanceof B);
        System.out.println(obj instanceof A);
        B obj1 = new B();
        System.out.println(obj1 instanceof C);
        System.out.println(obj1 instanceof B);
        System.out.println(obj1 instanceof A);

        C obj2 = null;
        System.out.println(obj2 instanceof C);
    }
}
//previous finalKeyWord
// next AbstractClass