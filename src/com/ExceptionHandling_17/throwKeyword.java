package com.ExceptionHandling_17;
/** throw keyword in exception handling
 *  It is used to throw an exception explicitly or manually.
 * */

public class throwKeyword {
    public static void verify(int x)                    //creating exception
    {
        if(x<18)
        {
            throw new ArithmeticException("Exception thrown");      //throwing exception
        }
        else
        {
            System.out.println("Hii Exception");
        }
    }
    public static void main(String args[])
    {
        try {
            verify(13);                             //these value throws exception
            //verify(67);
        }catch (Exception e) {
            System.out.println("Handling the exception ");
        }
        System.out.println("Rest of the code");
    }
}
