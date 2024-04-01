package com.MultiThreading_20;
//Creating a stop watch
import java.awt.*;
import java.awt.event.*;
public class MultiThreading6 implements ActionListener,Runnable{
    Frame f;
    Button start,stop;
    Label l1,l2,l3,l4;
    Thread t;
    int hh=0,mm=0,ss=0,ms=0;

    MultiThreading6(){
        f = new Frame("Stopwatch");
        l1 = new Label();
        l1.setBounds(25,100,100,50);
        l2 = new Label();
        l2.setBounds(125,100,100,50);
        l3 = new Label();
        l3.setBounds(225,100,100,50);
        l4 = new Label();
        l4.setBounds(325,100,100,50);

        start = new Button("Start");
        start.setBounds(200,300,100,50);
        start.addActionListener(this);
        stop = new Button("Stop");
        stop.setBounds(300,300,100,50);
        stop.addActionListener(this);

        f.setLayout(null);
        f.setSize(600,600);
        f.setVisible(true);
        f.setFont(new Font("Arial",Font.BOLD,30));
        f.add(l1);f.add(l2);f.add(l3);f.add(l4);
        f.add(start);f.add(stop);

        t = new Thread(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==start){
            t.start();
        }if(e.getSource()==stop){
            t.stop();
        }
    }
    public void run(){
        while(true) {
            if (ms == 1000) {
                ss++;
                ms = 0;
            }
            if (ss == 60) {
                mm++;
                ss = 0;
            }
            if (mm == 60) {
                hh++;
                mm = 0;
            }
            l1.setText(Integer.toString(hh));
            l2.setText(Integer.toString(mm));
            l3.setText(Integer.toString(ss));
            l4.setText(Integer.toString(ms));

            try{
                t.sleep(1);
                ms++;
            }catch(Exception e){
            }
        }
    }
     public static void main(String s[]){
        new MultiThreading6();
     }
}
