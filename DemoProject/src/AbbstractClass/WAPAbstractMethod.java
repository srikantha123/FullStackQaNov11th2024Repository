package AbbstractClass;
abstract class college7
{
    abstract void showCollegename(String name);
    //abstract String showCityname(String name);
    void Display()
    {
        System.out.println("Srikantha");
    }
}
class college8 extends college7
{
    void showCollegename(String name)
    {
        System.out.println("Collegename:  "+name);
    }
}

public class WAPAbstractMethod
{
    public static void main(String[] args)
    {
        college8 o = new college8();
        o.showCollegename("University of Raichur");
    }
}
