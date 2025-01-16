package ClassPraticeStaticMethod;
class person {
    String FullName;
    int age;
}

public class PracticeStaticMethodRule1 {
    public static void main(String[] args) {
        person o=new person();
        o.FullName="Srikantha";
        o.age=25;
        System.out.println("fullname"+o.FullName);
        System.out.println("Age:"+o.age);
    }
}
