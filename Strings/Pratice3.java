package Strings;

public class Pratice3 {
    public static void main(String[] args)
    {
        lowerCase();
        UpperCase();
        getStrLength();

    }
    private static void lowerCase()
    {
        String s="WELCOME";
        String s1=s.toLowerCase();
        System.out.println("LowerCase:"+s1);
        System.out.println("+++++++++++++++");
    }
    private static void UpperCase()
    {
        String s=new String("Program");
        String s1=s.toUpperCase();
        System.out.println("uppercase:"+s1);
        System.out.println("++++++++++++++++++");
    }
    private static void getStrLength()
    {
        String s="S G Testing";
        int count=s.length();
        System.out.println("Number of char:"+count);
        System.out.println("++++++++++++");
    }
}
