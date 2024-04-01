package com.Java_AWT_18.MouseListener;
/** MouseListener interface in Java AWT
 *  1.As in action listener there was a method in interface mouse Listener has 5 such methods
 *      1.public abstract void mouseClicked(MouseEvent e)
 *      2.public abstract void mouseEntered(MouseEvent e)
 *      3.public abstract void mouseExited(MouseEvent e)
 *      4.public abstract void mousePressed(MouseEvent e)
 *      5.public abstract void mouseReleased(MouseEvent e)
 *
 *  2.mouseListener is added to Frame directly
 * */

import java.awt.*;
import java.awt.event.*;

public class MouseListener1 implements MouseListener {
    Frame F;
    Label l;
    MouseListener1(){
       F = new Frame("Mouse Listener Example");
       l = new Label();
       l.setBounds(100,100,200,50);
       l.setFont(new Font("Scrif",Font.BOLD,25));
       F.add(l);
       F.setLayout(null);
       F.setSize(600,600);
       F.setVisible(true);
       F.addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e){
        l.setText("Mouse clicked");
    }
    public void mouseEntered(MouseEvent e){
        l.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e){
        l.setText("Mouse Exited");
    }
    public void mousePressed(MouseEvent e){
        l.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e){
        l.setText("Mouse Released");
    }

    public static void main(String s[]){
        new MouseListener1();
    }
}
