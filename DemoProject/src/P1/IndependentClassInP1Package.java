package P1;

public class IndependentClassInP1Package
{
    Protection o=new Protection();
    public IndependentClassInP1Package()
    {
        System.out.println("It is IndependentClassInP1Package Class Constructor");
      //  System.out.println("Private_a:"+private_b);
        //System.out.println("Default_b:"+o.default_b);
        System.out.println("Protected_c:"+o.protected_c);
        System.out.println("Public_d:"+o.public_d);
        System.out.println("++++++++++++++++++++++");
    }
}
