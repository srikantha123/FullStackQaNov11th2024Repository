package com.sgtest.Practice.sgtesting.practice1;
class Person
{
    String fullname;
    int age;
}
public class Defaultconstructor
{
    public static void main(String[] args) {
        Person obj1=new Person();
        obj1.fullname="srikantha";
        obj1.age=21;
        System.out.println("Fullname:"+obj1.fullname);
        System.out.println("Fullname:"+obj1.age);

    }
}
