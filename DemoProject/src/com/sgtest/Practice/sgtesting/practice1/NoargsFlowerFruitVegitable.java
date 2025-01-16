package com.sgtest.Practice.sgtesting.practice1;
class flower1
{
    String flowername;
    int flowerprice;
    flower1()
    {
        flowername="Rose";
        flowerprice=3;
        System.out.println("flowername:"+flowername);
        System.out.println("flowerprice:"+flowerprice);
    }
}
class fruit1
{
    String fruitname;
    int fruitprice;
    fruit1()
    {
        fruitname="jackfruit";
        fruitprice=10;
        System.out.println("fruitname:"+fruitname);
        System.out.println("fruitprice:" +fruitprice);
    }

}
class vegitables1
{
    String vegitablename;
    int price;
    vegitables1()
    {
        vegitablename="Tomoto";
        price=30;
        System.out.println("vegitablename:"+vegitablename);
        System.out.println("price:"+price);
    }
}

public class NoargsFlowerFruitVegitable
{
    public static void main(String[] args)
    {
        flower1 o1 = new flower1();
        fruit1 o2=new fruit1();
        vegitables1 o3=new vegitables1();
    }
}
