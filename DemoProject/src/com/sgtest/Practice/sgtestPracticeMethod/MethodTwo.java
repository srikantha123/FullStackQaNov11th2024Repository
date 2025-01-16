package com.sgtest.Practice.sgtestPracticeMethod;
class calculation2
{
    void addition(int x,int y)
    {
        int res=(x+y);
        System.out.println("Addition"+res);
    }
    void multiplication(int a,int b)
    {
        int res=(a*b);
        System.out.println("multiplication:"+res);
    }
}

public class MethodTwo {
    public static void main(String[] args) {
        calculation2 o1=new calculation2();
        o1.addition(30,20);
        o1.multiplication(20,10);
        o1.addition(50,40);
        o1.multiplication(60,80);
    }
}
