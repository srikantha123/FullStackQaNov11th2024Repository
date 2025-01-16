package com.sgtest.Practice.sgsoftAssignmentDay4;
class TwoDArrayAverage
{
    void Average()
    {
        double d[][]={{60.45,46.55,96.67},{88.99,90.99,62.78},{55.76,67.65,98.87}};
        double e[][]=new double[d.length][d[0].length];
        for(int i=0;i<d.length;i++)
        {
            double Averagee=0;
            double a=0;
            double sum=0;
            for(int j=0;j<d[0].length;j++)
            {
                sum=sum+d[i][j];
            }
            System.out.println(sum);
            Averagee=sum/d.length;
            System.out.println(Averagee);
        }
    }
}

public class TwoDArrayAverageColoum {
    public static void main(String[] args) {
        TwoDArrayAverage o1=new TwoDArrayAverage();
        o1.Average();
    }
}
