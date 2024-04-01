package com.ExceptionHandling_17;
/** Finally Block
 * 1.Finally block can be written just after try block or catch block.
 * 2.finally method is always executed whether there is exception present or
 *  not even if catch is not present then also it will execute
 * 3. These can be used if some thing is to executed every time.
 */
public class finallymethod
{
    public static void main(String args[])
    {
        try
        {
            int x =20/0;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("It is always executed");
        }
        System.out.println("Rest of the code");
    }
}
