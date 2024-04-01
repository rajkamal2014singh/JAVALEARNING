package com.Inheritance_7;

class C
{
    public void display()
    {
        System.out.println("We are in class C");
    }
}
class D extends C
{
    public void show()
    {
        System.out.println("We are in class D");
    }
}
class E extends D
{
    public void printing()
    {
        System.out.println("We are in class E");
    }
}

public class multiLevel
{
    public static void main(String args[])
    {
        E obj = new E();
        obj.display();
        obj.show();
        obj.printing();
    }
}
