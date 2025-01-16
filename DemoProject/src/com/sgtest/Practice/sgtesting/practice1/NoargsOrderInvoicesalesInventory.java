package com.sgtest.Practice.sgtesting.practice1;
class order1
{
    String order;
    int ordernumber;
    order1()
    {
        order="pickle";
        ordernumber=5;
        System.out.println("ordername:"+order);
        System.out.println("ordernumber:"+ordernumber);
    }
}
class Invoice1
{
    String Documenttype;
    int amountpaid;
    Invoice1()
    {
        Documenttype="Hardcopy";
        amountpaid=1000;
        System.out.println("Document:"+Documenttype);
        System.out.println("amountpaid:"+amountpaid);
    }
}
class sales1
{
    String product;
    int salesid;
    sales1()
    {
        product="bag";
        salesid=10;
        System.out.println("product:"+product);
        System.out.println("salesid:"+salesid);
    }
}
class Inventory1
{
    int stockin;
    int stockbalance;
    Inventory1()
    {
        stockin=2;
        stockbalance=10;
        System.out.println("stockin:"+stockin);
        System.out.println("stockbalance:"+stockbalance);
    }
}

public class NoargsOrderInvoicesalesInventory {
    public static void main(String[] args) {
        sales1 o1=new sales1();
        Inventory1 o2=new Inventory1();
        Invoice1 o3=new Invoice1();
        order1 o4=new order1();
    }
}
