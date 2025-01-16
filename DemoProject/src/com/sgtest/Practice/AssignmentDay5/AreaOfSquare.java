package com.sgtest.Practice.AssignmentDay5;
class Square
{
    int Area(int a)
    {
        int AreaofSquare=a*a;
        return AreaofSquare;
    }
}

public class AreaOfSquare {
    public static void main(String[] args) {
        Square o=new Square();
        int v1=o.Area(10);
        System.out.println("AreaOfSquare:"+v1);
    }
}
