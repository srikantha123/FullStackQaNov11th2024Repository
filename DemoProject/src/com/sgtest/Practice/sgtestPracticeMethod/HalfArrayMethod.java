package com.sgtest.Practice.sgtestPracticeMethod;
class Maths1
{
    short[]getElements(short a[])
    {
        int size=a.length/2;
        short b[]=new short[size];
        int k=0;
        for(int i=0;i<a.length/2;i++)
        {
            b[k]=a[i];
            k++;
        }
        return b;
    }
}
public class HalfArrayMethod
{
    public static void main(String[] args)
    {
        Maths1 o=new Maths1();
        short zz[]={10, 20, 30, 40,50,60,70,80};
        short res[]=o.getElements(zz);
        for(short p:res)
        {
            System.out.println(p);
        }
    }
}
