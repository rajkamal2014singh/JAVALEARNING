package com.MultiThreading_20;

//Creating a timer
import java.awt.*;
import java.awt.event.*;
public class MultiThreading7 implements ActionListener,Runnable{
    Frame f;
    Button start;//stop;
    TextField l1,l2,l3,l4;
    Thread t;
    int hh=0,mm=0,ss=0,ms=0;

    MultiThreading7(){
        f = new Frame("Timer");
        l1 = new TextField();
        l1.setBounds(25,100,100,50);
        l2 = new TextField();
        l2.setBounds(125,100,100,50);
        l3 = new TextField();
        l3.setBounds(225,100,100,50);
        l4 = new TextField();
        l4.setBounds(325,100,100,50);

        start = new Button("Start");
        start.setBounds(200,300,100,50);
        start.addActionListener(this);
//        stop = new Button("Stop");
//        stop.setBounds(300,300,100,50);
//        stop.addActionListener(this);

        f.setLayout(null);
        f.setSize(600,600);
        f.setVisible(true);
        f.setFont(new Font("Arial",Font.BOLD,30));
        f.add(l1);f.add(l2);f.add(l3);f.add(l4);
        f.add(start);//f.add(stop);

        t = new Thread(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==start){
            hh = Integer.parseInt(l1.getText());
            mm = Integer.parseInt(l2.getText());
            ss = Integer.parseInt(l3.getText());
            ms = Integer.parseInt(l4.getText());
            t.start();
        }
    }
    public void run(){
        while(true) {
            if(ms==0){
                if(ss==0 && mm==0 && hh==0){
                    l1.setText(Integer.toString(hh));
                    l2.setText(Integer.toString(mm));
                    l3.setText(Integer.toString(ss));
                    l4.setText(Integer.toString(ms));
                    t.stop();
                }
                ms = 999;
                ss--;
            }

            l1.setText(Integer.toString(hh));
            l2.setText(Integer.toString(mm));
            l3.setText(Integer.toString(ss));
            l4.setText(Integer.toString(ms));

            try{
                t.sleep(1);
                ms--;
            }catch(Exception e){
            }
        }
    }
    public static void main(String s[]){
        new MultiThreading7();
    }
}
