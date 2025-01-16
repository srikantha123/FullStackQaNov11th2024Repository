package PraticeJava;
abstract class Geometrics
{
    abstract void area();
}
class square extends Geometrics
{
    void area()
    {
        int side=10;
        System.out.println("Area of Square:"+side*side);
    }
}
class Rectangle extends Geometrics
{
    void area()
    {
        int l=10, b=20;
        System.out.println("Area of Rectangle:"+(l*b));
    }
}
class circle extends Geometrics
{
    void area()
    {
        double pi=3.14,r=2.5;
        System.out.println("Area of Circle:"+ (pi*r*r));
    }
}

public class Polymorphisam {
    public static void main(String[] args) {
        Geometrics figure=null;

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
