package com.AbstrctClass_13;
/**
* 1.It is used to hide implementation details and showing only functionality to user
* 2.In other way, it shows only essential things to the user and hide their internal details.
* 3.Two ways 1.abstract class(0 to 100%) and 2. interface(100%)
 * 4.abstract class
 *  A class which is declared as abstract is known as abstract class. It can have abstract and non-abstract method.
 *  we cannot create a object of a abstract class.
*   we can not create the instance of the abstract class
*/

//This is an example of 100% abstraction if we want we can define non-abstract method but in case of interface we cannot
abstract class bike
{
   abstract void run();
}
class hero extends bike
{
    void run()
    {
        System.out.println("Run method of hero class");
    }
}
class royal extends bike
{
    void run()
    {
        System.out.println("Run method of Royal class");
    }
}
public class AbstractClass
{
    public static void main(String args[]) {
        bike obj = new hero();                          //upcast feature
        obj.run();
        obj = new royal();
        obj.run();
    }
}
