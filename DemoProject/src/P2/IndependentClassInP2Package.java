package P2;
import P1.Protection;
public class IndependentClassInP2Package
{
    Protection o1=new Protection();
    public IndependentClassInP2Package()
    {
        System.out.println("It is IndependentClassInP2Package Constructor");
       // System.out.println("Private_a:"+o1.private_b);
       // System.out.println("Default_b:"+o1.default_b);
      //  System.out.println("Protected_c:"+o1.protected_c);
        System.out.println("Public_d:"+o1.public_d);
        System.out.println("++++++++++++++++++++++");
    }
}
