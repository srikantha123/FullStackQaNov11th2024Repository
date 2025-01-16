package ClassPraticeStaticMethod;
class Overload
{
    void addition(int numbers[])
    {
        int res=0;
        for(int i=0;i<numbers.length;i++)
        {
            res=res+numbers[i];
        }
        System.out.println("Addition:"+res);
    }


}

public class PrcticeMethodOverloading {
    public static void main(String[] args) {
        Overload o=new Overload();
        o.addition(new int[] {20,40,50,60,70,80});
    }
}

