package com.ExceptionHandling_17;
/**Exception handling in Java
 * 1.Exception handling is a mechanism to handle run time error so that the normal flow of the
 * program does not get affected due to that error.
 *
 * In java, Following are the types of exception
 *
 * 2.checked Exception : These exceptions are checked during compile time
 * e.g. IOException, SQLException etc.
 *
 * 3.unchecked exception : These exceptions will be checked during run time
 * e.g. ArithmeticException, NULLPointerException etc.
 *
 * 4.error : errors are unrecoverable.
 *
 * throwable class is used to handle the exception which is a part of java.lang.
 *
 * 6. Keyword used in exception handling
    Keywords used
    *try
    *catch
    *finally()
    *throw
    *throws
 * 7.try catch block to execute lines which occur after the exception is generated line
 */

public class exceptionHandling
{
    public static void main(String args[])
    {

                //divided by zero exception
//        try
//        {
//            int x = 50/0;
//        }
//        catch(ArithmeticException e)      //catch(Exception e)   //if exception is unknown
//        {
//            System.out.println(e);
//        }
//        System.out.println("The remaining code");

//        String name = null;
//        try
//        {
//            System.out.println(name.length());
//        }
//        catch(NullPointerException e)
//        {
//            System.out.println(e);
//        }
//        System.out.println("The remaining code");

//        String s = "abc";
//        try
//        {
//            int x = Integer.parseInt(s);
//        }
//        catch(NumberFormatException e)
//        {
//            System.out.println(e);
//        }
//        System.out.println("The remaining code");

        int a[] = new int[5];
        try
        {
            a[6]=94;
        }
        catch(ArrayIndexOutOfBoundsException e)         //just after try block
        {
            System.out.println(e + " handled ");          //only executed if exception is generated
        }
        System.out.println("Rest of the code");
    }
}
//prev is WrapperClass
//next is AWT