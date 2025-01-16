package AbbstractClass;
abstract class Calculation
{
    void addition(int a,int b)
    {
        System.out.println("Additon:"+(a+b));
    }
}
class Calculation1 extends Calculation
{
    void substration(int x,int y)
    {
        System.out.println("Substration:"+(x-y));
    }
}
class Calculation2 extends Calculation
{
    void multiplication(int c,int d)
    {
        System.out.println("Multiplication:"+(c*d));
    }
}
class Calculation3 extends Calculation2
{
    void Division(int e,int f)
    {
        System.out.println("Division:"+(e/f));
    }
}
class energy extends Calculation1
{

}
class extra extends Calculation3
{

}
public class HybridInheritance
{
    public static void main(String[] args)
    {
        energy o=new energy();
        o.addition(10,20);
        o.substration(20,10);
        extra s=new extra();
        s.addition(12,2);
        s.Division(20,5);
        s.multiplication(4,3);

    }
}
