package com.sgtest.Practice.AssignmentDay5;
class SumArray
{
    int[]getElements(int a[])
    {
            int sum=0;
            for(int i=0;i<a.length;i++)
            {
                sum=sum+a[i];
            }
        return new int[]{sum};

    }
}

public class SumOfElements1DArray {
    public static void main(String[] args) {
        SumArray o=new SumArray();
        int zz[]={2,4,6,8,20};
        int res[]=o.getElements(zz);
        for(int p:res)
        {
            System.out.println(p);
        }
    }
}
