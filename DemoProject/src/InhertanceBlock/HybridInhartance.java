package InhertanceBlock;
class Maths9
{
    void Add(int x,int y)
    {
        System.out.println("Addition:"+(x+y));
    }
}
class Maths10 extends Maths9
{
    void sub(int x,int y)
    {
        System.out.println("Substraction:"+(x-y));
    }
}
class Maths11 extends Maths9
{
    void multiplication(int x, int y)
    {
        System.out.println("Multiplaication:"+(x*y));
    }
}
class Maths12 extends Maths11
{
    void Division(int x,int y)
    {
        System.out.println("(Division:"+(x/y));
    }
}
public class HybridInhartance {
    public static void main(String[] args) {
        Maths12 o=new Maths12();
        o.Division(10,2);
        o.multiplication(20,10);
        Maths11 o1=new Maths11();
        o.Add(10,20);
        o.multiplication(10,15);
        Maths10 o2=new Maths10();
        o2.sub(10,5);
        o2.Add(100,150);
    }
}
