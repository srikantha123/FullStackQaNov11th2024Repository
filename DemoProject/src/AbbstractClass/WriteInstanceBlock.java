package AbbstractClass;
abstract class college1
{
    {
        System.out.println("Yes it is Instance Block");
    }
}
class college2 extends college1
{

}

public class WriteInstanceBlock {
    public static void main(String[] args)
    {
        college2 o=new college2();
    }
}
