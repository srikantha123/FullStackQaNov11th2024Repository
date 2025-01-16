package com.sgtest.Practice.sgtesting.practice1;
class Concatination{
    Concatination(char ch[][])
    {
        String s="  ";
        for(int i=0;i<ch.length;i++ )
        {
            s=s+ch[i][2];
        }
        System.out.println("concotination of character  " +s );
    }
}

public class ConcatinationDemo {
    public static void main(String[] args) {
        char test[][]={{'A','B','C'},{'D','E','F'},{'S','R','T'}};
        Concatination c1=new Concatination(test);
    }
}
