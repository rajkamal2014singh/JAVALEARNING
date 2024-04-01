package com.FileHandling_21;
/** File Handling in Java
 *  Java uses the concept of streams to make I/O operation.
 *  All teh stream related classes are available in java.io package.
 *  Stream : It is sequence  of data.
 *  3 streams are created automatically and attached with console.
 *  1.System.out : It is used to write data on console.
 *  2.System.err : It is used to print error message on console.
 *  3.System.in : It is used to take input from keyboard.
 *
 *  Example :(To use these types we don't need to import any package)
 *  System.out.println("hello");
 *
 *  int x = System.in.read();           //takes input in form of ascii value no need to import any package
 *  System.out.println(char(x));
 *
 *  System.out.err("Error message");
 *
 *  FileOutputStream and FileInputStream class :
 *  (Input Stream)ways to take (fetch data) read or input data : File,Console,Socket
 *  (Output Stream)ways to write or output data : File,Console, Socket
 *
 *  FileOutputStream is used to write data into file. It can write byte data(preferred).
 *  We can also write a string data but we do not prefer it.
 *  write() method is used to write data.
 *
 *  Example :
 *
 * */
import java.io.*;
public class FileHandling_1 {
    public static void main(String s[]){
        try {
            FileOutputStream out = new FileOutputStream("text1.txt");
            //if the specified file contains some string earlier then it gets over written
            String str = "This is Java Program";
            //out.write(65)      //so it writes A whose ascii value is 65
            byte b[] = str.getBytes();
            //characters ascii values will be written in file
            out.write(b);
            out.close();
            System.out.println("data written successfully");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
//prev MultiThreading
//next String
