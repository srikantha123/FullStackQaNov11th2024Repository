package RandomPractice;
class Maths
{
    Maths(int num)
    {
        int fact=1;
        for(int i=num;i>=1;i--)
        {
            fact=fact*i;

        }
        System.out.println("Factorial of : "+ fact);
    }
}

public class FactorialNumber {
    public static void main(String[] args) {
        Maths o=new Maths(5);
    }
}
