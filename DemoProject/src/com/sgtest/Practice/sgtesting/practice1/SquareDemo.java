package com.sgtest.Practice.sgtesting.practice1;

class Square{
    Square(int x[][])
    {
        int z[][]=new int[x.length][x[0].length];
        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
            {
                z[i][j]=x[i][j]*x[i][j];
                System.out.print(z[i][j]+  "   ");
            }
            System.out.println();
        }
    }
}
public class SquareDemo {
    public static void main(String[] args) {
        int y[][]={{2,3,4},{5,6,7},{8,9,10}};
        Square s1=new Square(y);

    }
}

