package com.FinalKeyWord_11;

//if a class is made with final keyword then it cannot be extended.
import java.io.*;
final class fClass
{
    public void display(){
        System.out.println("CHecking final class");
    }
}
/*class finalExtend extends fClass{               //shows error can't extend from final class
    public void display(){
        System.out.println("final class's extended class trying");
    }
}*/
public class finalClass{
    public static void main(String args[]){
        fClass obj = new fClass();
    }
}
//previous runTimePolymorphism
//next instaceOfOperator