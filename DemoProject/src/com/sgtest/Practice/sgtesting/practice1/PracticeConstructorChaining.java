package com.sgtest.Practice.sgtesting.practice1;
class Library1
{
    Library1(String bookname)
    {
        System.out.println("Bookname:"+bookname);
    }
    Library1(String edition,int noofpages)
    {
        this("java");
        System.out.println("Edition:"+edition+"noofpages:"+noofpages);
    }
}

public class PracticeConstructorChaining {
    public static void main(String[] args) {
        Library1 o2=new Library1("first edition",  120);
    }
}
