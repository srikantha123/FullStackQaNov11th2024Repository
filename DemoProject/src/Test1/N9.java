package Test1;
interface Employeename
{
    abstract void schoolname(String name);
    abstract void departname(String name);
}
interface Emploeedept
{
    abstract void classname(String name);
}
class c implements Employeename,Emploeedept
{
    public void schoolname(String name)
    {
        System.out.println("name:"+name);
    }
    public void departname(String name)
    {
        System.out.println("Dname:"+name);
    }
    public void classname(String name)
    {
        System.out.println("Name:"+name);
    }
}


public class N9 {
    public static void main(String[] args) {
        c o=new c();
        o.classname("10thclass");
    }
}
