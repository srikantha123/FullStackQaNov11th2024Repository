package Files;

import java.io.FileWriter;

public class FileWriterDemo
{
    public static void main(String[] args)
    {
           filereader();
    }
    private static void filereader()
    {
        FileWriter fw=null;
        try
        {
            fw=new FileWriter("D:\\Demo\\Test\\welcome.txt");
            String str="Hi Hello Banglore";
            str+="Cool City";

            char ch[]=str.toCharArray();
            fw.write(ch);
            System.out.println(ch);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fw.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
