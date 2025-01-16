package AssignmentStrings;

public class Pgm1_ReverseTheGivenString
{
    public static void main(String[] args)
    {
        reverseString();
        reverseString1();
        reverseString3();
        reverseString4();
    }
    private static void reverseString()
    {
        String s="RITHESH";
        String s1=" ";
        System.out.println("The given string is:"+s);
        for(int i=s.length()-1;i>=0;i--)
        {
            s1=s1+s.charAt(i);
        }
        System.out.println("Reverse String is:"+s1);
    }
    private static void reverseString1()
    {
        String s = "KARNATAKA";
        char ch[] = s.toCharArray();
        String res=" ";
        System.out.println("The given String is:"+s);
        for (int i=ch.length-1;i>=0;i--)
        {
            res = res + ch[i];
        }
        System.out.println("The reverse of given string is:" + res);
    }
    private static void reverseString3()
    {
        String s="BANGALORE";
        System.out.println("The given  string is:"+s);
        String s1=s.substring(3,7);
        System.out.println("The substring is:"+s1);
        String res=" ";
        for(int i=s1.length()-1;i>=0;i--)
        {
           res=res+s1.substring(i);
        }
        System.out.println("The reverse String is:"+res);
    }
    private static void reverseString4()
    {
        String s="John";
        String r="";
        char ch;
        System.out.println("The Given String is:"+s);
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            r=ch+r;
        }
        System.out.println("The string after reverse is:"+r);
    }
}
