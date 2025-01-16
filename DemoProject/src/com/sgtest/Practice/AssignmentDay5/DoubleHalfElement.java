package com.sgtest.Practice.AssignmentDay5;
class Half
{
    int[] getElements(int a[])
    {
        int k=0;
        int size=a.length/2;
        int b[]=new int[size];
        for(int i=a.length/2;i<a.length;i++)
        {
            b[k]=a[i];
            k++;
        }
        return b;
    }
}
public class DoubleHalfElement
{
    public static void main(String[] args)
    {
        Half o=new Half();
        int z[]={10,20,30,40,50,60,70,80};
        int r[]=o.getElements(z);
        for(int p:r)
        {
            System.out.println(p);
        }
    }
}
