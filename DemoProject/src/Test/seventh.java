package Test;
class block1
{
    {
        System.out.println("instance block");
    }
    static
    {
        System.out.println("Static method");
    }
}
class Student1
{
    String name;
    int age;
    Student1(String Name,int Age){
        block1 s=new block1();
        name=Name;
        age=Age;
        System.out.println(name);
        System.out.println(Age);
    }

}

public class seventh {
    public static void main(String[] args) {
        Student1 o=new Student1("srikantha",22);
    }
}
