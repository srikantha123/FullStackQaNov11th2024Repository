package ClassPraticeStaticMethod;
class Recurrsion
{
    int num=0;
    void Recurr()
    {
        if(num<=20)
        {
            System.out.println(num);
            num=num+1;
            Recurr();
        }
    }
}

public class PracticeRecurrsionMethod {
    public static void main(String[] args) {
        Recurrsion o=new Recurrsion();
        o.Recurr();

    }
}
