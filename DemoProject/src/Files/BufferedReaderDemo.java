package Files;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderDemo
{
    public static void main(String[] args)
    {
            ReadContent();
    }
    private static void ReadContent()
    {
        BufferedReader br=null;
        try
        {
            br=new BufferedReader(new FileReader("D:\\Demo\\Test\\Welcome.txt"));
            String strLine=null;
            while((strLine=br.readLine())!=null)
            {
                System.out.println(strLine);
            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                br.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
