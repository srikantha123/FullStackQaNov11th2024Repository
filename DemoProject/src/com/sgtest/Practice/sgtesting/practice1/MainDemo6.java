package com.sgtest.Practice.sgtesting.practice1;
class University
{
    University(String name)
    {
        System.out.println("Name:"+name);
    }
    University(int code)
    {
        System.out.println("Universitycode:"+code);
    }
    University(String chancellername,int code)
    {
        System.out.println("Chancellername:"+chancellername+"code:"+code);
    }
    University(int contactnumber, String subject, int subjectcode )
    {
        System.out.println("contactnumber:"+contactnumber+"subject:"+subject+"subjectcode:"+subjectcode);
    }
    University(String specialquality,int rating,String finalcomment)
    {
        System.out.println("specialquality:"+specialquality+"rating:"+rating+"finalcomment"+finalcomment);
    }
}

public class MainDemo6
{
    public static void main(String[] args)
    {University o1=new University("vtu");
     University o2=new University(9891);
     University o3=new University("srikantha",001);
     University o4=new University(9964,"English",002);
     University o5=new University("motivator",8,"Good");
    }
}
