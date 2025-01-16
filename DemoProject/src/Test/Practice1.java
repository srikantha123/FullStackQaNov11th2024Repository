package Test;
class name
{
    String getname(String name)
    {
        return name;
    }
    int getname(int x,int y,int a,int b)
    {
        int res=((x+y)+(x*y));
        return res;
    }
}

public class Practice1
{
    public static void main(String[] args)
    {
        name o=new name();
        String v1=o.getname("sri");
        System.out.println(v1);
        int v2=o.getname(12,24,20,10);
        System.out.println(v2);
    }
}
