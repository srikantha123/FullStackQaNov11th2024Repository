package com.sgtest.Practice.InhertanceAssignment;
class Customer
{
    void displayName(String cusName)
    {
        System.out.println("Custermer:"+cusName);
    }
}
class Order extends Customer
{
    Order(String cusName)
    {
        super.displayName(cusName);
    }
    void dispalayName(String ordName)
    {
        System.out.println("Ordername:"+ordName);
    }
}
class Shipping extends Order
{
    Shipping(String ordName,String cusName)
    {
        super(cusName);
        super.dispalayName(ordName);
    }
    void displayName(String shipname)
    {
        System.out.println("shipping:"+shipname);
    }
}

public class MultilevelSameMethod
{
    public static void main(String[] args)
    {
        Shipping o=new Shipping("Mobile Order","Dinesh");
        o.displayName("PortBlar");
        o.dispalayName("smart");
    }
}
