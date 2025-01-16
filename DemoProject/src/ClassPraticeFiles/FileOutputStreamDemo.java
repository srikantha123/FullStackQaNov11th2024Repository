     package ClassPraticeFiles;

import java.io.FileOutputStream;

public class FileOutputStreamDemo
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
            fout=new FileOutputStream("F:\\Demo\\Test\\Welcome1.txt",true);

            String str="Bangalore is a a capital city of Karnataka.";
            str+="It is also called as Garden City of Karnataka.";

            byte b[]=str.getBytes();

            fout.write(b);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fout.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
