package ClassPraticeFiles;

import java.io.File;

public class FileOperationsDemo
{
    public static void main(String[] args)
    {
    //    createFile();
    //    renameFile();
    //    deleteFile();
    //    fileCollections();
        showPdffiles();
    }

    private static void createFile()
    {
        try
        {
            File f1=new File("F:\\Demo\\Test\\Welcome.txt");
            f1.createNewFile();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void renameFile()
    {
        File f1=new File("F:\\Demo\\Test\\Welcome.txt");
        File f2=new File("F:\\Demo\\Test\\Welcome_Testing.txt");
        f1.renameTo(f2);
    }

    private static void deleteFile()
    {
        File f2=new File("F:\\Demo\\Test\\Welcome_Testing.txt");
        boolean v1=f2.delete();
        System.out.println("has file deleted :"+v1);
    }

    private static void fileCollections()
    {
        File f1=new File("F:\\Demo\\Test");
        File[] arr=f1.listFiles();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].isFile()==true)
            {
                String filepath=arr[i].getPath();
                System.out.println(filepath);
            }
        }
    }

    private static void showPdffiles()
    {
        File f1=new File("F:\\Demo\\Test");
        File[] arr=f1.listFiles();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].isFile()==true)
            {
                if(arr[i].getPath().endsWith("pdf"))
                {
                    String filepath=arr[i].getPath();
                    System.out.println(filepath);
                }
            }
        }
    }
}
