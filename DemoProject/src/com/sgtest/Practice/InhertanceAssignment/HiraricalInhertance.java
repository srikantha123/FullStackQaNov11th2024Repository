package com.sgtest.Practice.InhertanceAssignment;
class Student
{
    void Student(String name,int Rollnumber)
    {
        System.out.println("Studentname"+name  +   "Class Rollumber:"+Rollnumber);
    }
}
class StudentDetails extends Student
{
    StudentDetails(String Sname, int rnumber)
    {
        super.Student(Sname,rnumber);
    }
}
class StudentContact extends Student
{
    void StudentContact(String enickname,int Marks)
    {
        System.out.println("sarname:"+enickname   + "marks:"+Marks);
    }
}

public class HiraricalInhertance {
    public static void main(String[] args) {

        StudentDetails o=new StudentDetails("Srikantha",21);
        StudentContact o1=new StudentContact();
        o1.StudentContact("Siri",22);
    }
}
