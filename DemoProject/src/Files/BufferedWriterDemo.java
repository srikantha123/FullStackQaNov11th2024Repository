package Files;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterDemo
{
    public static void main(String[] args)
    {
        BufferedWriter();
    }
    private static void BufferedWriter()
    {
        BufferedWriter bw=null;
        try
        {
            bw=new BufferedWriter(new FileWriter("D:\\Demo\\Test\\welcome.txt"));
            bw.write("There are childers playing the ground");
            bw.newLine();
            bw.write("The Childer are beloging to govt primary school");

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                bw.close();
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
