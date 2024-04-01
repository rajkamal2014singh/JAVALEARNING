package com.Inheritance_7;
/**
 * a  a
 * |  |
 * b  c    both b and c inherits from a
 * */
class F
{
    public void display()
    {
        System.out.println("We are in class F");
    }
}
class G extends F
{
    public void show()
    {
        System.out.println("We are in class G extends F");
    }
}
class H extends F
{
    public void show()
    {
        System.out.println("We are in class H extends F");
    }
}
public class hierarchical
{
    public static void main(String args[])
    {
        G obj = new G();
        H obj1 = new H();
        obj.display();
        obj.show();
        obj1.display();
        obj1.show();
    }
}
