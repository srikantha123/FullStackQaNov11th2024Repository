package AssignmentStrings;

public class Pgm4_Pattern
{
    public static void main(String[] args)
    {
        pattern1();
        pattern12();
    }
    private static void pattern1()
    {
        String s="PROGRAM";
        char ch[]=s.toCharArray();
        System.out.println("The First Pattern is");
        for(int i=ch.length-1;i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch[j]+" ");
                ch[i]=ch[i]++;
            }
            System.out.println();
        }
    }
    private static void pattern12()
    {
        System.out.println("The Second pattern is:");
        String s="PROGRAM";
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch[j]+" ");
                //ch[i]=ch[i]++;
            }
            System.out.println();
        }
    }
}
