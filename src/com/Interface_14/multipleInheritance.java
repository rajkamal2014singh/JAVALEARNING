package com.Interface_14;
//achieving multiple inheritance using interface
/**
 * Why multiple inheritance is not possible through classes?
 * As we make two classes and their methods of same name then when the
 * derived class's object calls the base class method then there is ambiguity
 * that which method is to be called
 *E.g.
 *      class base1{
 *          void print(){
 *              //statements
 *          }
 *      }
 *      class base2{
 *          void print(){
 *              //statements
 *          }
 *      }
 *      class derived extends base1,base2{
 *          public static void main(String s[]){
 *              derived obj;
 *              obj.print()             //Ambiguity here which base class method is to be called
 *          }
 *      }
 *
 * But in case of interface the method is not implemented in interface so the method
 * is defined in class which implements the interface
 * */
interface base1
{
    void print();
}
interface base2
{
    void show();
}

class derived implements base1,base2        //multiple interfaces
{
    public void print()
    {
        System.out.println("This is print method");
    }
    public void show()
    {
        System.out.println("This is a show method");
    }
}

public class multipleInheritance
{
    public static void main(String args[])
    {
        derived obj = new derived();
        obj.print();
        obj.show();
    }
}
//previous abstract Class
//next finalize method