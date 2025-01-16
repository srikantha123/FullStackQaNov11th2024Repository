package com.sgtest.Practice.sgtesting.practice1;
class Maths2
{
    Maths2(char ch[][])
    {
        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<ch[i].length;j++)
            {
                System.out.print(ch[j][i]+" ");
            }
            System.out.println();
        }

    }
}

public class PracticeTransposematrix {
    public static void main(String[] args) {
        char testing[][]={{'a','b','c'},{'d','e','f'},{'g','h','i'}};
            Maths2 o1=new Maths2(testing);
            Maths2 o2=new Maths2(new char[][]{{'x','y'},{'P','Q'}});
    }
}
