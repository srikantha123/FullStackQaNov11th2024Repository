package AbbstractClass;
abstract class MultiLevel
{
    void addition(int x,int y)
    {
        System.out.println("Addition:"+(x+y));
    }
}
class MultiLevel1 extends MultiLevel
{
    void Multiplication(int a,int b)
    {
        System.out.println("Multiplication:"+(a*b));
    }
}
class MultiLevel2 extends MultiLevel1
{
    void Substraction(int c,int d)
    {
        System.out.println("Substraction:"+(c-d));
    }

}
class mm extends MultiLevel2
{
   // public mm(int x,int y)
        //super(MultiLevel2);

}
public class WAPMultiLevelHInhertence
{
    public static void main(String[] args)
    {
        mm s=new mm();
        s.addition(12,23);
        mm n=new mm();
        n.Substraction(20,10);
        mm e=new mm();
        e.Multiplication(4,2);
    }
}
