package ClassPraticeStaticMethod;
class Demo3 {
    void addition(int x, int y)
    {
        System.out.println("Addition Result:" + (x + y));
    }
}
class Demo4 {
    static void Multiplication(int x, int y)
    {
        Demo3 o = new Demo3();
        o.addition(20, 10);
        System.out.println("Multiplication:" + (x * y));
    }
}
public class Rule8 {
    public static void main(String[] args)
    {
        Demo4.Multiplication(20,30);
    }
}
