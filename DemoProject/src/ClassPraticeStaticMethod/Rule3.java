package ClassPraticeStaticMethod;
class Maths1
{
    static String mathstype;
    static void addition(int x,int y)
    {
        int res=(x+y);
        System.out.println("Addition:"+res);
    }
}

public class Rule3 {
    public static void main(String[] args) {
        Maths1.mathstype="Trigonometry";
        System.out.println(Maths1.mathstype);
        Maths1.addition(25,30);
    }
}
