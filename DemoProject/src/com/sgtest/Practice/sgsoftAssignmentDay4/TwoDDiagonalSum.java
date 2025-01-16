package com.sgtest.Practice.sgsoftAssignmentDay4;
class DiagonalSum
{
    void DiagonalTwo()
    {
        short x[][]={{1,2,3},{4,5,6},{7,8,9}};
        short sum=0;
        for(int i=0;i<=x.length;i++)
        {
            for (int j = 0; j < x.length; j++)
                if (i == j)
                {
                    sum = (short) (sum + x[i][j]);
                }
        }
        System.out.println("Sum of Diagnoal:"+sum);

    }
}

public class TwoDDiagonalSum {
    public static void main(String[] args) {
        DiagonalSum o1=new DiagonalSum();
        o1.DiagonalTwo();
    }
}
