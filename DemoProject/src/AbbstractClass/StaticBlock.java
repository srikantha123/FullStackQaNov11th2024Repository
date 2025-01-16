package AbbstractClass;
abstract class college
{
    //abstract void showCollegename(String name);

        static
        {
            System.out.println("It is static block");
        }
}
class Workshop extends college
{

}
public class StaticBlock
{
    public static void main(String[] args)
    {
        Workshop o=new Workshop();
    }
}
