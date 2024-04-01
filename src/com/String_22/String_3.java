package com.String_22;
/**  Some methods of the String class :
 * 1. length() : This method returns the length of the string
 * 2. toUpperCase() : This method returns the string by converting it into the Uppercase.
 * 3. toLowerCase() : This method returns the string by converting it into lowercase.
 * 4. trim() : This method trims(deletes) the space before and after the string.
 * 5. startsWith() : This method returns true if a string has started by a given substring.
 * 6. endsWith() : This method returns true if a string has ended by a given substring.
 * 7. charAt() : This method returns true if a string  has ended by a given substring.
 * */
public class String_3 {
    public static void main(String s[]){
        String str = "     Hello Java";

        System.out.println("Length of the string is = " + str.length());
        System.out.println("Uppercase of the string is = " + str.toUpperCase());
        System.out.println("Lowercase of the string is = " + str.toLowerCase());
        System.out.println("Trimming the string  = " + str.length());
        System.out.println("Does string start with H = " + str.startsWith("H"));
        System.out.println("Does string ends with a = " + str.endsWith("a"));
        System.out.println("Char at 3 is = " + str.charAt(9));
        //Actual string is not changed to update use : str = str.method();
        System.out.println("Length of the string is = " + str.length());
    }
}
