package com.sgtest.Practice.InhertanceAssignment;
class Employee10
{
    Employee10(String Empname)
    {
        System.out.println("Employee Name:"+Empname);
    }
}
class EmployeeDetails extends Employee10
{
    EmployeeDetails(String Ename,int salary)
    {
        super(Ename);
        //int salary;
        System.out.println(salary);
    }
}
public class WAPMultilevelInhertance {
    public static void main(String[] args) {
        EmployeeDetails o=new EmployeeDetails("Srikantha",12);
    }
}
