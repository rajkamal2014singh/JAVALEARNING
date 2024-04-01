package com.MultiThreading_20;
/**
 * Normal Thread in Java
 * The process of executing multiple threads simultaneously is known as Multithreading.
 * In these type of thread each of the threads try to use the resources
 *
*/

//A program without synchronization
class first1{
    public void display(String msg){
        System.out.print("[ " + msg);

        try{
            Thread.sleep(1000);
        }catch(Exception e){

        }
        System.out.println(" ]");
    }
}
class second2 extends Thread{
    String msg;
    first fobj;
   public second2(first obj, String str){
        msg = str;
        fobj = obj;
        start();
    }
    public void run(){
        fobj.display(msg);
    }
}
public class multiThreading12 {
    public static void main(String s[]){
        first fobj1 = new first();
        second s1 = new second(fobj1,"Welcome");
        second s2 = new second(fobj1,"Java");
        second s3 = new second(fobj1,"multithreading");
    }
}
