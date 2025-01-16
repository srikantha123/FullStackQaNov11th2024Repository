package InhertanceBlock;
class Maths1
{
    void Addition(int x, int y)
    {
        System.out.println("Addition:"+ (x+y));
    }
}
class Maths2 extends Maths1
{
    void Substraction(int a,int b)
    {
        System.out.println("Substraction:"+(a-b));
    }
}
public class SimpleInhertance {
    public static void main(String[] args)
    {
        Maths2 o=new Maths2();
        o.Addition(100,150);
        o.Substraction(200,150);

    }
}