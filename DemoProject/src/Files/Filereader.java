package Files;

import java.io.FileReader;

public class Filereader
{
    public static void main(String[] args)
    {
        FilereaderDemo();
    }
    private static void FilereaderDemo()
    {
        FileReader fr=null;
        int num=0;
        try
        {
            fr=new FileReader("D:\\Demo\\Test\\welcome.txt");
            while(true)
            {
                num=fr.read();
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
                fr.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
