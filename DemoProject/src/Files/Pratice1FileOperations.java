package Files;

import java.io.File;

public class Pratice1FileOperations
{
    public static void main(String[] args)
    {
        //Createfile();
        //Renamefile();
        //Deletefile();
        //filecollections();
        showfiles();
    }
    private static void Createfile()
    {
        try {
            File f1 = new File("D:\\Demo\\Test\\Welcome.txt");
            f1.createNewFile();

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void Renamefile()
    {
        File f1 = new File("D:\\Demo\\Test\\Welcome.txt");
        File f2 = new File("D:\\Demo\\Test\\Welcome_Testing.txt");
        f1.renameTo(f2);
        //System.out.println("Rename:"+v1);

    }
    private static void Deletefile()
    {
        File f2 = new File("D:\\Demo\\Test\\Welcome_Testing.txt");
        f2.delete();
    }
    private static void filecollections()
    {
        File f1 = new File("D:\\Demo\\Test");
        File [] arr=f1.listFiles();
        for(int i=0;i<=arr.length;i++)
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
        File [] arr=f1.listFiles();
        for(int i=0;i<=arr.length;i++)
            if(arr[i].isFile()==true)
            {
                if(arr[i].getPath().endsWith("txt"))
                {
                    String filepath=arr[i].getPath();
                    System.out.println(filepath);
                }
            }
    }
}
