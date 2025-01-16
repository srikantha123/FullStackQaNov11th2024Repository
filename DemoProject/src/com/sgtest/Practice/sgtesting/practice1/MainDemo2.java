package com.sgtest.Practice.sgtesting.practice1;

class Order
{
    String Ordername;
    int Ordernumber;
    String ShippingLocation;
    int Customernumber;
}
class Invoice
{
    String DocumentType;
    String Status;
    int DueAmount;
    int PaidAmount;
}
class Sales {
    int salesId;
    String Product;
    String Supplier;
    String region;
}
class Inventory {
    int stockin;
    int stockout;
    int stockbalance;
}
public class MainDemo2
{
    public static void main(String args[]) {
        Order obj1 = new Order();
        obj1.Ordername = "Pickels";
        obj1.Ordernumber = 1;
        obj1.ShippingLocation = "Banglore";
        obj1.Customernumber = 9891;
        System.out.println("ordername:" + obj1.Ordername);
        System.out.println("ordernumber:" + obj1.Ordernumber);
        System.out.println("shippinglocation:" + obj1.ShippingLocation);
        System.out.println("Empjob:" + obj1.Customernumber);
        System.out.println("+++++++++++");
        Invoice obj2 = new Invoice();
        obj2.DocumentType = "Record";
        obj2.Status = "Active";
        obj2.PaidAmount = 1000;
        obj2.DueAmount = 9891;
        System.out.println("documenttype:" + obj2.DocumentType);
        System.out.println("status:" + obj2.Status);
        System.out.println("paidamount:" + obj2.PaidAmount);
        System.out.println("dueamount:" + obj2.DueAmount);
        System.out.println("+++++++++++");
        Sales obj3 = new Sales();
        obj3.salesId = 101;
        obj3.Product = "Pickels";
        obj3.Supplier = "Srikantha";
        obj3.region = "Raichur";
        System.out.println("salesid:" + obj3.salesId);
        System.out.println("Product:" + obj3.Product);
        System.out.println("supplier:" + obj3.Supplier);
        System.out.println("Region:" + obj3.region);
        System.out.println("+++++++++++");
        Inventory obj4 = new Inventory();
        obj4.stockin = 100;
        obj4.stockout = 200;
        obj4.stockbalance = 50;
        System.out.println("stockin:" + obj4.stockin);
        System.out.println("stockout:" + obj4.stockout);
        System.out.println("stockbalance:" + obj4.stockbalance);
        System.out.println("+++++++++++");




    }



}