package com.sgtest.Practice.sgsoftAssignmentDay4;
class CharArray
{
    void Char()
    {
        char ch[][]={{'A','B','C','D'},{'E','F','G','H'},{'I','J','K','L'}};
        for(int i=ch.length-1;i>=0;i--)
        {
            for(int j=ch[0].length-1;j>=0;j--)
            {
                System.out.print(ch[i][j]);
            }
        }
    }
}

public class CharArray2Into2
{
    public static void main(String[] args) {
        CharArray o1=new CharArray();
        o1.Char();
    }
}
