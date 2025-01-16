package com.sgtest.Practice.sgtesting.practice1;
class flower2
{
    String flowername;
    int price;
    flower2(String Flowername,int Price)
    {
        flowername=Flowername;
        price=Price;
        System.out.println("flowername:"+flowername);
        System.out.println("price:"+price);
    }
}
class fruit2
{
    String fruitname;
    int price;
    fruit2(String Fruitname,int Price)
    {
        fruitname=Fruitname;
        price=Price;
        System.out.println("friutname:"+fruitname);
        System.out.println("price:"+price);

    }
}
class vegitables2
{
    String vegitablesname;
    int price;
    vegitables2(String Vegitables,int Price )
    {
       vegitablesname=Vegitables;
       price=Price;
        System.out.println("vegitables"+vegitablesname);
        System.out.println("Price:"+price);
    }
}
public class ParametrizedFlowerFruitVegitables
{
    public static void main(String[] args)
    {
        flower2 o1=new flower2("jasmine",+50);
        fruit2 o2=new fruit2("Apple",100);
        vegitables2 o3=new vegitables2("Drumstick",33);
    }

}
