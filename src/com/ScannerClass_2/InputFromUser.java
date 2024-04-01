package com.ScannerClass_2;

import java.util.Scanner;         //to use scanner class we must import these class

/**
 * We create a instance of scanner class to use the functionality of Scanner class
 * methods for user input of different data types are :- 1.nextInt()   2.nextFloat()   3.nextLong()
 * 4.nextBoolean()  5.nextByte()   6.nextLine() {for multiple lines} and not used when it is last input else use next()
 * */
public class InputFromUser {

        public static void main(String a[])
        {
            Scanner sc=new Scanner(System.in);          //object of scanner class to get input from user
            System.out.println("Enter the number : ");
            //String name = sc.nextLine();
            int num=sc.nextInt();                       //using sc object to get input
            System.out.println("Enter the name : ");
            String name=sc.next();

            System.out.println("Number = "+num);
            System.out.println("Name = "+name);
        }
}
//previous DataType_1
//next Constructor_3