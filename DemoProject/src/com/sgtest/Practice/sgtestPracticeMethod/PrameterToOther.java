package com.sgtest.Practice.sgtestPracticeMethod;
class Calculation
{
    int add1(int x,int y)
    {
        return (x+y);
    }
    int sub1(int a,int b)
    {
        int res=(a-b);
        return res;
    }
    void Multiplication(int x,int y)
    {
        int res=(x*y);
        System.out.println("Multiplication:"+res);
    }
}

public class PrameterToOther {
    public static void main(String[] args) {
        Calculation o=new Calculation();
        int v1=o.add1(10,5);
        int v2=o.sub1(25,22);
        System.out.println("Addition:"+v1);
        System.out.println("subtraction::"+v2);
        o.Multiplication(v1,v2);
        //o.Multiplication(o.add1(12,8),o.sub1(45,40));
    }
}

