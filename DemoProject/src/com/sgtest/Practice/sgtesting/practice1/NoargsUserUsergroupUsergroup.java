package com.sgtest.Practice.sgtesting.practice1;
class user1
{
    String firstname;
    int age;
    user1()
    {
        firstname="srikantha";
        age=25;
        System.out.println("firstname:"+firstname);
        System.out.println("age:"+age);
    }
}
class userprofile1
{
    String username;
    String gender;
    userprofile1()
    {
        username="srikantha";
        gender="male";
        System.out.println("username:"+username);
        System.out.println("gender:"+gender);
    }
}
class usergroup1
{
    String name;
    int count;
    usergroup1()
    {
        name="cinni";
        count=5;
        System.out.println("name:"+name);
        System.out.println("count:"+count);
    }
}
public class NoargsUserUsergroupUsergroup
{
    public static void main(String[] args) {
        user1 o1=new user1();
        userprofile1 o2=new userprofile1();
        usergroup1 o3=new usergroup1();
    }
}
