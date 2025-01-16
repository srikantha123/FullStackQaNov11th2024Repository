package ClassPraticeStaticMethod;
class OuterClass
{
    String Fullname;
    InnerClass inner =new InnerClass();
    void showAge()
    {
        inner.age = 22;
        System.out.println("Age of Siri:"+ inner.age);
    }
    class InnerClass
    {
        int age;
        void ShowName()
        {
            Fullname = "Srikantha";
            System.out.println("Sweetname:"+ Fullname);
        }
    }
}
public class OuterAndInnerClass
{
    public static void main(String[] args)
    {
        OuterClass outer=new OuterClass();
        outer.showAge();
        //OuterClass.InnerClass inner = outer.new InnerClass();
        outer.inner.ShowName();

    }
}
