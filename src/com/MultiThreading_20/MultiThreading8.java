package com.MultiThreading_20;
/**
 *  Join Method :
 *  Join method in java allows one thread to wait until another thread completes
 *  its execution.
 * */

import java.awt.*;
import java.awt.event.*;

public class MultiThreading8 implements  Runnable {
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }
        }
    }
    public static void main(String s[]){
        MultiThreading8 obj = new MultiThreading8();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.start();
        t2.start();

    }

}
