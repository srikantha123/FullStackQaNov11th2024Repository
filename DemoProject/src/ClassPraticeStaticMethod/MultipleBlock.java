package ClassPraticeStaticMethod;
class Dem05
{
    {
        System.out.println("it is instance Block");
    }
    void Test()
    {
        System.out.println("it is a constructor:");
    }
    static
    {
        System.out.println("it is static block");
    }
}

public class MultipleBlock {
    public static void main(String[] args) {
        Demo5 o=new Demo5();
    }
}
