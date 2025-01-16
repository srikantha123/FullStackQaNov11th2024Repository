package com.sgtest.Practice.InhertanceAssignment;
class Store3
{
    Store3(String Storename)
    {
        System.out.println("Shopname:"+Storename);
    }
}
class Detailsname extends Store3
{
    int Balance;
    String items;
    Detailsname(int Balnce,String item,String name)
    {
        super(name);

        this.Balance=Balnce;
        this.items=item;
        System.out.println("Balance:"+Balance);
        System.out.println("items:"+items);
    }
}

public class Pconstructor
{
    public static void main(String[] args)
    {
        Detailsname o=new Detailsname(12,"soap","Grosory");

    }
}
