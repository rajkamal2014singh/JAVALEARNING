package com.Applet_19;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Applet3 extends Applet implements ActionListener{
    Label l1,l2,l3;
    TextField t1,t2;
    Button b;

    public void init(){
    l1 = new Label("Enter First Number : ");
    l1.setBounds(100,100,100,80);

    t1 = new TextField();
    t1.setBounds(200,100,100,50);

    l2 = new Label("Enter second number : ");
    l2.setBounds(100,200,100,80);

    t2 = new TextField();
    t2.setBounds(200,200,100,50);

    b = new Button("ADD");
    b.setBounds(150,300,80,45);

    l3 = new Label("Result");
    l3.setBounds(200,400,100,80);

    add(l1);
    add(l2);
    add(l3);
    add(t1);
    add(t2);
    add(b);
    setLayout(null);
    b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());

        int r = n1+n2;
        l3.setText(Integer.toString(r));
    }
    public void paint(Graphics g){

    }
}
/*
<applet code="Applet3.class" height="500" width="500"></applet>
 */
