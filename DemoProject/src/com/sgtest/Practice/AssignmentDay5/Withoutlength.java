package com.sgtest.Practice.AssignmentDay5;
class Length
{
    int FindLength(byte b[][])
    {
        int count=0;
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                count=count+1;
            }
        }
        return count;
    }
}


public class Withoutlength
{
    public static void main(String[] args)
     {
        Length o=new Length();
        byte b[][]={{5,8,9,2},{2,7,6,3},{6,2,8,1}};
        int x=o.FindLength(b);
        System.out.println("length of given array:"+x);

    }
}
