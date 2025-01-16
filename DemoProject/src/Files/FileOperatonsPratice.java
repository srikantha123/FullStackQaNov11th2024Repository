package Files;

import java.io.File;

public class FileOperatonsPratice
{
    public static void main(String[] args)
    {
        //createfile();
        //renamefile();
        //deletefile();
        filecollections();
       // showfiles();
    }
    private static void createfile()
    {
        try
        {
            File f1 = new File("D:\\Demo\\Test\\sample.txt");
            f1.createNewFile();
            System.out.println(f1);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void renamefile()
    {
        File f1=new File("D:\\Demo\\Test\\sample.txt");
        File f2=new File("D:\\Demo\\Test\\sample_testing.txt");
        f1.renameTo(f2);
        System.out.println("rename:"+f2);
    }
    private static void deletefile()
    {
        File f1=new File("D:\\Demo\\Test\\sample_testing.txt");
        boolean s1=f1.delete();
        System.out.println(s1);
    }
    private static void filecollections()
    {
        File f1=new File("D:\\Demo\\Test");
        File[] arr=f1.listFiles();
        for(int i=0;i<= arr.length;i++)
        {
            if(arr[i].isFile()==true)
            {
                String filepath=arr[i].getPath();
                System.out.println(filepath);
            }
        }
    }
    private static void showfiles()
    {
        File f1=new File("D:\\Demo\\Test");
        File[] arr=f1.listFiles();
        for(int i=0;i<=arr.length;i++)
        {
            if(arr[i].isFile()==true)
            {
                if(arr[i].getPath().endsWith("pdf"))
                {
                    String s1=arr[i].getPath();
                    System.out.println(s1);
                }
            }
        }
    }
}
