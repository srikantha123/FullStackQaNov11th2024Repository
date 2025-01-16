package com.sgtest.Practice.sgtestPracticeMethod;
class Demo1
{
    void concatinateElements(String s[])
    {
        String str="";
        for(int i=s.length/2;i<s.length;i++)
        {
            str=str+s[i]+" ";
        }
        System.out.println(str);
    }
}

public class MethodSecondhalf
{
    public static void main(String[] args)
    {
        Demo1 o1=new Demo1();
        String kk[]={"orange","apple","pineapple","orange","Banana"};
        o1.concatinateElements(kk);
        o1.concatinateElements(new String[]{"a","b","c","d","e","f"});
    }
}
