package com.Java_AWT_18.Label_1;
/**
 * 1. Generally to take the user input we use text fields
 * 2. Java AWT program to add two numbers.
 *
 * 1.To perform a event like addition, subtraction and other we need to import a class
 * import java.awt.event.*;
 * 2.The above library has a interface ActionListener which has our required methods
 * 3. So the required class must implement the ActionListener
 * 4. We need to add action Listener to the button that does the required task
 * 4. Which ever button we press but actionPerformed method is performed
 * 5. The method actionPerformed must be overrided and this method gets executed first
 * when a button is pressed
 * */
import java.awt.*;
import java.awt.event.*;
public class AWT3 implements ActionListener  {
    Frame f;
    TextField t1,t2;
    Button b1;
    Label l1;

    AWT3(){
        f = new Frame(" Add two numbers ");
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
        t1 = new TextField();
        t1.setBounds(50,100,80,50);
        t2 = new TextField();
        t2.setBounds(50,200,80,50);
        b1 = new Button("ADD");
        b1.setBounds(50,300,80,50);
        b1.addActionListener(this);
        l1 = new Label("Results");
        l1.setBounds(50,400,80,50);
        f.add(t1);
        f.add(t2);
        f.add(b1);
        f.add(l1);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int n3 = n1+n2;
            l1.setText(Integer.toString(n3));
        }
    }
    public static void main(String s[]){
        new AWT3();
    }
}
