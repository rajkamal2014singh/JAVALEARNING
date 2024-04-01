package com.Exam;

/**
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

class first1{
    synchronized public void display(String msg){
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
public class syncThread {
    public static void main(String s[]){
        first fobj1 = new first();
        second s1 = new second(fobj1,"Welcome");
        second s2 = new second(fobj1,"Java");
        second s3 = new second(fobj1,"multithreading");
    }
}
/** Output
 *  [ Welcome ]
 * [ multithreading ]
 * [ Java ]
 */

//Both have different output

