package com.sgtest.Practice.InterfaceAssignments;
interface Student
{
    abstract void StudentName(String name);
}
interface StudentDetails
{
    abstract void StudentRollnumber(int number);
}
interface StudentAcademy
{
    abstract void Passedout(int number);
}
abstract class school
{
    abstract void showSchoolname(String name);
}
class Report extends school implements Student,StudentDetails,StudentAcademy
{
    public void StudentName(String name)
    {
        System.out.println("Sname:"+name);
    }
    public void StudentRollnumber(int number)
    {
        System.out.println("Snumber:"+number);
    }
    public void Passedout(int number)
    {
        System.out.println("SPout:"+number);
    }
    public void showSchoolname(String name)
    {
        System.out.println("SSName:"+name);
    }
}
public class WAPAbstactClassMultipleInheritance {
    public static void main(String[] args) {
        Report o=new Report();
        o.Passedout(2002);
        o.showSchoolname("WTSchool");
        o.StudentName("Srikantha");
        o.StudentRollnumber(19);
    }
}
