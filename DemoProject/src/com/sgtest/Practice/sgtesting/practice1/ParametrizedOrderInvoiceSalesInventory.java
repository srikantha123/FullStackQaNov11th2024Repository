package com.sgtest.Practice.sgtesting.practice1;
class order2
{
    String order;
    int ordernumber;
    order2(String Order,int Ordernumber)
    {
        order=Order;
        ordernumber=Ordernumber;
        System.out.println("order:"+order);
        System.out.println("ordername:"+ordernumber);
    }
}
class Invoice2
{
    String Documenttype;
    int amountpaid;
    Invoice2(String documenttype,int Amountpaid)
    {
        Documenttype=documenttype;
        amountpaid=Amountpaid;
        System.out.println("documenttype:"+Documenttype);
        System.out.println("amountpaid:"+Amountpaid);
    }
}
class sales2
{
    String product;
    int salesid;
    sales2(String Product,int Salesid)
    {
        product=Product;
        salesid=Salesid;
        System.out.println("product:"+product);
        System.out.println("salesid:"+salesid);
    }
}
class Inventory2
{
    int stockin;
    int stockbalance;
    Inventory2(int Stockin,int Stockbalance)
    {
        stockin=Stockin;
        stockbalance=Stockbalance;
        System.out.println("stockin:"+stockin);
        System.out.println("stockbalance:"+stockbalance);
    }
}
public class ParametrizedOrderInvoiceSalesInventory {
    public static void main(String[] args) {
        Inventory2 o1=new Inventory2(20,30);
        sales2 o2=new sales2("santoor",001);
        Invoice2 o3=new Invoice2("Hardcopy",1000);
        sales2 o4=new sales2("cholocate",13);
    }
}
