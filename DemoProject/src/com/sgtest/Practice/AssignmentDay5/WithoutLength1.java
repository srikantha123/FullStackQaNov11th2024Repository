package com.sgtest.Practice.AssignmentDay5;
class Length1
{
    int FindLength(byte a[][])
    {
        int count=0;
        for(byte b[]:a)
        {
            for(byte x:b)
            {
                count=count+1;
            }
        }
        return count;
    }
}

public class WithoutLength1 {
    public static void main(String[] args) {
        Length1 o=new Length1();
        byte c[][]={{1,2,3,},{4,5,6},{7,8,9}};
        int count=o.FindLength(c);
        System.out.println("count Elements:"+count);
    }
}
