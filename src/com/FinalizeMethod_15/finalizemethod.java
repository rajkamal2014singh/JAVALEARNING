package com.FinalizeMethod_15;
/**
 *finalize() method in Java
 * 1.It is an method of object class which is called automatically
 * when the object is no longer needed by user system and it has to be collected by garbage collector.
 * 2.We can override finalize() method and give our own definition to it.
 * 3.final is a keyword finalize is a method and finally is also a method which we will learn in future.
 * */
//finalize method is called automatically when object is to destroyed we can override the method

class finalizemethod
{
   public finalizemethod()
   {
       System.out.println("Constructor");
   }

   public static void main(String args[])
   {
       finalizemethod obj = new finalizemethod();

       System.out.println(obj.hashCode());

       obj = null;
       System.gc();                             //calling garbage method
   }
   @Override
    protected void finalize()
   {
       System.out.println("Finalize method called");
   }
}
//previous interface
//next wrapper class
