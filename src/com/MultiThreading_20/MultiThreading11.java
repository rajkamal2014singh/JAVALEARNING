package com.MultiThreading_20;
/**
 * Normal Thread in Java
 * The process of executing multiple threads simultaneously is known as Multithreading.
 * In these type of thread each of the threads try to use the resources
 *
 * Synchronization in Java ;
 *  Synchronized blocks in Java are marked with the synchronized keyword.
 *  A synchronized block in Java is synchronized on some object.
 *  If multiple threads are using the same resource then
 *  we might not be able to get our task done properly so we use synchronization
 *  In multithreading, multiple threads can access the shared resources at a time
 *  simultaneously which can lead to error prone result. To stop the thread interference,
 *  there is a synchronization method or block which restricts the thread to access the
 *  shared data/resources simultaneously.
 *
 *  syntax : synchronize
 * */

//A program without synchronization
class first{
      //public void display(String msg){
      synchronized public void display(String msg){
          System.out.print("[ " + msg);

          try{
              Thread.sleep(1000);
          }catch(Exception e){

          }
          System.out.println(" ]");
      }
}
class second extends Thread{
    String msg;
    first fobj;
    second(first obj, String str){
        msg = str;
        fobj = obj;
        start();
    }
    public void run(){
        fobj.display(msg);
    }
}
public class MultiThreading11 {
    public static void main(String s[]){
        first fobj1 = new first();
        second s1 = new second(fobj1,"Welcome");
        second s2 = new second(fobj1,"Java");
        second s3 = new second(fobj1,"multithreading");
    }
}
