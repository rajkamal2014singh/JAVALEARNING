package com.WrapperClass_16;
/** Wrapper class in java
 * 1.It is used to convert the primitive data type into object and vice versa.
 * There are eight primitive data type so there are 8 wrapper class
 * boolean -> Boolean, int -> Integer etc..
 * 2.It is useful because many functions/method are available only for objects not
 * for primitive data type.
 * */
public class int_to_String {
    public static void main(String args[])
    {
        int i =10;
        String s = String.valueOf(i);
        String t = Integer.toString(i);

        System.out.println("Value of i+10 = " + (i+10));
        System.out.println("Value of s+10 = " + (s+10));
        System.out.println("Value of t+10 = " + (t+10));

    }
}
//previous finalize method
//next ExceptionHandling