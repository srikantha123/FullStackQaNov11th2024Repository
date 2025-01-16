package Files;

import java.io.FileInputStream;

public class FileInputStreamDemo
{
    public static void main(String[] args)
    {
        readContent();
    }
    private static void readContent()
    {
        int num=0;
        FileInputStream fin = null;
        try
        {
            fin=new FileInputStream("D:\\Demo\\Test\\welcome.txt");
            while(true)
            {
                num=fin.read();
                if(num==-1)
                {
                    break;
                }
                char ch=(char)num;
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
                fin.read();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
