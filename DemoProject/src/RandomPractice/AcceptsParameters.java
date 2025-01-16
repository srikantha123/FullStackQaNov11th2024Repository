package RandomPractice;
class Calculations
{
    void addition(int x,int y)
    {
        int res=(x+y);
        System.out.println("Result:"+(res));
    }
    void Multiplication(int a,int b)
    {
        int res=(a*b);
        System.out.println("Multiplication:"+res);
    }
}

public class AcceptsParameters
{
    public static void main(String[] args)
    {
     Calculations o=new Calculations();
     o.addition(100,300);
     o.Multiplication(200,2);
    }
}
