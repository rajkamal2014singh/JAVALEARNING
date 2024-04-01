package com.MethodOverriding_9;
/**
 * Method Overriding  (Run Time Polymorphism)
 * 1.When we define base class method in derived class then It is known as method overriding.
 * 2.The method name and parameters should be exactly be same.
 * 3.The class should have IS-A relationship.
 * 4.We need minimum two classes to perform method overriding.
 * */
//when methods with same name and same parameters but present in different class and classes are connected using inheritance
//method overloading is also known as compile time polymorphism
// method overriding also known as run time polymorphism


class A
{
    public void test()
    {
        System.out.println("We are present in A");
    }
}
class B extends A
{
    public void test()              //same method name then it is method overriding
    {
        System.out.println("We are present in B");
    }
}

public class methodOverriding {
    public static void main(String args[])
    {
        B obj = new B();
        obj.test();
    }
}
//previous SuperKey
//next RuntimePolymorphism
