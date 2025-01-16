package RandomPractice;
class Student
{

    Student(String StudentName)
    {
        System.out.println("Studentname:"+StudentName);
    }
    Student(int RollNumber,String Subject)
    {
        this("java");
        System.out.println("Rnumber:"+RollNumber  + "subject:"+Subject);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Student o=new Student(21,"Economics");
    }
}
