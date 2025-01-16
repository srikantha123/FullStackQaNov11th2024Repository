package com.sgtest.Practice.sgsoftAssignmentDay4;
class TwoDArray
{
    void Array()
    {
        Double a[][]={{10.3,20.45,89.9},{43.4,66.8,77.8},{20.55,67.87,77.19}};
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<a[0].length;j++)
                {
                    System.out.print(a[i][j]+"  ");
                }
                System.out.println();
            }
    }
}

public class DoubleArray {
    public static void main(String[] args) {
        TwoDArray o1=new TwoDArray();
        o1.Array();
    }
}

