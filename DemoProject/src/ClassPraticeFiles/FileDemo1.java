package ClassPraticeFiles;

import java.io.File;

public class FileDemo1
{
    public static void main(String[] args)
    {

        File f1=new File("F:\\Demo\\Test\\Sample.txt");
        //Display FileName
        String name=f1.getName();
        System.out.println("File Name :"+name);
        //Display File Path
        File path1=f1.getAbsoluteFile();
        System.out.println("File Path :"+path1);
        String path2=f1.getPath();
        System.out.println("File Path :"+path2);
        //Display Folder Path
        String path3=f1.getParent();
        System.out.println("Folder Path:"+path3);
        File path4=f1.getParentFile();
        System.out.println("Folder Path:"+path4);
        //Verify the File or Directory
        boolean v1=f1.isFile();
        System.out.println("Is it a File :"+v1);
        boolean v2=f1.isDirectory();
        System.out.println("Is it a Folder :"+v2);
        //Read, Write and Execution Permission
        boolean v3=f1.canRead();
        System.out.println("whether it is readable? :"+v3);
        boolean v4=f1.canWrite();
        System.out.println("whether it is writable? :"+v4);
        boolean v5=f1.canExecute();
        System.out.println("whether it is Executable? :"+v5);
    }
}
