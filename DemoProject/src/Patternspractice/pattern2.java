package Patternspractice;
public class pattern2
{
    public static void main(String[] args)
    {
        //int num=Integer.parseInt(args[0]);
        int num=5;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
                if((i==1 || i==num|| i==num/2+1 || j==1 && i<=num/2+1 || j==num && i>num/2+1))
                {
                    System.out.print("*"+" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
