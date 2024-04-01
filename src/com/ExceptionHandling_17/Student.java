package com.ExceptionHandling_17;
/**
 * Write a Java program to create a student class with the data members student_name, roll-number and Marks.
 * Define appropriate constructor in the program. Create array of ten student objects. Also
 * display the name and roll number of the student with the highest marks(in the array created).
 *
 * */
import java.io.*;
import java.util.Scanner;

class Student {
    String student_name;
    int roll;
    int marks;
    Student()
    {

    }
    public void setData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Students name : ");
        student_name = sc.next();
        roll = sc.nextInt();
        marks=sc.nextInt();
    }
   public  void print(){
        System.out.println(" Students name : " + student_name);
        System.out.println(" Roll : " + roll);
        System.out.println(" Marks : " + marks);
        System.out.println();
    }
    public static void main(String args[]){
        Student s[] = new Student[5];
        for(int i=0;i<5;i++){
            s[i] = new Student();
        }
        for(int i=0;i<5;i++){
            s[i].setData();
        }
        for(int i=0;i<5;i++){
            s[i].print();
        }
        int max=0;
        for(int i=0,j=1;j<5;j++){
            if(s[i].marks>s[j].marks){
                max = i;
            }else{
                max = j;
                i=j;
            }
        }
        System.out.println("Student with highest marks ");
        s[max].print();
    }
}


