package ClassPraticeFiles;

import java.io.FileReader;

public class FileReaderDemo {
    public static void main(String[] args)
    {
        readContent();
    }

    private static void readContent()
    {
        FileReader fr=null;
        int num=0;
        try
        {
            fr=new FileReader("F:\\Demo\\Test\\Sample.txt");
            while(true)
            {
                num=fr.read();
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
                fr.close();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
