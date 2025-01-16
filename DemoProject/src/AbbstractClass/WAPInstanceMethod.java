package AbbstractClass;
abstract class college5
{
    void Details()
    {
        String name;
        int age;
        String Gender;
        name="srikantha";
        age=25;
        Gender="male";
        System.out.println("PersonDetails:"+name
                + age +Gender);
    }
}
class college6 extends college5
{

}
public class WAPInstanceMethod
{
    public static void main(String[] args)
    {
     college6 o=new college6();
     o.Details();
    }
}
