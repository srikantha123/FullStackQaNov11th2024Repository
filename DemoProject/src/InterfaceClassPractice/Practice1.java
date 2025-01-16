package InterfaceClassPractice;
interface university
{
    String showcityname="Manglore";
    void showuniversityname(String name);
}
class LVDcollege  implements university
{
    public void showuniversityname(String name)
    {
        System.out.println("UniversityName:"+name);
    }
    public void showcityname()
    {
        System.out.println("cityname:"+showcityname);
    }
    public void displaycourses(String courses[])
    {
         for(int i=0; i<courses.length;i++)
         {
             System.out.println(courses[i]);
         }
    }
}

public class Practice1
{
    public static void main(String[] args)
    {
        LVDcollege o=new LVDcollege();
        o.showuniversityname("Manglore University");
        o.showcityname();
        o.displaycourses(new String[]{"BA","Bsc","Bcom"});
    }
}
