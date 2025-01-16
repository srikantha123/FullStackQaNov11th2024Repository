package com.sgtest.Practice.AssignmentDay5;
class Hobbies
{
    String Multiple(String name)
    {
        return name;
    }
}

public class MultipleHobbiesMain {
    public static void main(String[] args) {
        Hobbies o=new Hobbies();
        String v1=o.Multiple("Circket");
        String v2=o.Multiple("Footboll");
        String v3=o.Multiple("Tennies");
        String v4=o.Multiple("Kabbadi");
        String v5=o.Multiple("Koko");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
    }
}
