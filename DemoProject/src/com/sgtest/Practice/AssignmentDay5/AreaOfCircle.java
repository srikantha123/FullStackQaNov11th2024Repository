package com.sgtest.Practice.AssignmentDay5;
class Area
{
    double Circle(double r)
    {
        double area=0;
        area=3.14*r*r;
        return area;
    }
}

public class AreaOfCircle {
    public static void main(String[] args) {
        Area o=new Area();
        double v1=o.Circle(2.5);
        System.out.println("Area of Circle:"+v1);
    }
}
