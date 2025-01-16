package InterfaceClassPractice;
interface university1
{
    void showuniversityname(String names);
}
interface college1
{
    abstract void displaycollegename(String names);
}
class Dcollege implements university1,college1
{
    public void showuniversityname(String names)
    {
        System.out.println("Universityname:"+ names);
    }
    public void displaycollegename(String names)
    {
        System.out.println("collegeName:"+names);
    }
    public void displaycourses(String courses[])
    {
        for(int i=0;i<courses.length;i++)
        {
            System.out.println(courses[i]);
        }
    }
}
public class Practice2 {
    public static void main(String[] args)
    {
        Dcollege o=new Dcollege();
        o.showuniversityname("Raichur university");
        o.displaycollegename("Tagore college");
        o.displaycourses(new String[]{"BA","Mcom","BE"});
    }
}
