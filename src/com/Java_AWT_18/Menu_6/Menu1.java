package com.Java_AWT_18.Menu_6;
/** Menu example in Java AWT
 *  1.Menu Bar and sub menu
 *  2.classes used are MenuBar,Menu, MenuItem
 *  3.Frame has a method setMenuBar which sets the menuBar to the frame
 *  4. Frame -> MenuBar -> Menu -> MenuItems and Submenu
 *  5. To do some work if specific item is clicked we need to use methods similar as
 *  the ItemListener
 * */
import java.awt.*;

public class Menu1 {
    Frame f;
    MenuBar mb;
    Menu menu;
    Menu submenu;
    MenuItem i1,i2,i3,i4,i5;

    Menu1(){
       f = new Frame("Menu Example");
       mb = new MenuBar();
       menu = new Menu("File");
       submenu = new Menu("More");
        i1 = new MenuItem("New");
        i2 = new MenuItem("Open");
        i3 = new MenuItem("Save");
        i4 = new MenuItem("Save As");
        i5 = new MenuItem("Print Setup");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);

        f.setMenuBar(mb);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String s[]){
        new Menu1();
    }
}
