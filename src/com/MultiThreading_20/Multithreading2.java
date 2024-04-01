package com.MultiThreading_20;
/** Example of Thread using Runnable Interface
 *  This method is majorly used
 * */
public class Multithreading2 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println(i);
        }
    }
    public static void main(String s[]){
        Multithreading2 obj1 = new Multithreading2() ;
        Multithreading2 obj2 = new Multithreading2();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
