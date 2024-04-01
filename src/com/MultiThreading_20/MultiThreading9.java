package com.MultiThreading_20;
/**
 *  Some methods of Threads
 *  getName() : It returns the name of Thread object.
 *  setName() : It sets the name of a Thread object.
 *  getId() : It returns the id of Thread object.
 *  currentThread() : It returns a reference to the current executing thread object.
 * */
import java.awt.*;
public class MultiThreading9 implements  Runnable{
    public void run(){
        for(int i=1;i<=5;i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(i);
        }
//       System.out.println(Thread.currentThread().getName());
//          System.out.println(Thread.currentThread().getId());
        try{
            Thread.sleep(1000);
        }catch(Exception e){
        }
    }
    public static void main(String s[])throws Exception{
        MultiThreading9 obj = new MultiThreading9();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        System.out.println(t1.getName());
        System.out.println(t2.getName());

//        t1.setName("T-1");
//        t2.setName("T-2");

        t1.start();
        t2.start();

        t1.start();
        try{
            t1.join();
        }catch (Exception e){
        }
        t2.start();

    }
}
