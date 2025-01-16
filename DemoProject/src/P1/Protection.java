package P1;

public class Protection
{
    int default_a=100;
    private int private_b=200;
    int default_b=200;
    protected int protected_c=300;
    public int public_d=400;

    public Protection()
    {
        System.out.println("It is Protection Class Constructor");
        System.out.println("Default_a:"+default_a);
        System.out.println("Private_b:"+private_b);
        System.out.println("Protected_c:"+protected_c);
        System.out.println("Public_d:"+public_d);
        System.out.println("++++++++++++++++++++++");
    }
}
