package com.sgtest.Practice.sgtestPracticeMethod;
class EName
{
    void Name(String name)
    {
        System.out.println("Name:"+name);
    }
    String getName(String name)
    {
        return name;
    }
}
public class ReturnPracticeMain2 {
    public static void main(String[] args) {
        EName o=new EName();
        o.Name("Srikantha");
        String v1=o.getName("Srikantha");
        System.out.println(v1);
    }
}


