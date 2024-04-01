package com.Java_AWT_18.Label_1;
//ADD,SUBTRACT,MULTIPLY and DIVIDE
import java.awt.*;
import java.awt.event.*;
public class AWT4 implements ActionListener  {
    Frame f;
    TextField t1,t2;
    Button b1,b2,b3,b4;
    Label l1;

    AWT4(){
        f = new Frame(" Add two numbers ");
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
        t1 = new TextField();
        t1.setBounds(50,100,80,50);
        t2 = new TextField();
        t2.setBounds(50,300,80,50);
        b1 = new Button("ADD");
        b1.setBounds(250,100,80,50);
        b1.addActionListener(this);
        b2 = new Button("SUB");
        b2.setBounds(250,175,80,50);
        b2.addActionListener(this);
        b3 = new Button("MUL");
        b3.setBounds(250,250,80,50);
        b3.addActionListener(this);
        b4 = new Button("DIV");
        b4.setBounds(250,325,80,50);
        b4.addActionListener(this);
        l1 = new Label("Results");
        l1.setBounds(50,500,80,50);
        f.add(t1);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(l1);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        if(e.getSource()==b1){
            int n3 = n1+n2;
            l1.setText(Integer.toString(n3));
        }
        else if(e.getSource()==b2){
            int n3 = n1-n2;
            l1.setText(Integer.toString(n3));
        }else if(e.getSource()==b3){
            int n3 = n1*n2;
            l1.setText(Integer.toString(n3));
        }else if(e.getSource()==b4){
            if(n2==0){
                l1.setText("Undefined");
            }else {
                int n3 = n1 / n2;
                l1.setText(Integer.toString(n3));
            }
        }
    }
    public static void main(String s[]){
        new AWT4();
    }
}
