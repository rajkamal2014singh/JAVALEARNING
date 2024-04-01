package com.WrapperClass_16;
//Wrapper class is used to convert primitive datatype to object and vice versa
//autoboxing


public class primitive_to_Object
{
    public static void main(String args[]) {
        int i = 10;
        Integer a = Integer.valueOf(i);
        Integer b = i;    //Or easy way upper work done automatically //autoboxing
        Integer c = new Integer(15);    //here it is a object not integer
        System.out.println("Value of i = " + i);
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
        System.out.println("Value of c = " + c);

    }

}
