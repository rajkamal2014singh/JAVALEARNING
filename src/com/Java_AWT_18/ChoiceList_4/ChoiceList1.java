package com.Java_AWT_18.ChoiceList_4;
/** Choice List in Java AWT
 *  1.It pops up to select a option from several option
 *  2.If we do not want to show so many option on screen
 *  3.class needed is Choice
 * */
import java.awt.*;
import java.awt.event.*;
public class ChoiceList1 implements ActionListener{
    Frame f;
    Choice c;
    Button b;
    Label l;
    ChoiceList1(){
        f = new Frame("Example of Choice List");
        c = new Choice();
        c.setBounds(100,100,100,75);
        b = new Button("Show");
        b.setBounds(250,125,100,25);
        b.addActionListener(this);

        c.add("Java");
        c.add("C++");
        c.add("C");
        c.add("python");

        l = new Label();
        l.setBounds(100,250,400,100);

        f.add(c);
        f.add(b);
        f.add(l);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b){
            String data = "Programming Language Selected : " + c.getItem(c.getSelectedIndex());
            l.setText(data);
        }
    }
    public static void main(String args[]){
        new ChoiceList1();
    }
}
