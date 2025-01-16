package AssignmentStrings;

public class Pgm2_NumberOfCharecterInGivenString
{
    public static void main(String[] args)
    {
        stringLength();
    }
    private static void stringLength()
    {
        String s = "Rithesh John M";
        int count = 0;
        char ch[] = s.toCharArray();
        System.out.println("The given String is:"+s);
        for (int kk:ch)
        {
            count = count + 1;
        }
        System.out.println("Length of charecters in given string is:" + count);
    }

}

