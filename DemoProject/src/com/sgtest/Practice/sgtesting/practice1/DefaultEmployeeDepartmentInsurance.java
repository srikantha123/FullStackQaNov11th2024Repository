package com.sgtest.Practice.sgtesting.practice1;

class Employee0
{
    String EmpName;
    int age;
    int EmpNumber;
    String EmpJob;
    String EmpLocation;
}
class Department0
{
    int EmpNumber;
    String DeptName;
    int DeptID;
    String Deptlocation;
}
class Insurance0
{
    int EmpNumber;
    String PolicyName;
    int PolicyNumber;
    int PolicyAmount;
}
public class DefaultEmployeeDepartmentInsurance {
    public static void main(String[] args) {
        Employee0 obj1 = new Employee0();
        obj1.EmpName = "Srikantha";
        obj1.age = 25;
        obj1.EmpNumber = 01;
        obj1.EmpJob = "Director";
        obj1.EmpLocation = "Banglore";
        System.out.println("Empname:" + obj1.EmpName);
        System.out.println("Age:" + obj1.age);
        System.out.println("Empnumber:" + obj1.EmpNumber);
        System.out.println("Empjob:" + obj1.EmpJob);
        System.out.println("Emplocation:" + obj1.EmpLocation);
        System.out.println("+++++++++++");
        Department0 obj2 = new Department0();
        obj2.EmpNumber = 01;
        obj2.DeptName = "Administrtion";
        obj2.DeptID = 9891;
        obj2.Deptlocation = "Chennai";
        System.out.println("Empnumber:" + obj2.EmpNumber);
        System.out.println("Deptname:" + obj2.DeptName);
        System.out.println("Deptid:" + obj2.DeptID);
        System.out.println("+++++++++++");
        Insurance0 obj3= new Insurance0();
        obj3.EmpNumber=01;
        obj3.PolicyName="Health Insurance";
        obj3.PolicyNumber=100;
        obj3.PolicyAmount=10501;
        System.out.println("Empnumber:"+obj3.EmpNumber);
        System.out.println("Policyname:"+obj3.PolicyName);
        System.out.println("Policynumber:"+obj3.PolicyNumber);
        System.out.println("PolicyAmount:"+obj3.PolicyAmount);
    }
}
