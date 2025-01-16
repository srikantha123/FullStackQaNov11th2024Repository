package com.sgtest.Practice.sgtestPracticeMethod;
class Name
{
    void ShowName(String name)
    {
        System.out.println("name is:"+name);
    }
    String getName(String name)
    {
        return name;
    }

}

public class ReturnDemoPractice {
    public static void main(String[] args) {
        Name o=new Name();
        o.ShowName("Srikantha");
        String v1=o.getName("Srikantha");
        System.out.println(v1);
        String v2=o.getName("Sri");
        System.out.println(v2);


    }
}
