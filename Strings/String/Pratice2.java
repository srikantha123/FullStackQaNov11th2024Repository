package Strings.String;

import java.io.File;

public class Pratice2
{
    public static void main(String[] args)
    {
        File f1=new File("D:\\Demo\\Test\\Sample.txt");
        //Display Filename
        String name=f1.getName();
        System.out.println("FileName:  "+name);
        //Display file Path
        File path1=f1.getAbsoluteFile();
        System.out.println("FilePath: "+path1);
        //Display
        String path2=f1.getPath();
        System.out.println("File Path2:"+path2);
        //Display Folder PAth
        String path3=f1.getParent();
        System.out.println("Folder Path:"+path3);
        //Display
        File path4=f1.getParentFile();
        System.out.println("ParentFile:"+path4);
        //Verify the file or Directory
        boolean v1=f1.isFile();
        System.out.println("It ia file:"+v1);
        boolean v2=f1.isDirectory();
        System.out.println("it is folder:"+v2);
        boolean v3=f1.canRead();
        System.out.println("Weather it is readble:"+v3);
        boolean v4=f1.canWrite();
        System.out.println("Weather it is writable :"+v4);
        boolean v5=f1.canExecute();
        System.out.println("weather  it is Executable:"+v5);


    }

}
