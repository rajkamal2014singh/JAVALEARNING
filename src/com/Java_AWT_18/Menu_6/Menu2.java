package com.Java_AWT_18.Menu_6;
/** Create a AWt application of a notepad
 *
 * */
import java.awt.*;

public class Menu2 {
    Frame f;
    MenuBar mb;
    Menu file,edit,view;
    Menu fileSubmenu;
    MenuItem i1,i2,i3,i4,i5,e_i1,e_i2,e_i3,v_i1,v_i2;

    Menu2(){
        f = new Frame("Menu Example");
        mb = new MenuBar();

        file = new Menu("File");
        fileSubmenu = new Menu("More");
        i1 = new MenuItem("New");
        i2 = new MenuItem("Open");
        i3 = new MenuItem("Save");
        i4 = new MenuItem("Save As");
        i5 = new MenuItem("Print Setup");

        edit = new Menu("Edit");
        e_i1 = new MenuItem("Cut");
        e_i2 = new MenuItem("Copy");
        e_i3 = new MenuItem("Paste");

        view = new Menu("View");
        v_i1 = new MenuItem("Appearance");
        v_i2 = new MenuItem("Recent");


        file.add(i1);
        file.add(i2);
        file.add(i3);
        file.add(i4);
        file.add(i5);
        file.add(fileSubmenu);
        view.add(v_i1);
        view.add(v_i2);
        edit.add(e_i3);
        edit.add(e_i1);
        edit.add(e_i2);

        mb.add(file);
        mb.add(view);
        mb.add(edit);

        f.setMenuBar(mb);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String s[]){
        new Menu2();
    }
}
