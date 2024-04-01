package com.ExceptionHandling_17;
/**
* we can write muliple catch block for one try block
*/
public class multipleCatch
{
    public static void main(String args[]) {
        try {
            int x[] = new int[5];
            x[5] = 3434 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Rest of the code");
    }
}
