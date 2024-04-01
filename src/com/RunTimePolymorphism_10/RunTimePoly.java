package com.RunTimePolymorphism_10;
/**
    Run time Polymorphism or dynamic polymorphism
     When method invocation is decided at run time rather than compile time then it is known as run time polymorphism.
    Concept of Upcasting to achieve run time polymorphism
    We refer to subclass object while declaring base class object then it is known as upcasting.
 **/

//class A
//{
//    //statements
//}
//class B extends A
//{
//    //statements
//}
//class example
//{
//    public static void main(String args[])
//    {
//        A obj = new B();                                                //UPCASTING Example
//    }
//  }

class bank
{
    float getInterest()
    {
        return 5.3f;
    }
}
class sbi extends bank
{
    float getInterest()
    {
        return 7.3f;
    }
}
class icici extends bank
{
    float getInterest()
    {
        return 5.29f;
    }
}
class pnb extends bank
{
    float getInterest()
    {
        return 6.8f;
    }
}
public class RunTimePoly
{
    public static void main(String args[])
    {
        bank obj = new bank();
        System.out.println("Rate of Interest = " + obj.getInterest());

        obj = new sbi();                    //upcasting
        System.out.println("Rate of Interest = " + obj.getInterest());

        obj = new icici();
        System.out.println("Rate of Interest = " + obj.getInterest());

        obj = new pnb();
        System.out.println("Rate of Interest = " + obj.getInterest());

    }
}
//previous methodOverriding
//next FinalKeyWord