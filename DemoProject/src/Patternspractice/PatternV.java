package Patternspractice;

public class PatternV
{
    public static void main(String[] args) {
        int n=5;
        int x=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<2*n;j++)
            {
                if(j==x || j==2*n-x)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            x++;
        }
    }
}
