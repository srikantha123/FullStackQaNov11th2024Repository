package InhertanceBlock;
class Country
{
    void showCaptialCity(String name)
    {
        System.out.println("Capital city:"+name);
    }
}
class state extends Country
{
    state (String capital)
    {
        super.showCaptialCity(capital);
    }
    void showCapitalCity(String name)
    {
        System.out.println("Capital cityof sate:"+name);
    }
}
public class Practice4 {
    public static void main(String[] args) {
        state o=new state("delhi");
        o.showCapitalCity("banglore");
    }
}
