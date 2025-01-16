package com.sgtest.Practice.sgsoftAssignmentDay4;
class PrimeNumber
{
    void primesum()
    {
        int sum=0;
        for(int i=2;i<=100;i++)
        {
            int look=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    look=look+1;
                    break;
                }
            }
            if(look==0)
            {
                sum=sum+i;
            }
        }
        System.out.println("sum of prime numbers:"+sum);
    }
}

public class PrimenumberSum
{
    public static void main(String[] args)
    {
        PrimeNumber o=new PrimeNumber();
        o.primesum();
    }
}
