package InhertanceBlock;
class AAA
{
    AAA()
    {
        System.out.println("it is AA constructor");
    }
}
class BBB extends AAA
{
    BBB()
    {
        super();
        System.out.println("it is BB constructor");
    }
}
class CCC extends BBB
{
    CCC()
    {
        System.out.println("it is CCC Constructor");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        CCC o=new CCC();
    }
}
