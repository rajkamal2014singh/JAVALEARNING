package com.SuperKey_8;

//to call the method of the base class
class A1
{
    public void test()
    {
        System.out.println("We are in A1");
    }
}
class B1 extends A1
{
    public void test()
    {
        super.test();
        System.out.println("We are in B1");
    }
}
public class superKeyWithMethod {
    public static void main(String args[])
    {
        B1 obj = new B1();
        obj.test();                             //this is used in case of overridden functions to able to call the function of base class also
    }
}
//previous Inheritance
//next MethodOverriding
