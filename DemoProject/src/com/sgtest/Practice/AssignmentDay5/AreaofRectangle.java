package com.sgtest.Practice.AssignmentDay5;
class Rectangle
{
    int Calculation(int x,int y)
    {
        int area=x*y;
        return area;
    }
}

public class AreaofRectangle {
    public static void main(String[] args) {
        Rectangle o=new Rectangle();
        int v1=o.Calculation(12,13);
        System.out.println("Area of Rectangle:"+v1);
    }
}
