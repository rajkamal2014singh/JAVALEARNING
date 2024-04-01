package com.Java_AWT_18.RadioButton_3;
/** Radio Button in Java
 * 1. It is almost similar to check
 * 2. In checkBox we can select multiple options but Radio button is used
 * to select only one option
 * 3. CheckboxGroup class is used to create a radio button in Java awt
 * 4. In radio button, we can select one option from multiple options.
 * */
import java.awt.*;
import java.awt.event.*;
public class Radio1 implements ItemListener {
    Frame f;
    CheckboxGroup cbg;
    Checkbox cb1,cb2;

    Label l;
    Radio1(){
        f = new Frame("Radio Button Example");
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);

        cbg = new CheckboxGroup();
        cb1 = new Checkbox("Male",cbg,false);       //passed cbg to add to radio or checkbox group
        cb2 = new Checkbox("Female",cbg,false);
        cb1.setBounds(100,100,80,80);
        cb2.setBounds(100,200,80,80);

        l = new Label();
        l.setBounds(100,300,100,100);

        cb1.addItemListener(this);
        cb2.addItemListener(this);
        f.add(cb1);
        f.add(cb2);
        f.add(l);
    }
    public void itemStateChanged(ItemEvent e){
        if(e.getSource()==cb1){
           if(e.getStateChange()==1){
               l.setText("Male Selected");
           }
        }
        if(e.getSource()==cb2){
            if(e.getStateChange()==1){
                l.setText("Female Selected");
            }
        }
    }
    public static void main(String s[]){
        new Radio1();
    }
}
