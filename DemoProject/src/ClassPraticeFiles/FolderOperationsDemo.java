package ClassPraticeFiles;

import java.io.File;

public class FolderOperationsDemo {
    public static void main(String[] args) {
    //    createFolder();
   //     createNestedFolders();
   //     renameFolder();
    //    deleteFolders();
        folderCollections();
    }

    private static void createFolder()
    {
        File f1=new File("F:\\Demo\\Test\\GENTECH");
        boolean v1=f1.mkdir();
        System.out.println("whether Folder has created :"+v1);
    }

    private static void createNestedFolders()
    {
        File f1=new File("F:\\Demo\\Test\\G1\\G2\\G3\\G4\\G5");
        boolean v1=f1.mkdirs();
        System.out.println("whether Nested Folders have created :"+v1);
    }

    private static void renameFolder()
    {
        File f1=new File("F:\\Demo\\Test\\GENTECH");
        File f2=new File("F:\\Demo\\Test\\GENTECHACADEMY");
        f1.renameTo(f2);
    }

    private static void deleteFolders()
    {
        File f1=new File("F:\\Demo\\Test\\SOFTWARE");
        boolean v1=f1.delete();
        System.out.println("Whether Folder has deleted :"+v1);
    }

    private static void folderCollections()
    {
        File f1=new File("F:\\Demo\\Test");
        File[] arr=f1.listFiles();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].isDirectory()==true)
            {
                String filepath=arr[i].getPath();
                System.out.println(filepath);
            }
        }
    }
}
 