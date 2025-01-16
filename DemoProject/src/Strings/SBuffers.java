package Strings;

public class SBuffers
{
    public static void main(String[] args)
    {
        appendstring();
        insertString();
        deleteString();
        reverseString();
    }
    public static void appendstring()
    {
        StringBuffer s=new StringBuffer("Java");
        s.append("Programming");
        System.out.println(s);
        System.out.println("++++++++++++++++++");
    }
    private static void insertString()
    {
        StringBuffer s=new StringBuffer("It is a palace");
        StringBuffer str=s.insert(8,"New");
        System.out.println("Inserted String"+str);
        System.out.println("+++++++++++++++++++++");
    }
    private static void deleteString()
    {
        StringBuffer s=new StringBuffer("It is a new Palace");
        StringBuffer str=s.delete(8,12);
        System.out.println("Deleted String:"+str);
        System.out.println("++++++++++++++++++++++++");
    }
    private static void reverseString()
    {
        StringBuffer s=new StringBuffer("GenTech Academy");
        StringBuffer str=s.reverse();
        System.out.println("ReverseString"+str);
        System.out.println("+++++++++++++++++++++");
    }
}
