package ClassPraticeFiles;

import java.io.FileInputStream;

public class FileInputStreamDemo
{
    public static void main(String[] args)
    {
        readContent();
    }

    private static void readContent()
    {
        FileInputStream fin=null;
        int num=0;
        try
        {
             fin=new FileInputStream("F:\\Demo\\Test\\Sample.txt");
             while(true)
             {
                 num=fin.read();
                 if(num==-1)
                 {
                     break;
                 }
                 char ch=(char) num;
                 System.out.print(ch);
             }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fin.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
