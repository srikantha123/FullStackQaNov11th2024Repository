package com.sgtest.Practice.sgtesting.practice1;

class Employee
{
    String EmpName;
    int age;
    int EmpNumber;
    String EmpJob;
    String EmpLocation;
    Employee()
    {
        EmpName = "srikantha";
        age = 25;
        System.out.println("fullname:" + EmpName);
        System.out.println("age:"+ age);
        System.out.println("EMPJob:"+EmpJob);
        System.out.println("Emplocation:"+EmpLocation);
    }
}
class Department
{
    int EmpNumber;
    String DeptName;
    int DeptID;
    String Deptlocation;
    Department()
    {
        EmpNumber = 01;
        DeptName = "Administrtion";
        DeptID = 9891;
        Deptlocation = "Chennai";
        System.out.println("Empnumber:" +EmpNumber);
        System.out.println("Deptname:" + DeptName);
        System.out.println("Deptid:" + DeptID);
        System.out.println("+++++++++++");
    }
}
class Insurance
{
    int EmpNumber;
    String PolicyName;
    int PolicyNumber;
    int PolicyAmount;
    Insurance()
    {
        EmpNumber=01;
        PolicyName="Health Insurance";
        PolicyNumber=100;
        PolicyAmount=10501;
        System.out.println("Empnumber:"+EmpNumber);
        System.out.println("Policyname:"+PolicyName);
        System.out.println("Policynumber:"+PolicyNumber);
        System.out.println("PolicyAmount:"+PolicyAmount);
    }
}

public class NoargsEmployeeDepartmentInsurance {
    public static void main(String[] args) {
        Employee emp=new Employee();
        Department dept=new Department();
        Insurance ins=new Insurance();
    }
}
