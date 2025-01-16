package com.sgtest.Practice.sgtesting.practice1;
class user2
{
    String firstname;
    int age;
    user2(String Firstname,int Age)
    {
        firstname=Firstname;
        age=Age;
        System.out.println("Firstname:"+firstname);
        System.out.println("Age:"+age);
    }
}
class userprofile2
{
    String username;
    String gender;
    userprofile2(String Username,String Gender)
    {
        username=Username;
        gender=Gender;
        System.out.println("username:"+username);
        System.out.println("gender:"+gender);
    }
}
class usergroup2
{
    String name;
    int count;
    usergroup2(String Name,int Count)
    {
        name=Name;
        count=Count;
        System.out.println("name:"+name);
        System.out.println("count:"+count);
    }
}

public class ParametrizedUserUserprofileUsergroup {
    public static void main(String[] args)
    {
        user2 o1= new user2("srikantha",25);
        userprofile2 o2=new userprofile2("siri","male");
        usergroup2 o3=new usergroup2("sri",10);
    }
}
