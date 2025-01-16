package InhertanceBlock;
class Maths3
{
    void add(int x,int y)
    {
        System.out.println("Addition:"+(x+y));
    }
}
class Maths4 extends Maths3
{
    void sub(int x,int y)
    {
        System.out.println("substraction:"+(x-y));
    }
}
class Maths5 extends Maths4
{
    void multiplication(int x,int y)
    {
        System.out.println("Multiplication:"+(x*y));
    }
}
public class MultilevelInhertance {
    public static void main(String[] args) {
        Maths5 o=new Maths5();
        o.add(10,15);
        o.sub(50,20);
        o.multiplication(10,5);
    }
}
