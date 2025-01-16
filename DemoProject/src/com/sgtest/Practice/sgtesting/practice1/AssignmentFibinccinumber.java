package com.sgtest.Practice.sgtesting.practice1;
class fib
{
    fib(int num)
    {
        int fn=0;
        int sn=1;
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            int tn=fn+sn;
            fn=sn;
            sn=tn;
            System.out.println("fib number:"+tn);
        }
    }
}

public class AssignmentFibinccinumber {
    public static void main(String[] args) {
        fib o1=new fib(8);
    }
}
