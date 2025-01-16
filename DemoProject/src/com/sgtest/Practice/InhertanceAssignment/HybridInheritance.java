package com.sgtest.Practice.InhertanceAssignment;
class Employe1
{
    Employe1(String Empname)
    {
        System.out.println("Employeename:"+Empname);
    }
//    Employe1(int Number)
//    {
//        System.out.println("Empnumber:"+Number);
//    }
}
class EmployeDetail extends Employe1
{
    int salary;
    String Batchname;
    EmployeDetail(int Salary,String batchname,String ename)
    {
        super(ename);
        this.Batchname=batchname;
        this.salary=Salary;
        System.out.println("Salary:"+salary +  "Batchname:"+Batchname);
    }
}
class EmployeAddress extends Employe1
{
    int Addnumber;
    String Address;
    EmployeAddress(int addnumber,String address,String ename)//,//String Batchname)
    {
        super(ename);
        this.Addnumber=addnumber;
        this.Address=address;
        System.out.println("Adrres:"+Addnumber + "Add:"+Address);
    }
}
class EmployeeBatch extends EmployeAddress
{
    int Batchnumber;
    String Storename;
    EmployeeBatch(int batchnumber,String storename,int addNumber,String address,String ename)
    {
        super(addNumber,address,ename);
        this.Storename=storename;
        this.Batchnumber=batchnumber;
        System.out.println("Batchnumber"+Batchnumber + "storename:"+Storename);
        
                
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        EmployeeBatch o=new EmployeeBatch(12,"sri",112,"hi","Srikantha");
        EmployeDetail o1=new EmployeDetail(1200,"H1","Suresh");
    }
}
