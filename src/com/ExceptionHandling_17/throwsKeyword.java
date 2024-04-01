package com.ExceptionHandling_17;

import java.io.IOException;

/** throws keyword in Exception Handling
 * 1.It is used to tell programmer that a specific method will generate some
 * exception. We will use throws keyword that.
 *
 */

public class throwsKeyword {
    void m()throws IOException
    {
        //statements
        throw new IOException("Exception generated");
    }
    public static void main(String s[]){
      throwsKeyword obj = new throwsKeyword();
      try{
          obj.m();
      }catch(Exception e){
          System.out.println(e);
      }
      System.out.println("Rest of the code");
    }
}
