package Test;
class one2
{
    {
        System.out.println("first instance block ");
    }
    {
        System.out.println("2nd block");
    }
    {
        System.out.println("3rd block");
    }
    static
    {
        System.out.println("1st static block");
    }
    {
        System.out.println("2ns static block");
    }
}

public class Five {
    public static void main(String[] args) {
        one2 o=new one2();
    }
}
