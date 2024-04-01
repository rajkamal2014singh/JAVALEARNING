package com.Constructor_3;
/**
 * If a parameterized constructor is made default is removed. So we need to add that manually default one.
 */
public class ParameterizedConstructor
    {
        int id;
        String name;
    public ParameterizedConstructor()
        {
        }
        //concept of this keyword too
    public ParameterizedConstructor(int id,String name)
        {
            this.id=id;                     //use of this keyword
            this.name=name;
        }
        public void display()
        {
            System.out.println("Id = "+this.id);
            System.out.println("Name = "+this.name);
        }

        public static void main(String[] args)
        {
            // write your code here
            ParameterizedConstructor obj1=new ParameterizedConstructor(12,"Uajwal");
            ParameterizedConstructor obj2=new ParameterizedConstructor(32,"Utkarsh");
            ParameterizedConstructor obj3=new ParameterizedConstructor();

            obj1.display();
            obj2.display();
            obj3.display();
        }
    }

