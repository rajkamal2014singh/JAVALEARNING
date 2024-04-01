package com.FileHandling_21;
/**
 *  FileReader : It is used to read the content of a file.
 * */
import java.io.*;
public class fileHandling_6 {
    public static void main(String s[]){
        String str = "";
        try{
           FileReader fr = new FileReader("F:\\filewriterexapmle.txt");
           int i = 0;
           while((i=fr.read())!=-1) {
               str = str + (char) i;
           }
           fr.close();
        }catch(Exception e){}
    }
}

