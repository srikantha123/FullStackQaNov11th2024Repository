package com.sgtest.Practice.sgsoftAssignmentDay4;
class PrimeCount
{
    void Count(int x,int y)
    {
        int count=0;
        for(int i=x;i<=y;i++)
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
                count=count+1;
            }
        }
        System.out.println("count prime numbers:"+count);
    }
}

public class CountPrimeNumbers100To200
{
    public static void main(String[] args) {
        PrimeCount o=new PrimeCount();
        o.Count(100,200);
    }
}
