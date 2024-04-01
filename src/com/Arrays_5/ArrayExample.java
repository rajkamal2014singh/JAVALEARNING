package com.Arrays_5;
/**
 * Array in java
 * Array stores more than one value(homogeneous) of similar type into a single variable.
 * syntax :   datatype[] variable_name;    //array declaration
 * example : int[] x; int []x; int x[];
 *
 * variable_name = new datatype[size];  //memory allocation
 * example : x = new int[5];
 *
 * OR datatype variable_name[] = new datatype[size];
 *
 * */
public class ArrayExample
{
    public static void main(String args[])
    {
        int x[] = new int[5];

        System.out.println("Length of the array = " + x.length );           //length in case of array is a variable
        System.out.print("Values of the array are : ");
        for(int i=0;i<x.length;i++)
        {
            x[i]=i;
            System.out.print(" " + x[i]);
        }
        System.out.println();
    }
}
//previous MethodOverloading
//next static