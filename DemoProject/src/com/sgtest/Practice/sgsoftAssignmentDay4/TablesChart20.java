package com.sgtest.Practice.sgsoftAssignmentDay4;
class Tables20
{
    int a=0;
    int num;
    void chart(int num)
    {
        for(int i=1;i<=10;i++)
        {
            a = num * i;
            System.out.println("multiplication:"+num+"*"+i+"=="+a+"   ");
        }
        System.out.println();
    }
}

public class TablesChart20
{
    public static void main(String[] args)
    {
        Tables20 o = new Tables20();
        o.chart(1);
        o.chart(2);
        o.chart(3);
        o.chart(4);
        o.chart(5);
        o.chart(6);
        o.chart(7);
        o.chart(8);
        o.chart(9);
        o.chart(10);
        o.chart(11);
        o.chart(12);
        o.chart(13);
        o.chart(14);
        o.chart(15);
        o.chart(16);
        o.chart(17);
        o.chart(18);
        o.chart(19);
        o.chart(20);
    }
}