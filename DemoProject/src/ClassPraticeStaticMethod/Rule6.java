package ClassPraticeStaticMethod;
class Demo1
{
    void Demo()
    {
       System.out.println("it is a constructor");
    }
    static
    {
        System.out.println("it is a static block");
    }
}

public class Rule6 {
    public static void main(String[] args)
     {
        Demo1 o=new Demo1();
        o.Demo();

    }
}
