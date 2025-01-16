package com.sgtest.Practice.sgtestPracticeMethod;
class Calculation1
{
    int  add1(int x,int y)
    {
        return (x+y);
    }
    int sub1(int a,int b)
    {
        return (a-b);
    }
    void Multiplication()
    {
        int x=this.add1(12,3);
        int y=this.sub1(10,5);
        int res=(x*y);
        System.out.println("Multiplication:"+res);
        System.out.println("Addition:"+x);
        System.out.println("Substraction:"+y);
    }
}

public class WithinBodyOtherMethod {
    public static void main(String[] args) {
        Calculation1 o=new Calculation1();
        o.Multiplication();
    }
}
