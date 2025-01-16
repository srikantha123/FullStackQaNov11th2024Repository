package ExceptioHandlingPratice;
class StringTest
{
    int getCharacterCount(String str) throws Exception
    {
        if(str==null)
        {
            throw new Exception("The Given is null,Please Provide the valid String as Input.");
        }
        return str.length();
    }
}

public class Throws {
    public static void main(String[] args)
    {
        StringTest obj=new StringTest();
        try
        {
            int v1 = obj.getCharacterCount("Java");
            System.out.println("Total Character Count: " +v1);
            int v2=obj.getCharacterCount("Srikantha");
            System.out.println(("# of CharacterCount : "+v2));
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
