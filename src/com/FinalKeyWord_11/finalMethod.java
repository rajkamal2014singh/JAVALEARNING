package com.FinalKeyWord_11;

//if a method is made with final key word then it cannot be overridden
class finalMethodClass
{
    public final void display(){
        System.out.println("Checking final  method");
    }
}
class OverridingFinalMethod extends finalMethodClass{
    /*public void display(){                                           //shows error can't override a final method
        System.out.println("final class's extended class trying");
    }*/
}
public class finalMethod {
    public static void main(String args[]){
        finalMethodClass obj = new finalMethodClass();
        obj.display();
    }
}




