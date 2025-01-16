package com.sgtest.Practice.InhertanceAssignment;
class Employee
{

    Employee(String name)
    {
       // name = "srikantha";
        System.out.println("Employeename:" + name);
    }
    Employee(int Empnmber)
    {
        System.out.println("Empnumber:"+Empnmber);
    }
}
class Employee1 extends Employee
{
    Employee1(int rollnumber,String name)
    {
        super(name);
        System.out.println("rNumber" + rollnumber);
    }
    Employee1(int empnumber,int pairs)
    {
        super(empnumber);
        System.out.println("subjectname:" + pairs);
    }
}
class Employee2 extends Employee1
{
    Employee2 (int rollnumber,String name,String Storename)
    {
        super(rollnumber,name);
        System.out.println("Marks:"+Storename );
    }
    Employee2(int empnumber,int Points,int pairs)
    {
        super(empnumber,pairs);
        System.out.println("Subject points:"+Points);
    }
}
//class EmpDetails extends Employee
//{
//    EmpDetails(String name, int rollnumber,int marks,String grade,int points)
//    {
//        super(name,marks,rollnumber,points, grade);
//    }
//}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Employee2 o=new Employee2(12,"sri","HI");
        Employee2 o1=new Employee2(13,10,2);

    }
}
