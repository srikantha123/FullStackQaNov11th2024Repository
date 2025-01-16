package com.sgtest.Practice.AssignmentPolymarchisam;
abstract class GeometricFigure
{
    abstract void area();
}
class square extends GeometricFigure
{
    void area()
    {
        int side=10;
        System.out.println("Area of square:"+ (side*side));
    }
}
class Rectangle extends GeometricFigure
{
    void area()
    {
        int l=10,b=15;
        System.out.println("Area of Rectangle:"+(l*b));
    }
}
class circle extends GeometricFigure
{
    void area()
    {
        double r=2.5,pi=3.14;
        System.out.println("Area of Circle:"+(pi*r*r));
    }
}
public class Practice1 {
    public static void main(String[] args) {
        GeometricFigure figure=null;

        square o=new square();
        Rectangle o1=new Rectangle();
        circle o2=new circle();

        figure=o;
        figure.area();

        figure=o1;
        figure.area();

        figure=o2;
        figure.area();

    }
}
