package PraticeJava;
class Maths
{
    static void Addition(int x,int y)
    {
        System.out.println("Addition:"+(x+y));
    }
    static void Substraction(int x,int y)
    {
        System.out.println("Substraction:"+(x-y));
    }
    static void Division(int x, int y)
    {
        try
        {
            int res = (x / y);
            System.out.println("Division:" +res);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("It is Executes Always......");
        }
    }
    static void muliplication(int x,int y)
    {
        System.out.println("Multiplication:"+(x*y));
    }
}

public class ExceptionP1 {
    public static void main(String[] args) {
        Maths.Addition(10,26);
        Maths.Substraction(24,0);
        Maths.Division(12,0);
        Maths.muliplication(29,10);

    }
}
