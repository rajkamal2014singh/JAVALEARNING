package com.FileHandling_21;
//same process will be followed for input stream
import java.io.*;
public class FileHandling_2 {
    public static void main(String s[]){
        String str ="";              //to store in our string
        try {
            FileInputStream fin = new FileInputStream("testInput.txt");
            //here through the file ascii value is returned so we will get byte type of data
            //int i = fin.read();         //only one value/character is read
            //multiple line reading
            int i=0;
            while((i = fin.read())!=-1){
                    System.out.print((char) i);
                    str += (char)i;
            }
            fin.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
//Write a java program to copy the content of the one file to another file.

