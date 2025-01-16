package RandomPractice;
class Name
{
    void showname(String name)
    {
        System.out.println("Name is :"+name);
    }
     String getname(String name)
    {
        return name;
    }
}

public class Value1
{
    public static void main(String[] args)
    {
        Name o=new Name();
        o.showname("Adams");
        String v1=o.getname("Srikantha");
        System.out.println(v1);
    }
}
