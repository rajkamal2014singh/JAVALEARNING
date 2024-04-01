package com.String_22;
/** String Buffer :
 *  This class in Java is used to create a mutable string object which means
 *  that we can change the value of the string.
 *  Its size is growable. It is used when we have to make/perform a lot of
 *  modification to our string.
 *
 *  This class has four constructor :
 *  1. StringBuffer() - It does not take any argument. It creates an empty
 *  string buffer with initial size 16.
 *  2.  StringBuffer(int size) : this will create an empty buffer of the given size.
 *  3. StringBuffer(String str) : It will create a string buffer for given string.
 *  4. StringBuffer(CharSequence[] ch) : It will create a string buffer for givem
 *  CharSequence array.
 * */

//Difference in String and StringBuffer class
public class String_6 {
    public static void main(String s[]){
        String str1 = "hello";
        StringBuffer str2 = new StringBuffer("Hello");
        StringBuilder str = new StringBuilder("hi");

        str1.concat(" Java");
        str2.append(" Java");
        System.out.println(str1);   //immutable so not updated
        System.out.println(str2);
    }
}
