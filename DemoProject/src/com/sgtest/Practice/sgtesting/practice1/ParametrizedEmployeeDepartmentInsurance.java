package com.sgtest.Practice.sgtesting.practice1;
class Employee1
{
    String empname;
    int age;
    Employee1(String Empname,int Age)
    {
        empname=Empname;
        age=Age;
        System.out.println("empname:"+empname);
        System.out.println("age:"+age);
    }
}
class Departmenet1
{
    String deptname;
    int empnumber;
    Departmenet1(String Deptname,int Empnumber)
    {
        deptname=Deptname;
        empnumber=Empnumber;
        System.out.println("deptname:"+deptname);
        System.out.println("empnumber:"+empnumber);
    }

}
class Insurance1
{
    String policyname;
    int policynumber;
    Insurance1(String Policyname,int Policynumber)
    {
        policyname=Policyname;
        policynumber=Policynumber;
        System.out.println("policyname:"+policyname);
        System.out.println("policynumber:"+policynumber);
    }
}
public class ParametrizedEmployeeDepartmentInsurance {
    public static void main(String[] args) {
        Employee1 emp=new Employee1("srikantha",26);
        Departmenet1 dept=new Departmenet1("store",002);
        Insurance1 ins=new Insurance1("health",003);
    }
}
