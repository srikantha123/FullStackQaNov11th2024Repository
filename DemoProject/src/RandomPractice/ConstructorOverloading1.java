package RandomPractice;
class Library
{
    Library(String BookName,int NumberofBook)
    {
        System.out.println("bookname:"+BookName);
    }
    Library(String Type,String Comment,int Serialnumber)
    {
        this("CoreJava",10);
        System.out.println("booktype:"+Type +  "book:"+Comment + "BookSerialnumber:"+Serialnumber);
    }
}

public class ConstructorOverloading1 {
    public static void main(String[] args) {
        Library o=new Library("Hard","Awsome",112);
    }
}
