package ClassPraticeStaticMethod;
class Demo
{
    static
    {
        System.out.println("It is a static block");
    }
}

public class Rule5 {
    public static void main(String[] args) {
        Demo o=new Demo();
    }
}
