package ExceptioHandlingPratice;
class BasicMaths
{
    static void addition(int x,int y)
    {
        System.out.println("Addition :"+(x+y));
    }
    static void substraction(int x, int y)
    {
        System.out.println("Substraction :"+(x-y));
    }
    static void division(int x, int y)
    {
        try
        {
            int res = (x / y);
            System.out.println("Division   :" + res);
        }
        catch (Exception e)
        {
            //System.out.println(e);
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("This statement Executes Always...");
        }
    }
    static void multiplication(int x, int y)
    {
        System.out.println("Multiplication  :"+(x*y));
    }
    static void evennumber(int x)
    {
        if(x%2==0);
        System.out.println("EvenNumber  :"+x);
    }
    static void oddnumber(int x)
    {
        if(x%2==1);
        System.out.println("Oddnumber  :"+x);
    }
    static  void positivenumber(int x)
    {
        if(x>0);
        System.out.println("Positivenumber  :"+x);
    }
    static void negativenumber(int x)
    {
        if(x<0);
        System.out.println("Negetivenumber  :"+x);
    }
    static void averageValue(int x,int y)
    {
        int avg=(x+y)/2;
        System.out.println("Averagenumber  :"+avg);
    }
    static void squareofnumber(int x) {
        int res = (x * x);
        System.out.println("Squarenumber  :" + res);
    }
}

public class Pratice1
{
    public static void main(String[] args)
    {
        BasicMaths.addition(1,2);
        BasicMaths.substraction(20,15);
        BasicMaths.multiplication(12,4);
        BasicMaths.division(12,0);
        BasicMaths.evennumber(12);
        BasicMaths.averageValue(12,56);
        BasicMaths.negativenumber(-24);
        BasicMaths.squareofnumber(23);
        BasicMaths.positivenumber(23);
    }
}
