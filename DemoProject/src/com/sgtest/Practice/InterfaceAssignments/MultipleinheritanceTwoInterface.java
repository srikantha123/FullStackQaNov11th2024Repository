package com.sgtest.Practice.InterfaceAssignments;
interface Employee
{
    abstract void EmployeeDetails(String name,int number);
}
interface Employeefunctions
{
    abstract void EmployeeIndetails(String Dresscode,int Empnumber);
}
interface Company
{
    abstract void CompanyDetails(String Companyname,int Companynumber);
}
class Emp implements Employee,Employeefunctions,Company
{
    public void EmployeeDetails(String name,int number)
    {
        System.out.println("Ename:"+name + "Enumber:"+number);
    }
    public void EmployeeIndetails(String Dresscode,int Empnumber)
    {
        System.out.println("Dcode:"+Dresscode +  "empnumber:"+Empnumber);
    }
    public void CompanyDetails(String Companyname,int Companynumber)
    {
        System.out.println("comnumber:"+Companyname + "Cnumber:"+ Companynumber);
    }
}

public class MultipleinheritanceTwoInterface
{
    public static void main(String[] args)
    {
        Emp o=new Emp();
        o.CompanyDetails("Sri",1100);
        o.EmployeeDetails("pujar",011);
        o.EmployeeIndetails("White",112);

    }

}
