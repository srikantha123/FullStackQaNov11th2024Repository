package AssignmentStrings;

import java.sql.SQLOutput;

public class Pgm6_RemoveDayInsertComma
{
    public static void main(String[] args)
    {
        RemoveDayInsertComma();
    }
    private static void RemoveDayInsertComma()
    {
        String s=new String("SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY");
        String str[]=s.split("DAY");
        System.out.println("The String after removing each occurences of DAY is.");
        for(String ss:str)
        {
            System.out.print(ss+" ");
        }
        System.out.println();
        System.out.println("The String after inserting comma is.");
        String s1=s.replace("DAY","DAY,");
        System.out.print(s1+" ");
    }
}
