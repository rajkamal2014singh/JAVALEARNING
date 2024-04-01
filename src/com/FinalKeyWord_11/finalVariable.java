package com.FinalKeyWord_11;
/**
 * Final keyword in java
 * final keyword will be used on a variable, method or a class.
 * 1.using final keyword on a variable
 * when we make any variable final then it becomes a constant. If we try to change its value then compile
 * time error will be given.
 * Example :
 * class a
 * {
 *     final int a=10;
 *     void change(){
 *         a=20;    //compile time error
 *     }
 * }
 * 2.if final variable is not initialized then it can only be initialized within a constructor
 * Example :
 *  * class a
 *  * {
 *  *     final int a;
 *  *     void change(){
 *  *         a=20;    //compile time error can not be initialized in any other method
 *  *     }
 *  3.If we make any method final then it cannot be overridden
 *  4.If we make any class final then it can not be extended.
 *  * }
 * */

//if we make any variable final it is constant
//if we try to change final variable it will show compile time error

public class finalVariable
{
    public static void main(String args[])
    {
        final int x =20;
//        x=34;                       //it shows error as it cant be changed
        System.out.println(x);
    }
}
//previous runTimePolymorphism
//next instaceOfOperator