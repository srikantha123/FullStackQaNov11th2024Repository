package InhertanceBlock;
class Employee
{
    Employee(String ename,String jobname)
    {
        System.out.println("Employee name:"+ ename);
        System.out.println("Jobname :"+ jobname);
    }
}
class EmployeeDetails extends Employee
{
    EmployeeDetails(String name,String job)
    {
        super(name,job);
    }
}

public class Practice2 {
    public static void main(String[] args)
    {
        EmployeeDetails o=new EmployeeDetails("srikantha","Sales");
        EmployeeDetails o2=new EmployeeDetails("sri","manger");
    }
}
