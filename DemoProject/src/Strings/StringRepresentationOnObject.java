package Strings;
class Employee
{
    String Name;
    String EmployeeName;
    Employee(String Ename,String employeeName)
    {
        this.Name=Ename;
        this.EmployeeName=employeeName;
    }
    public String toString()
    {
        return Name + EmployeeName;
    }
}

public class StringRepresentationOnObject
{
    public static void main(String[] args)
    {
        Employee o=new Employee("Srikantha","Siri");
        System.out.println(o);

    }
}
