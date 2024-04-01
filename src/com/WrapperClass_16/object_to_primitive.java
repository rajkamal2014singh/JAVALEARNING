package com.WrapperClass_16;
//covert object to primitive data type
public class object_to_primitive
{
    public static void main(String args[]) {
        Integer i = new Integer(10);
        int a = i.intValue();
        int b = i;                      //unboxing automatically conversion

        System.out.println("Value of i = " + i);
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
    }
}
