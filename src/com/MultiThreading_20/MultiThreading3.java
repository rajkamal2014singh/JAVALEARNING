package com.MultiThreading_20;
/** Sleep Method of a Thread class
 *  sleep() method of Thread class halts/sleeps a thread for a particular amount of time.
 *  These method throws a InterruptedException
 *  syntax : Thread.sleep(ms);     (1000 milliseconds = 1 second)
 *
 *  When multiple threads are there and if one sleeps other starts
 * */
public class MultiThreading3 implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
    public static void main(String s[]){
        MultiThreading3 mt1 = new MultiThreading3();
        MultiThreading3 mt2 = new MultiThreading3();
        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);
        t1.start();
        t2.start();
    }
}
