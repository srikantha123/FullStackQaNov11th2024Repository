package com.sgtest.Practice.sgtestPracticeMethod;
class Prime
{
    boolean isPrime(int num)
    {
        int flag=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag=flag+1;
                break;
            }
        }
        if(flag==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
public class PrimeCalculation {
    public static void main(String[] args) {
        Prime o=new Prime();
        boolean v1=o.isPrime(21);
        System.out.println(v1);
        //find sum of prime in between 1 to 50;
        int sum=0;
        for(int i=1;i<=50;i++)
        {
            if(o.isPrime(i)==true)
            {
                sum=sum+i;
            }
        }
        System.out.println("sum of Primenumbers 1 to 50:"+sum);
        //find count of primein 100 to 150
        int count=0;
        for(int i=0;i<=150;i++)
        {
            if(o.isPrime(i)==true)
            {
                count=count+1;
            }
        }
        System.out.println("count prime number:"+count);
    }
}
