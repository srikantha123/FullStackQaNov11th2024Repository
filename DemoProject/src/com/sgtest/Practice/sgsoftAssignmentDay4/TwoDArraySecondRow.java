package com.sgtest.Practice.sgsoftAssignmentDay4;
class SecondRow
{
    void SecondNum(byte x[][])
    {
        for(int i=0;i<x.length;i++)
        {
            int c=0;
            for(int j=0;j<x[i].length;j++)
            {
                c=x[2][i];
            }
            System.out.print(c);
        }
    }
}

public class TwoDArraySecondRow {
    public static void main(String[] args) {
        SecondRow o1=new SecondRow();
        byte x[][]={{1,2,3},{4,5,6},{7,8,9}};
        o1.SecondNum(x);
    }
}
