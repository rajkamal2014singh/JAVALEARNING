package com.Java_AWT_18;
/** Java AWT(Abstract Window Kit)
 *  1.AWT is an API(application programming interface) which is used to create graphical
 *  program in java
 *  2.It provides resources to create graphical program. It is machine dependent i.e.,
 *  It uses the component of OS. It is heavyweight. It uses the resources of OS.
 *  3. Java AWT inherits from component.
 *  4. To use the component of awt, we have to import java.awt package.
 *  5. To first step to create a graphical program in java is to create a frame.
 *  6. Frame is a container which contains other graphical components.
 *  7. there are two ways to create a frame
 *      1.by extending frame class(inheritance)
 *      2.by creating the object of frame class(association)
 * */
import java.awt.*;
public class AWT1 extends Frame {
    AWT1(){
        setSize(900,900);
        setLayout(null);
        setVisible(true);           //to make visible the frame
        //These three methods must be passed the required parameter to get a GUI.

    }
    public static void main(String args[]){
        new AWT1();     //only when we want to create a object
    }
}
//prev exceptionHandling
//next Applet