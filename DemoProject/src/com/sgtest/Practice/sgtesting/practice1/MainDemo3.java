package com.sgtest.Practice.sgtesting.practice1;

class user
{
    String firstname;
    int age;
    String lastname;
    int userid;
}
class userprofile
{
    String username;
    String gender;
    String emailid;
    String password;
}
class usergroup
{
    String name;
    int count;
}

public class MainDemo3 {
    public static void main(String args[]) {
        user obj1 = new user();
        obj1.firstname = "srikantha";
        obj1.age = 25;
        obj1.lastname = "pujar";
        obj1.userid = 9891;
        System.out.println("firstname:"+obj1.firstname);
        System.out.println("age:"+obj1.age);
        System.out.println("lastname:"+obj1.lastname);
        System.out.println("userid:"+obj1.userid);
        userprofile obj2 = new userprofile();
        obj2.username = "srikantha";
        obj2.gender = "male";
        obj2.emailid = "srikantha9891@gmail.com";
        obj2.password = "sri123";
        System.out.println("username:"+obj2.username);
        System.out.println("gender:"+obj2.gender);
        System.out.println("emailid:"+obj2.emailid);
        System.out.println("password:"+obj2.password);
        usergroup obj3 = new usergroup();
        obj3.name = "h1";
        obj3.count = 5;
        System.out.println("name:"+obj3.name);
        System.out.println("count:"+obj3.count);


    }
}
