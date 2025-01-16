package com.sgtest.Practice.sgsoftAssignmentDay4;
class Division
{
    void Array()
    {
        int a=0;
        int count=0;
        int look=0;
        for(int i=0; i<=10;i++)
        {
            a=i*5;
            count=count+1;
            System.out.println(a+" ");
        }
        int b[]=new int[count];
        int k=0;
        for(int j=0;j<b.length;j++)
        {
            if( j%10==0)
            {
                b[k]= j;
                k=k+1;
            }
        }
        System.out.println("DivisibleBy10:"+b[k]);
    }
}
public class DivisibleBy10Main
{
    public static void main(String[] args)
    {
        Division o1=new Division();
        o1.Array();
    }
}
