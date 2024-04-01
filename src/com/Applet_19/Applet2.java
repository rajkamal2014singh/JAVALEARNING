package com.Applet_19;
/** Applet in Java
 * Applet is a Java program which runs inside a web browser on a client side.
 * Applet class is used to create a applet program in java.
 *
 * Applet lifecycle :
 * Following are the life cycle and methods of applet :
 * 1.Applet initialized    (only once)    (public void init()) method optional method
 * We can initialize our variable inside this method.
 * 2.Applet is started      (can run multiple times) (public void start()) automatically called
 * called just after init method  or when browser is maximized.
 * 3.Applet is painted      (can run multiple times)    (public void paint(Graphics g)) the way we want applet to work
 * This method is called just after start() method and it contains the content of an applet.
 * 4.Applet is stopped.(New Tab or browser minimized)(can run multiple times)   (public void stop() ) automatically
 * Method is called when an applet is stopped or browser is minimized.
 * 5.Applet is destroyed  (only once)   (destroy() ) automatically.
 * This method is called when an applet is destroyed or browser is been closed.
 *
 * Note : An applet class does not contain main method.
 * It is because it is not need to run in java run time it is needed to run on a browser.
 *
 * How to run Applet :
 * 1.Write an applet java program
 * 2.Compile it
 * 3.After compilation a class file will be generated. Embed that class file in html file.
 *
 * How to embed applet class file into html :
 * We use applet tag to embed an applet class.
 *  In HTML file body : <applet code = "applet_classFileName.class" height="500" width="300/"></applet>
 *  Note : Browser must have applet plugin.
 *  For testing we developers use applet viewer instead of browser
 *
 * */
import java.applet.*;
import java.awt.*;

public class Applet2 extends Applet {
public void paint(Graphics g){
    g.drawString("Hello applet",150,150);
}
}
/**
 * 1.compile java file
 * 2.create a html file and embed the applet in html file
 * 3.appletviewer javaCompiledFile.class  (without browser or html file)
 * */