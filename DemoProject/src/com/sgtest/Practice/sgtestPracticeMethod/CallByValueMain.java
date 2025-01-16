package com.sgtest.Practice.sgtestPracticeMethod;
class CallByValue
{
    void calculate(int x,int y)
    {
        x=x+100;
        y=y*9;
        System.out.println("in method valve:"+x);
        System.out.println("in method valve:"+y);
    }
}
public class CallByValueMain
{
    public static void main(String[] args)
    {
        int x,y;
        x=10;y=20;
        System.out.println("in valve:"+x);
        System.out.println("in valve:"+y);
        CallByValue o=new CallByValue();
        o.calculate(x,y);
        System.out.println("after method valve:"+x);
            System.out.println("after method valve:"+y);
    }
}
