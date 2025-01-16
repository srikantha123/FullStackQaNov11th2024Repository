package RandomPractice;
class Maths2
{
    Maths2 (char ch[][])
    {
     for(int i=0;i<ch.length;i++)
     {
         for(int j=0;j<ch[i].length;j++)
         {
             System.out.print(ch[i][j]+" ");
         }
         System.out.println();

     }
    }
}

public class CharPractice {
    public static void main(String[] args)
    {
        char ch[][]={{'A','B','C'},{'D','E','F'},{'G','H','I'}};
        Maths2 o=new Maths2(ch);
        Maths2 o1=new Maths2(new char[][]{{'S','R','I'},{'K','A','N'},{'T','H','A'}});

    }
}
