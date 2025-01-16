package Test;
class one3
{
    {
        System.out.println("1st instance block");
    }

}
class one4
{
    {
        System.out.println("2nd class instance block");
    }
}
class one5
{
    {
        one3 o=new one3();
        one4 s=new one4();
        System.out.println("3rd class instance block");
    }
}

public class sixt {
    public static void main(String[] args) {
        one5 o=new one5();
    }
}
