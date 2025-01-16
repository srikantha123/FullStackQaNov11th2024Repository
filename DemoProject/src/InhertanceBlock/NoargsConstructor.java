package InhertanceBlock;
class AA
{
    AA()
    {
        System.out.println("it is AA constructor");
    }
}
class BB extends AA
{
    BB()
    {
        super();
        System.out.println("it is BB constructor");
    }
}
public class NoargsConstructor
{
    public static void main(String[] args)
    {
        BB o=new BB();
    }
}
