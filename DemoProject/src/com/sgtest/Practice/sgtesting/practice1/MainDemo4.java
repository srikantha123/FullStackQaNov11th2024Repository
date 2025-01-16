package com.sgtest.Practice.sgtesting.practice1;

class flower
{
    String flowername;
    String flowercolour;
    int flowerprice;
    String flowertypes;
}
class fruit
{
    String fruitname;
    int fruitprice;
    String fruitcolour;
    String fruittypes;
}
class vegitables
{
    String vegitablesname;
    int vegitablesprice;
    String vegitablescolor;
    String vegitablestype;
}

    public class MainDemo4
    {
        public static void main(String args[])
        {
            flower obj1 = new flower();
            obj1.flowername = "rose";
            obj1.flowertypes = "three";
            obj1.flowercolour = "red";
            obj1.flowerprice = 15;
            System.out.println("flowername:" + obj1.flowername);
            System.out.println("flowertype:" + obj1.flowertypes);
            System.out.println("flowercolour:" + obj1.flowercolour);
            System.out.println("flowerprice:" + obj1.flowerprice);
            fruit obj2 = new fruit();
            obj2.fruitname = "apple";
            obj2.fruitcolour = "red";
            obj2.fruittypes = "3";
            obj2.fruitprice = 35;
            System.out.println("fruitname:" + obj2.fruitname);
            System.out.println("friutcolour:" + obj2.fruitcolour);
            System.out.println("fruittypes:" + obj2.fruittypes);
            System.out.println("friutprice:" + obj2.fruitprice);
            vegitables obj3 = new vegitables();
            obj3.vegitablesname = "onion";
            obj3.vegitablescolor= "red";
            obj3.vegitablesprice =30;
            obj3.vegitablestype="two";
            System.out.println("vegitablesname:" + obj3.vegitablesname);
            System.out.println("vegitablescolor:" + obj3.vegitablescolor);
            System.out.println("vegitablesprice:" + obj3.vegitablesprice);
            System.out.println("vegitablestype:" + obj3.vegitablestype);
        }
    }