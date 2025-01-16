package Files;
import java.io.File;
import java.io.IOException;

public class FileDemo1
{
    public static void main(String[] args)
    {
        //create file
        File f1=new File("D:\\Demo\\Test\\sample.txt");
        try {
            f1.createNewFile();
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        //DisplayNAme
        String f2=f1.getName();
        System.out.println(f2);
        //Display filepath
        String f3=f1.getPath();
        System.out.println(f3);
        File f4=f1.getAbsoluteFile();
        System.out.println(f4);
        //display Folderpath
        String f5=f1.getParent();
        System.out.println(f5);
        File path=f1.getParentFile();
        System.out.println(path);
        //verify or Directory
        boolean v1=f1.isFile();
        System.out.println(v1);
        boolean v2=f1.isDirectory();
        System.out.println(v2);
        //read write Execute permission
        boolean v3=f1.canRead();
        System.out.println(v3);
        //write
        boolean v4=f1.canWrite();
        System.out.println(v4);
        //Execute
        boolean v5=f1.canExecute();
        System.out.println(v5);
    }
}
