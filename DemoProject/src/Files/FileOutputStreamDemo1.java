package Files;

import java.io.FileOutputStream;

public class FileOutputStreamDemo1
{
    public static void main(String[] args)
    {
        writeContent();
    }
    private static void writeContent()
    {
        FileOutputStream fout=null;
        try
        {
            fout=new FileOutputStream("D:\\Demo\\Test\\welcome.txt");
            String str="Banglore is a Capital city of Karnataka.";
            str+="And Banglore is Garden City of Karnataka";

            byte b[]=str.getBytes();
            fout.write(b);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fout.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
