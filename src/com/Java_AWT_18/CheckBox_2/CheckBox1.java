package com.Java_AWT_18.CheckBox_2;
/**CheckBox example in java AWT
 *
 * */
import java.awt.*;
import java.awt.event.*;

//for button the interface implemented is ActionListener
//but for checkBox, radio and other it is ItemListener
//If both present we can implement both interfaces

public class CheckBox1 implements ItemListener {
    Frame f;
    Checkbox cb1,cb2;
    Label l1,l2;
    CheckBox1(){
        f = new Frame("Checkbox Example");
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);

        cb1 = new Checkbox("C++",true);             //true makes it checked at starting only
        cb1.setBounds(100,100,150,50);
        cb1.addItemListener(this);
        cb2 = new Checkbox("Java");
        cb2.setBounds(100,150,150,50);
        cb2.addItemListener(this);

        l1 =new Label();
        l1.setBounds(100,300,100,50);
        l2 =new Label();
        l2.setBounds(100,400,100,50);

        f.add(cb1);
        f.add(cb2);
        f.add(l1);
        f.add(l2);
    }
    //this method is performed whenever checkbox is selected
    public void itemStateChanged(ItemEvent e){
        if(e.getSource()==cb1){
            if(e.getStateChange()==1){
                l1.setText("C++ Checked");
            }
            else{
                l1.setText(" ");
            }
        }
        if(e.getSource()==cb2){
                if(e.getStateChange()==1){
                    l2.setText("Java Checked");
                }
                else{
                    l2.setText(" ");
                }
        }
    }
    public static void main(String s[]){
        new CheckBox1();
    }
}
