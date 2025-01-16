package com.sgtest.Practice.sgtesting.practice1;

class Fooditems
{
    Fooditems(String name)
    {
        System.out.println("name:"+name);
    }
    Fooditems(int noitems,String types)
    {
        System.out.println("noitems:"+noitems+"types:"+types);
    }
    Fooditems(String color,int noofcolor)
    {
        System.out.println("color:"+color+"noofcolor:"+noofcolor);
    }
}
public class MainDemo7{
    public static void main(String[] args) {
        Fooditems o1=new Fooditems("Applecurry");
        Fooditems o2=new Fooditems(5,"rrr");
        Fooditems o3=new Fooditems("Red",5);
    }
}
