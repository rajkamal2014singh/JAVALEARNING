package com.MethodOverloading_4;
/**
 * 1.If we want to make method with the same name method overloading is done.
 * 2.When we declare two or more methods of same name within a class then it is called method overloading.
 * 3.Method should be differentiable by, Argument type or no. of Arguments or order of Argument.
 * 4.Return type does not affect the concept of method overloading
 * */
//same name methods but parameters differ
class Overloading
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public float add(float a,float b)
    {
        return a+b;
    }
}
public class MethodOverloading
{
    public static void main(String args[])
    {
        int sum2,sum3;
        float fsum2;
        Overloading obj = new Overloading();

        sum2 = obj.add(34,5665);
        sum3 = obj.add(23,545,2323);
        fsum2 = obj.add(34.3434f,67.8787f);         //to convert to float from double use f

        System.out.println("The sum of two integers is : " + sum2);
        System.out.println("The sum of three integers is : " + sum3);
        System.out.println("The sum of two floating point numbers is : " + fsum2);

    }
}
//previous constructor
//next Array