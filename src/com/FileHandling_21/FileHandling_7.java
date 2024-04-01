package com.FileHandling_21;
/*
 *  Copying file
 * */
import java.io.*;
public class FileHandling_7 {
    public static void main(String s[]){
        String str = "";
        try{
            FileReader fr = new FileReader("F:\\filewriterexapmle.txt");
            int i = 0;
            while((i=fr.read())!=-1) {
                str = str + (char) i;
            }
            fr.close(); //end of file reading code

            //starting of file writing code
            FileWriter fw = new FileWriter("F:\\filewriterexapmlecopy.txt");
            fw.write(str);
            fw.close();

        }catch(Exception e){}

    }
}
//Refer to lecture 40 for theoratical concepts on file handling

