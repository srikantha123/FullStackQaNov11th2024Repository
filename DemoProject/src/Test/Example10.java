package Test;
class one
{
    String name;
    int age;
    void showname()
    {
        name="Srikantha";
        System.out.println("Name:"+name);
    }
    static void age()
    {
        int age=20;
        System.out.println("Age:"+age);
    }
    one()
    {   one o=new one();
        o.showname();
        o.age();
        System.out.println("Yes it is consyructor");
    }
}

public class Example10 {
    public static void main(String[] args)
    {
        one o=new one();
    }
}
