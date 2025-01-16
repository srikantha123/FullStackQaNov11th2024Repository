package com.sgtest.Practice.sgtesting.practice1;
class Student1
{
    String fullname;
    int number;
    Student1(String Name,int Number)
    {
        fullname=Name;
        number=Number;
        System.out.println("fullname:"+Name);
        System.out.println("number:"+Number);
    }
}

public class parameterizedconstructor {
    public static void main(String[] args)
    {
        Student1 o1= new Student1("srikantha",30);
    }
}
