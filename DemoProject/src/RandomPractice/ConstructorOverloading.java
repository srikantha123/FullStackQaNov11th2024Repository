package RandomPractice;
class Employee
{
    Employee(String Name)
    {
        System.out.println("EmployeeName:"+Name);
    }
    Employee(String Departementname,int DeptNumber)
    {
        System.out.println("deptname:"+Departementname  +    "deptnnumber:"  +DeptNumber);
    }
    Employee(int Salary,String Grade,int NumberofEmployees)
    {
        System.out.println("salary:"+Salary  +"grade:"+Grade  +"noEmplyee:"+NumberofEmployees);
    }
}

public class ConstructorOverloading
{
    public static void main(String[] args)
    {
        Employee o=new Employee("Srikantha");
        Employee o2=new Employee("Administarion",12);
        Employee o3=new Employee(1200,"Apluse",5000);
    }
}
