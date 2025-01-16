package com.sgtest.Practice.InterfaceAssignments;
interface Sweet
{
    abstract void SweetNames(String name);
}
interface SweetTypes extends Sweet
{
    abstract void SweetVarity(String name);
}
interface SweetCost extends SweetTypes
{
    abstract void SweetPrice(int numbers);
}
class sugur implements SweetCost
{
    public void SweetNames(String name)
    {
        System.out.println("SNAme:"+name);
    }
    public void SweetVarity(String name)
    {
        System.out.println("Stypes:"+name);
    }
    public void SweetPrice(int numbers)
    {
        System.out.println("Sprice:"+numbers);
    }
}
public class WAPOneInterfaceExtendAnother {
    public static void main(String[] args) {
        sugur o=new sugur();
        o.SweetNames("kalakhan");
        o.SweetPrice(580);
        o.SweetVarity("Ten");
    }
}
