package ClassPraticeStaticMethod;
class Student
{
    static String firstname;
    static int age;

    static
    {
        firstname="Srikantha";
        System.out.println("static in :"+firstname);
        age=23;
        showFirstName();
        showage();
    }
    static void showFirstName()

    {
        System.out.println("Firstname in method:"+firstname);
    }
    static void showage()
    {
        System.out.println("Age second method:"+age);
    }

}
public class Rule4 {
    public static void main(String[] args) {
    Student.age=22;
        System.out.println("Age in main method:"+Student.age);
    }
}
