package com.sgtest.Practice.sgtesting.practice1;


class SumofNum
{
    SumofNum(int x[],int y[])
    {
        int z[]=new int[x.length];
        for(int i=0;i<x.length;i++)
        {
            z [i]=x[i] +y[i];
            System.out.print(z[i] +" ");
        }
        System.out.println();
    }
}







public class MainDemoSubtraction {


    public static void main(String[] args) {

        int x[]={1,2,3,4};
        int y[]={4,8,9,10};
        SumofNum s1=new SumofNum(x,y);
    }
}




