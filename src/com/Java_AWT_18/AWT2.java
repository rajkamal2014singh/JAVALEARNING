package com.Java_AWT_18;
/**
 * 2.Creating a frame by object of Frame class
 * */
import java.awt.*;
public class AWT2 {
    AWT2(){
        Frame f = new Frame("My Application");
        f.setSize(1000,900);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]){
        new AWT2();
    }
}
