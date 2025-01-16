package ClassPraticeStaticMethod;
class Demo2
{
    static
    {
        System.out.println("it is first static block");
    }
    static
    {
        System.out.println("it is Second static block");
    }
    static
    {
        System.out.println("it is Third static block");
    }

}

public class Rule7 {
    public static void main(String[] args) {
        Demo2 o=new Demo2();
    }
}
