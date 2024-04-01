package com.MultiThreading_20;
/** Thread Priority :
 *  Each thread have a priority. It is represented by a number between 1 to 10.
 *
 *  3 constants are defined in Thread class :
 *  1.public static int MIN_PRIORITY
 *  2.public static int NORM_PRIORITY
 *  3.public static int MAX_PRIORITY
 *
 *  Default priority of a thread is 5.(NORM_PRIORITY)
 *  The value if MIN_PRIORITY is 1 and the value of MAX_PRIORITY is 10.
 *
 *  We can set priority of a thread by using setPriority() method.
 *  It only helps us in doing which thread is to be started first
 *
 * */
public class MultiThreading10 implements Runnable{
    public void run(){
       System.out.println("Name of Thread : " + Thread.currentThread().getName());
        System.out.println("Priority of Thread : " + Thread.currentThread().getPriority());
    }
    public static void main(String s[]){
        MultiThreading10 obj = new MultiThreading10();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        //if priority is not mentioned it is by default 5
        t1.start();
        t2.start();
    }
}
