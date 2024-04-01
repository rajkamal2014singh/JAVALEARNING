package com.MultiThreading_20;
import java.awt.*;
import java.awt.event.*;
public class MultiThreading5 implements ActionListener,Runnable {
    Frame f;
    TextField t1,t2;
    Button start;
    Thread t;
    int min=0,sec=0;
    MultiThreading5(){
        f = new Frame("Timer");
        t1 = new TextField();
        t2 = new TextField();
        t1.setBounds(100,100,80,50);
        t2.setBounds(200,100,80,50);

        start = new Button("Start");
        start.setBounds(300,100,80,50);
        start.addActionListener(this);
        f.add(t1);f.add(t2);f.add(start);
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);
        f.setFont(new Font("Arial",Font.BOLD,24));
        t = new Thread(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==start){
            min = Integer.parseInt(t1.getText());
            sec = Integer.parseInt(t2.getText());
            t.start();
        }
    }
    public void run(){
        while(true) {
            if (sec == 0) {
                if (min == 0 && sec == 0) {
                    t1.setText(Integer.toString(min));
                    t2.setText(Integer.toString(sec));
                    //we should use pause(we will learn ho wto do that) instead of stop and o again clicking start as stop kills the thread
                    t.stop();
                }
                min--;
                sec = 59;
            }
            t1.setText(Integer.toString(min));
            t2.setText(Integer.toString(sec));
            try {
                t.sleep(1000);
            } catch (Exception e) {
            }

            sec--;
        }
    }
    public static void main(String args[]){
        new MultiThreading5();
    }
}
