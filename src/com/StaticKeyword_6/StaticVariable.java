package com.StaticKeyword_6;

//static variable is allocated memory directly at once
//We can directly access static variable we dont need a object to access static variable
//only static method can modify a static variable
class SVariable
{
    int Id;
    String name;
    static String College = "NIT Srinagar";             //for every object college String is NIT Srinagar

    public void set(int Id, String name)
    {
        this.Id = Id;
        this.name = name;
    }
    public void display()
    {
        System.out.println("Id : " + Id + " Name : " + name + " College + " + College);
    }
}

//class Counter
//{
//
//}

public class StaticVariable
{
    static int count = 0;
    public StaticVariable()
    {
        count++;
    }               //object counter
    public static void main(String args[])
    {
        SVariable obj = new SVariable();
        obj.set(23,"Shaurya");
        obj.display();

        StaticVariable obj1 =  new StaticVariable();
        StaticVariable Obj2 = new StaticVariable();
        StaticVariable obj3 = new StaticVariable();
        System.out.println("No of times object created is : " + count);            //if it is not static it will show 1
        //static member can be accessed without any object
    }
}
