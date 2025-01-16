package AbbstractClass;
abstract class college3
{
    //int x=30;
    //int y=20;
    static void addition()
    {
        int x=30;
        int y=20;
        int res=(x+y);
        System.out.println("Addition:"+res);
    }
    static void multiplication()
    {
        int a=20;
        int b=5;
        int res=(a*b);
        System.out.println("Multiplication:"+res);
    }
}
class college4 extends college3
{

}
public class WAPTwoStaticMethod
{
    public static void main(String[] args)
    {
        college4 o=new college4();
        o.addition();
        o.multiplication();
        //college3 o1=new college3();
    }
}
