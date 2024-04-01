package com.FileHandling_21;
/**  FileWriter : This class is used to wtite character oriented data to the file.
 *   Unlike FileOutputStream class, we need not have to convert the string into byte array.
 *
 *
 * */
import javax.swing.tree.ExpandVetoException;
import java.io.*;
public class FileHandlig_5 {
    public static void main(String s[]){
        String str = "This class is used to write character oriented data to the file.";
        try {
            FileWriter fw = new FileWriter("F:\\fileWriterexample.txt");
            fw.write(str);
            fw.close();
            System.out.println("Data written sucessfully");
        }catch(Exception e){}
    }
}
