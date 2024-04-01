package com.String_22;
/*
 * 8. compareTo() : The java string compareTo() method compares the give string with current
 * string. It returns positive number, negative number or 0.
 * If first string is greater than second string, it returns positive number(difference of character
 * value). If first string is less than second string, it returns negative number and if first
 * string is equal to the second string,, it returns 0.
 *
 * Examples :
 *  Abc  <  Bcd   (-ve)
 *  Dbc  >  Bcd     (+ve)
 *  Ddc  >  Dac     (+ve)       (based on second character as first is same)
 *  Dac  <  Ddc     (-ve)
 *  Dac  =  Dac     (0)
 */
public class String_4 {
    public static void main(String s[]){
        String s1 = "dac";
        String s2 = "ddc";
        String s3 = "abd";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
    }
}

