package com.sgtest.Practice.AssignmentPolymarchisam;
abstract class Mathematics
{
    abstract void Calculations();
}
class Addtion extends Mathematics
{
    void Calculations()
    {
        int a=10,b=20;
        System.out.println("Addition:"+(a+b));
    }
}
class Substraction extends Mathematics
{
    void Calculations()
    {
        int x=20,y=5;
        System.out.println("Substraction:"+(x-y));
    }
}
class Multiplication extends Mathematics
{
    void Calculations()
    {
        int c=10,d=8;
        System.out.println("Multiplication:"+(c*d));
    }
}
class Division extends Mathematics
{
    void Calculations()
    {
        int e=50,f=5;
        System.out.println("Division:"+(e/f));
    }
}
public class Assignment1Mathematics {
    public static void main(String[] args) {
        Addtion o=new Addtion();
        o.Calculations();
        Substraction o1=new Substraction();
        o1.Calculations();
        Multiplication o2=new Multiplication();
        o2.Calculations();
        Division o3=new Division();
        o3.Calculations();
    }
}
