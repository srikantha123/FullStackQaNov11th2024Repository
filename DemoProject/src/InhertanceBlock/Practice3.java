package InhertanceBlock;
class  Employee1
{
    Employee1(String ename,String jobname)
    {
        System.out.println("Employee Name:"+ename);
        System.out.println("job name:"+jobname);
    }
}
class EmployeeDetails1 extends Employee1
{
    int salary;
    String deptname;
    EmployeeDetails1(String name,String job,int salary,String deptname)
    {
        super(name,job);
        this.salary=salary;
        this.deptname=deptname;
        System.out.println("Salary:"+this.salary);
        System.out.println("depatment name:"+this.deptname);

    }
}
public class Practice3
{
    public static void main(String[] args)
    {
        EmployeeDetails1 o1=new EmployeeDetails1("sri","Research",1200,"central");
    }
}
