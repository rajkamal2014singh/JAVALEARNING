package com.Java_AWT_18.List_5;
/**List in Java AWt
 *  1.It can have multiple options as choice list but here we can select one or multiple options depending on our choice
 *  2.It is implemented by class List
 * */
import java.awt.*;
import java.awt.event.*;
public class List1 implements ActionListener {
    Frame f;
    List l1;
    Button b;
    Label L;

    List1(){
        f = new Frame("List example");
        l1 = new List(5,true);
        //here we need to pass two parameters the size of list and tp enable or disable multiple selcection
        l1.setBounds(100,100,100,75);
        l1.add("C++");
        l1.add("C");
        l1.add("Java");
        l1.add("JS");
        l1.add("Swift");

        b = new Button("Show");
        b.setBounds(100,200,75,40);
        b.addActionListener(this);

        L = new Label();
        L.setBounds(100,400,300,100);

        f.add(l1);
        f.add(b);
        f.add(L);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(600,600);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b){
            String data = "";
            //String[] temp = l1.getSelectedItems();
            for(String temp : l1.getSelectedItems()){
                data += temp + " ";
            }
            L.setText(data);
        }
    }
    public static void main(String s[]){
        new List1();
    }
}
