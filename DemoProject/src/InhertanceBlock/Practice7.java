package InhertanceBlock;
class Designtion
{
    String jobname;
    void show()
    {
        System.out.println("Jobname in superclass:"+jobname);
    }
}
class NewDesignation1 extends Designation
{
    String jobname;
    NewDesignation1(String name)
    {
        super.jobname=name;
    }
    void Display()
    {
        System.out.println("Jobname in subClass:"+jobname);
    }
}

public class Practice7 {
    public static void main(String[] args) {
        NewDesignation1 o=new NewDesignation1("Manger");
        o.jobname="Analyst";
        o.show();
        o.Display();
    }
}
