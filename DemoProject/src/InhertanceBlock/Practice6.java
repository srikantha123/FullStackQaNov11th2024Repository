package InhertanceBlock;
class Country1
{
    void showCapitalCity(String name)
    {
        System.out.println("Capital City:"+name);
    }
}
class state1 extends Country1
{
    state1 (String capital)
    {
        super.showCapitalCity(capital);
    }
    void showCapitalCity(String name)
    {
        System.out.println("Capital city of state:"+name);
    }
}

public class Practice6 {
    public static void main(String[] args) {
        state o=new state("delhi");
        o.showCapitalCity("Banglore");
    }
}
