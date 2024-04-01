package com.WrapperClass_16;

public class string_to_int
{
    public static void main(String args[])
    {
        String s = "10";
        int i = Integer.parseInt(s);
        Integer j = Integer.valueOf(s);
        System.out.println("Value of (s+10) = " + (s+10));
        System.out.println("Value of (i+10) = " + (i+10));
        System.out.println("Value of (j+10) = " + (j+10));

    }
}
