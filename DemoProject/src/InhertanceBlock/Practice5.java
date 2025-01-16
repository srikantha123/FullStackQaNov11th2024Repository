package InhertanceBlock;
class Designation
{
    String jobname;
    void show()
    {
        System.out.println("jobname in superclass " +jobname);
    }
}
class NewDesignation extends Designation
{
    String jobname;
    NewDesignation(String name)
    {
        super.jobname=name;
    }
    void display()
    {
        System.out.println("job name in sub class :"+ jobname);
    }
}

public class Practice5 {
    public static void main(String[] args) {
        NewDesignation o=new NewDesignation("sales manger");
        o.jobname="Analyst";
        o.show();
        o.display();
    }
}
