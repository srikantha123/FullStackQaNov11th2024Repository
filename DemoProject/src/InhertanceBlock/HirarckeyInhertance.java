package InhertanceBlock;
class Maths6
{
    void add(int x,int y)
    {
        System.out.println("Addition:"+(x+y));
    }
}
class Maths7 extends Maths1
{
    void sub(int x, int y)
    {
        System.out.println("Substraction:"+(x-y));
    }
}
class Maths8 extends Maths1
{
    void Division(int x,int y)
    {
        System.out.println("Division:"+(x/y));
    }
}

public class HirarckeyInhertance {
    public static void main(String[] args) {
        Maths8 o=new Maths8();
        o.Division(30,3);
        o.Addition(20,10);
        Maths7 o1=new Maths7();
        o1.sub(20,10);
        o1.Addition(10,20);
    }
}
