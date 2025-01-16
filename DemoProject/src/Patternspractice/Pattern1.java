package Patternspractice;
public class Pattern1 {
    public static void main(String[] args) {
        //int num=Integer.parseInt(args[0]);
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if((j==1 ||  j==n) ||(i==1 || i==n ))
                    System.out.print("*"+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
