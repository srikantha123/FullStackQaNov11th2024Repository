package InterfaceClassPractice;
interface Department
{
    abstract void DepartmentName(String name);
}
interface Departmentpost
{
    String name="srikantha";
    //abstract void Departmentgrade(name);
}
class store implements Department
{
    public void DepartmentName(String name)
    {
        System.out.println("Deptname:"+name);
    }
    public void Departmentgrade()
    {
        System.out.println("DeptGrade:"+Departmentpost.name);
    }
}
public class Practice4
{
    public static void main(String[] args)
    {
        store o=new store();
        o.DepartmentName("Sales");
        o.Departmentgrade();
    }
}
