package com.sgtest.Practice.AssignmentDay6;
class Outer2
{
    String fullname;
    Inner2 inner=new Inner2();
    void showage()
    {
        int getAge = 0;
        System.out.println("Age:"+getAge);
    }
    class Inner2
    {
        private int age;
        void name()
        {
            fullname="Sri";
            System.out.println("name:"+fullname);
        }
        public int getAge()
        {
            return age;
        }
        public void setAge(int age)
        {
            this.age = age;
        }
    }
}

public class InnerAndOuter2 {
    private static String[] args;

    public static void main(String[] args) {
        //InnerAndOuter2.args = args;
        Outer2 outer=new Outer2();
        //outer.showage();
        outer.inner.setAge(22);
        System.out.println("age:"+outer.inner.getAge());
        outer.inner.name();
    }
}
