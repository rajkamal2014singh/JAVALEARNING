package com.SuperKey_8;

//in case of parameterized constructor base class constructor is not called instead derived is only called so we use super method to call base class
class A2
{
    int x;
    public A2(int x)
    {
       this.x = x;
    }
}
class B2 extends A2
{
    int y;                      //if default constructor is used super() is present there by default.
    public B2(int x,int y)
    {
        super(x);                                   //in case of parameterized constructor these methods are used we must pass value
        this.y = y;
    }
    public void show()
    {
        System.out.println("Value of x = " + x);
        System.out.println("Value of y = " + y);
    }
}

class C2 extends B2
{
    int z;
    public C2(int x, int y,int z)
    {
        super(x,y);
        this.z = z;
    }
    public void show()
    {
        System.out.println("Value of x = " + x);
        System.out.println("Value of y = " + y);
        System.out.println("Value of z = " + z);
    }
}

public class superMethod
{
    public static void main(String args[])
    {
        C2 obj = new C2(8,13,32);
        obj.show();
    }
}

//previous Inheritance
//next MethodOverriding
