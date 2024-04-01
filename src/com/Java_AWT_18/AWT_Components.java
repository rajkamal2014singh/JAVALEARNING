package com.Java_AWT_18;
/** Components of AWT
 * 1. Label : If we want to place any text, any input from user TextField
 *  Button, Checkbox, radio Button, Select Box, Menu.
 *
 *  //Label in AWT
 *  1.Label i used to write something in the frame. Label class is used to create
 *  and manage the label.
 *  2.To use label we need to create a object of the label class
 *  3. label.setBounds(x,y,width,height) so where label to appear
 *  4. we need to add the label to frame frameObj.add(label_Obj)
 *  5. Learn the properties of label to set the font size, color and other things.
 * */
import java.awt.*;
public class AWT_Components {
    Frame F;
    Label l,l1;
    AWT_Components(){
        F = new Frame("Label Example");
        l = new Label("hello");
        l1 = new Label("java learning");
        l.setBounds(100,300,200,15);
        l1.setBounds(100,330,200,15);
        F.add(l);
        F.add(l1);
        F.setSize(500,500);
        F.setLayout(null);
        F.setVisible(true);
    }
    public static void main(String args[]){
       new AWT_Components();
    }
}
