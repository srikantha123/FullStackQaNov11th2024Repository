package PraticeJava;
class Employee1
{
    String myname(String name,int number)
    {
        return name+ number;

    }
}


public class ReturnTypeMultiple {
    public static void main(String[] args) {
        Employee1 o=new Employee1();
        System.out.println(o.myname("Srikantha",20));


    }
}
