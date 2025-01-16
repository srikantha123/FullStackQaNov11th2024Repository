package com.sgtest.Practice.sgtestPracticeMethod;
class Math
{
    void FindMath(int num)
    {
        int fact=1;
        for(int i=num;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of num:"+fact);
    }

    int getFact(int num)
    {
        int fact=1;
        for(int i=num;i>=1;i--)
        {
            fact=fact*i;
        }
        return fact;
    }
}

public class FactorialReturnValue {
    public static void main(String[] args) {
        Math o=new Math();
        o.FindMath(8);
        int v1=o.getFact(7);
        System.out.println("Factorial:"+v1);
    }
}
