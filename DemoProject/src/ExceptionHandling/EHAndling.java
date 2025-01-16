package ExceptionHandling;
class BasicMaths
{
    static void addition(int x ,int y)
    {
        System.out.println("addition:"+(x+y));
    }
    static void substraction(int x,int y)
    {
        System.out.println("Substraction:"+(x-y));
    }
    static void division(int x,int y)
    {
        int res=x/y;
        System.out.println("Division:"+res);
    }
    static void Multiplication(int x,int y)
    {
        System.out.println("Multipliction:"+(x*y));
    }
    static void EvenNumber(int number)
    {
        if(number%2==0)
        {
            System.out.println("Even number:"+number);
        }
    }
    static void Oddnumber(int number)
    {
        if(number%2==1)
        {
            System.out.println("Odd number:"+number);
        }
    }
    static void POSITIVENumber(int number)
    {
        if(number>0)
        {
            System.out.println("Positive number:"+number);
        }
    }
    static void negetivenumber(int number)
    {
        if(number<0)
        {
            System.out.println("Negetive number:"+number);
        }
    }
    static void averagevalue(int x,int y)
    {
        int average=(x+y)/2;
        System.out.println("Average value:"+average);
    }
    static void squareofnumber(int number)
    {
        int res=(number*number);
        System.out.println("sauqrenumber:"+res);
    }
}

public class EHAndling {
    public static void main(String[] args) {
        BasicMaths.addition(12,34);
        BasicMaths.averagevalue(34,56);
        BasicMaths.division(100,0);
        BasicMaths.EvenNumber(22);
        BasicMaths.negetivenumber(-55);
        BasicMaths.Multiplication(23,24);
        BasicMaths.Oddnumber(55);
        BasicMaths.squareofnumber(45);
        BasicMaths.substraction(34,5);
        BasicMaths.POSITIVENumber(67);
    }
}
