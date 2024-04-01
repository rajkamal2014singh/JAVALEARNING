package com.FileHandling_21;
/** ByteArrayOutputStream
 * It is used to write common data into multiple files. It writes the data as a byte array.
 * It holds the copy of a data into its buffer and the  writes it to the one or multiple
 * files.
 * The size of buffer will grow automatically as the data grows.
 *
 * */
import java.io.*;
import java.util.*;
public class FIleHandling_3 {
    public static void main(String s[]) {
        try {
            FileOutputStream fout1 = new FileOutputStream("bytearrayex1.txt");//specify the file name
            FileOutputStream fout2 = new FileOutputStream("bytearrayex2.txt");

            ByteArrayOutputStream bout = new ByteArrayOutputStream();

            bout.write(65);
            bout.writeTo(fout1);
            bout.writeTo(fout2);

            bout.flush();
        } catch (Exception e) {
        }
        System.out.println("written sucessfully");
    }
}
