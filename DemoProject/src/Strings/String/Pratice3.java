package Strings.String;

public class Pratice3
{
    public static void main(String[] args)
    {
        substring();
        lower();
        upper();
        length();
        Existanceofstring();
        verifyempty();
        charindex();
        replace();
        compare();
        compare1();
        showposition();
        showposition2();
        converttoChararray();
        splitstring();
        convertTostring();



    }
    private static void lower()
    {
        String s="Welcome";
        String s1=s.toLowerCase();
        System.out.println(s1);
    }
    private static void upper()
    {
        String s="welcome";
        String s1=s.toUpperCase();
        System.out.println(s1);
    }
    private static void length()
    {
        String s="welcome";
        int s1=s.length();
        System.out.println(s1);
    }
    private static void Existanceofstring()
    {
        String s="It is a Banglore, it is";
        boolean s1=s.startsWith("It");
        System.out.println(s1);
        boolean s2=s.endsWith("is");
        System.out.println(s2);
        boolean s3=s.contains("Banglore");
    }
    private static void verifyempty() {
        String s = new String();
        boolean s1 = s.isEmpty();
        System.out.println(s1);
    }
    private static void charindex()
    {
        String s="srikantha";
        int s1=s.charAt(0);
        System.out.println(s1);
    }
    private static void replace()
    {
        String s="Srikantha";
        String s1=s.replace("i","hree");
        System.out.println(s1);
    }
    private static void compare()
    {
        String s="JavaScript";
        String s1="JAVASCRIPT";
        boolean s2=s.equals(s1);
        System.out.println(s2);
        boolean s3=s.equalsIgnoreCase(s1);
        System.out.println(s3);
    }
    private static void compare1()
    {
        String s="javaScript";
        String s1="JAVASCRIPT";
        int a=s.compareTo(s1);
        System.out.println(a);
        int b=s.compareToIgnoreCase(s1);
        System.out.println(b);
    }
    private static void showposition()
    {
        String s="it is a new college,it is";
        int a=s.indexOf("is");
        System.out.println(a);
        int b=s.indexOf("is",5);
        System.out.println(b);
    }
    private static void  showposition2()
    {
        String s="it is a new college,it is";
        int a=s.indexOf("is");
        System.out.println(a);
        int b=s.lastIndexOf("is");
        System.out.println(b);
    }
    private static void converttoChararray()
    {
        String s="SRIKANTHA";
        char ch[]=s.toCharArray();
        for(char ch1:ch)
        {
            System.out.println(ch1);
        }

    }
    private static void splitstring()
    {
        String s="mango banana Apple orange";
        String str[]=s.split("");
        for(String kk:str)
        {
            System.out.println(kk);
        }
    }
    private static void convertTostring()
    {
        int a=35;
        String s=String.valueOf(a);
        System.out.println(s);
        double d=24.55;
        System.out.println(d);
    }
    private static void substring()
    {
        String s="Programming";
        String s1=s.substring(3);
        System.out.println(s1);
        String s2=s.substring(3,7);
        System.out.println(s2);
    }
}
