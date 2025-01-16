package RandomPractice;
class Maths3
{
    void AssignElements(int arr[][])
    {
        int b[] = new int[arr.length * arr[0].length];
        int p = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                b[p] = arr[i][j];
                p++;
            }
        }
        for(int k=b.length-1;k>=0;k--)
        {
            System.out.print(b[k]+" ");
        }
    }
}
public class TwodtoOneDAssign
{
    public static void main(String[] args)
    {
        Maths3 o = new Maths3();
        int b[][] = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        o.AssignElements(b);

    }
}