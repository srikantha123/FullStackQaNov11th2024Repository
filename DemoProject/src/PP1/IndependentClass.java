package PP1;

public class IndependentClass
{
    Protection o=new Protection();
    public IndependentClass()
    {
        System.out.println("Default:"+o.default_d);
       // System.out.println("Private:"+o.private_d);
        System.out.println("Protected:"+o.protected_p);
        System.out.println("public:"+o.public_p);
    }

}
