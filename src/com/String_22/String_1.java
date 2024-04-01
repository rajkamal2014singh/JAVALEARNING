package com.String_22;
/** String in Java :
 *  Strings are the collection of characters. It is enclosed within(" ").
 *  In java, Strings are the objects of string class. it is not a premitive data type.
 *  We can simply create a String object and initialize it.
 *  Strings are imutable in java.
 *  For example :
 *      String str = "hello Java";
 * or
 *      char[] stringexapmle = {'h','e','l','l','o','J','a','v','a'};
 *      String str = new String(stringexapmle);
 *
 * */
public class String_1 {
    public static void main(String s[]){
        String str = "Hello Java";
        System.out.println(str);

        char[] stringexample = {'H','e','l','l','o',' ','J','a','v','a'};
        String str1 = new String(stringexample);
        System.out.println(str1);

    }
}
//prev FileHandling
//next LayoutManager
