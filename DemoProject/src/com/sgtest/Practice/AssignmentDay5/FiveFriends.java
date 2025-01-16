package com.sgtest.Practice.AssignmentDay5;
class  FiveFriendsName
{
    String getName(String name)
    {
        return name;
    }
}
public class FiveFriends {
    public static void main(String[] args) {
        FiveFriendsName o=new FiveFriendsName();
        String v1=o.getName("Srikantha");
        System.out.println(v1);
        String v2=o.getName("Rama");
        System.out.println(v2);
        String v3=o.getName("Krishna");
        System.out.println(v3);
        String v4=o.getName("Deva");
        System.out.println(v4);
        String v5=o.getName("Devi");
        System.out.println(v5);
    }
}
