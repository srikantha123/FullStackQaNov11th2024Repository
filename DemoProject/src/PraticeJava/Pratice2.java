package PraticeJava;
class Employee
{
    String fname;
    String jobname;
    Employee(String fname,String jobname)
    {
        this.fname = fname;
        this.jobname = jobname;
    }
    public String toString()
    {
        return ("Employee name:+ "+fname +"and job of Employee is "+jobname);
    }
}
public class Pratice2 {
    public static void main(String[] args) {
        Employee obj=new Employee("srikantha","Salesmanager");
        System.out.println(obj);
        Employee obj1=new Employee("sri","Admin");
        System.out.println(obj1);
    }
}
