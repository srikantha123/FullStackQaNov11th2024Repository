package com.sgtest.Practice.sgtestPracticeMethod;
class calculator
{
    void addition()
    {
        int x,y;
        x=40;y=50;
        int res=(x+y);
        System.out.println("Addition:"+res);
    }
    void multiplication()
    {
        int x,y;
        x=15;y=10;
        int res=(x*y);
        System.out.println("multiplication:"+res);
    }
}


public class Methodone {
    public static void main(String[] args) {
        calculator o1=new calculator();
        o1.addition();
        o1.multiplication();
    }
}
