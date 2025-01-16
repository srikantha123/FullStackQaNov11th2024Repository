package ExceptioHandlingPratice;
class Stringtesting
{
    static int getChracterCount(String str) throws Exception
    {
        if(str==null)
        {
            throw new Exception("The input is invalid,Please Provide valid input");
        }
        return str.length();
    }
}

public class MethodLevelPratice
{
    public static void main(String[] args)
    {
       try
       {
           int v1 = Stringtesting.getChracterCount("GenTech");
           System.out.println("CharacterCount:"+v1);

           int v2=Stringtesting.getChracterCount("Srikanthajujjiiiiii");
           System.out.println("# character Count:"+v2);
       }catch (Exception e)
       {
           System.out.println(e);
       }
    }
}
