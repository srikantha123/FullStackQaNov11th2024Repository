package com.sgtest.Practice.AssignmentDay5;
class Char
{
    String getConcatinate(char ch[][])
    {
        String s="";
        for (int i=0;i<ch[0].length;i++)
        {
            s = s + ch[1][i];
        }
        return s;
    }
}

public class CharConcatinate {
    public static void main(String[] args) {
        Char o=new Char();
        char ch1[][]={{'a','b','c'},{'d','e','f',},{'g','h','i'}};
        String s=o.getConcatinate(ch1);
        System.out.println(s);
    }
}
