package P2;
import P1.Protection;

public class SubClassInP2Package extends Protection
{
    public SubClassInP2Package()
    {
        System.out.println("It is SubClassInP2Package Constructor");
       // System.out.println("Private_a:"+private_b);
       // System.out.println("Default_b:"+default_b);
        System.out.println("Protected_c:"+protected_c);
        System.out.println("Public_d:"+public_d);
        System.out.println("++++++++++++++++++++++");
    }

}
