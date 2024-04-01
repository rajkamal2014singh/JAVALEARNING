package com.MultiThreading_20;

import java.awt.*;
import java.awt.event.*;

public class Multithreading4 implements Runnable{
   Frame f;
   Label l;
   Thread t1;

   Multithreading4(){
       f = new Frame();
       l = new Label();
       l.setBounds(100,100,100,100);
       f.setLayout(null);
       f.setSize(500,500);
       f.setVisible(true);
       f.add(l);
       t1 = new Thread();
       t1 = new Thread(this);
       t1.start();
   }
   public void run(){
      int i =0;
      while(true){
         l.setText(Integer.toString(i));
         i++;
         try{
            Thread.sleep(1000);
         }
         catch (Exception e){

         }
      }
   }
   public static void main(String s[]){
      new Multithreading4();
   }
}
