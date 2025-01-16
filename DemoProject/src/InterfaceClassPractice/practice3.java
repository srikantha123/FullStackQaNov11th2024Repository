package InterfaceClassPractice;
interface university2
{
    void showuniversity(String name);
}
interface college3 extends university2
{
    abstract void displaycollegename(String name);
}
class Lvdcollege implements college3
{
    public void showuniversity(String name)
    {
        System.out.println("universityname:"+name);
    }
    public void displaycollegename(String name)
    {
        System.out.println("displaycollegename:"+name);
    }
    public void displaycourses(String courses[])
    {
        for(int i=0;i<courses.length;i++)
        {
            System.out.println("Displaycourses"+courses[i]);
        }
    }
}
public class practice3 {
    public static void main(String[] args) {
        Lvdcollege o=new Lvdcollege();
        o.displaycollegename("HHMD college");
        o.showuniversity("Viswararyya university");
        o.displaycourses(new String[]{"Python","JAva","C++","Dango"});
    }


}
