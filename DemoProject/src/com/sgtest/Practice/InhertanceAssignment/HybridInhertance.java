package com.sgtest.Practice.InhertanceAssignment;
class Store
{
    void Store1(String storename)
    {
        System.out.println("Storename:"+storename);
    }
}
class StoreDetails extends Store
{
    void StoreDetails1(String items)
    {
        System.out.println("Itemsname:"+items);
    }
}
class StoreDepartmentnames extends Store
{
    void StoreDepartmentnames1(String name)
    {
        System.out.println("Departmentsname:"+name);
    }
}
class Storebalance extends StoreDepartmentnames
{
    void Storebalance1(int balance)
    {
        System.out.println("Balance:"+balance);
    }
}

public class HybridInhertance
{
    public static void main(String[] args)
    {
        StoreDetails o=new StoreDetails();
        o.StoreDetails1("Rinsoap");
        o.Store1("Kiranashop");
        Storebalance s=new Storebalance();
        s.Storebalance1(12);
        s.StoreDepartmentnames1("Sales");
        s.Store1("Bigbasket");



    }
}
