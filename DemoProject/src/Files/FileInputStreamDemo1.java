package Files;

import java.io.FileInputStream;

public class FileInputStreamDemo1
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
            fin=new FileInputStream("D:\\Demo\\Test\\welcome.txt");
            while(true)
            {
                num= fin.read();
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
                fin.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
