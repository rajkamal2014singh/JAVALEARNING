package com.FileHandling_21;
/**
 *  PrintWriter class : It is also used to write/print data to output stream. We can
 *  also print the data to our console using this class.
 *
 * */
//WAP in java to print a string on console using PrintWriter class.

import java.io.*;
public class FIleHandling_4 {
    public static void main(String s[]){
        try {
            File f = new File("F:\\printwriter.txt");       //without using system.out
            PrintWriter pw = new PrintWriter(f);
            //PrintWriter pw = new PrintWriter(System.out);             //using system.out
            pw.write("Hello, This is printed using PrintWriter class");
            pw.flush();
            pw.close();
        }catch (Exception e){}
    }
}
