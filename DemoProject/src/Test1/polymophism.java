package Test1;
abstract class google
{
    abstract void navigateUrl();
}
class chrome extends google
{
    void navigateUrl()
    {
        System.out.println("it is chrome");
    }
}
class firefox extends google
{
    void navigateUrl()
    {
        System.out.println("it is firefox");
    }
}
class edge extends google
{
    void navigateUrl()
    {
        System.out.println("it is edge");
    }
}
public class polymophism {
    public static void main(String[] args) {
        google google=null;
        chrome o=new chrome();
        firefox o1=new firefox();
        edge o2=new edge();

        google=o;
        google.navigateUrl();

        google=o1;
        google.navigateUrl();

        google=o2;
        google.navigateUrl();



    }
}
