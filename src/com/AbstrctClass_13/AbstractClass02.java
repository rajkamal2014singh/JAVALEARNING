package com.AbstrctClass_13;

abstract class bank
{
    abstract float getInterest();
}

class sbi extends bank
{
    float getInterest()
    {
        return 6.8f;
    }
}
class pnb extends bank
{
    float getInterest()
    {
        return 5.8f;
    }
}
class icici extends bank
{
    float getInterest()
    {
        return 5.3f;
    }
}

public class AbstractClass02
{
    public static void main(String args[])
    {
        bank obj = new sbi();
        System.out.println("Rate of Interest : " + obj.getInterest());

        obj = new pnb();
        System.out.println("Rate of Interest : " + obj.getInterest());

        obj = new icici();
        System.out.println("Rate of Interest : " + obj.getInterest());
    }
}
//previous InstanceOfOperator
//next InterfaceClass