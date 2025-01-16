package com.sgtest.Practice.sgtesting.practice1;
class Maths1
{
    Maths1(int num)
    {
        int fact=1;
        for(int i=num;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println("factorial num:"+fact);
    }
}

public class PracticefFctorial {
    public static void main(String[] args) {
        Maths1 o1=new Maths1(4);
    }
}
