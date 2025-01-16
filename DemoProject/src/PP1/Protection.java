package PP1;

public class Protection
{
    int default_d=100;
    private int private_d=200;
    protected int protected_p=300;
    public int public_p=400;

    public Protection()
    {
        System.out.println("Default:"+default_d);
        System.out.println("Private:"+private_d);
        System.out.println("Protected:"+protected_p);
        System.out.println("public:"+public_p);
        System.out.println("++++++++++++++++++");
    }
}
