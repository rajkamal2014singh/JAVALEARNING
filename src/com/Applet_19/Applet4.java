package com.Applet_19;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//Write a applet program to find the simple interest.

public class Applet4 extends Applet implements ActionListener{
    Label l1,l2,l3,res;
    TextField t1,t2,t3;
    Button b;

    public void init(){
        l1 = new Label("Enter Principle : ");
        l1.setBounds(100,100,300,50);

        t1 = new TextField();
        t1.setBounds(400,100,200,50);

        l2 = new Label("Enter rate : ");
        l2.setBounds(100,200,300,50);

        t2 = new TextField();
        t2.setBounds(400,100,200,50);

        l3 = new Label("Enter time(months) : ");
        l3.setBounds(100,300,300,50);

        t3 = new TextField();
        t3.setBounds(400,300,200,50);

        b = new Button("Calculate");
        b.setBounds(200,400,150,50);

        res = new Label();
        res.setBounds(100,500,200,50);


        add(l1);
        add(l2);
        add(l3);
        add(res);
        add(t1);
        add(t2);
        add(t3);
        add(b);
        setLayout(null);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b) {
            float p = Float.parseFloat(t1.getText());
            float r = Float.parseFloat(t2.getText());
            int t = Integer.parseInt(t3.getText());
            float si = (p * r * (float)(t/12)) / 100;
            res.setText(String.valueOf(si));
        }
    }
    public void paint(Graphics g){

    }
}
/*
<applet code="Applet4.class" height="800" width="800"></applet>
 */
