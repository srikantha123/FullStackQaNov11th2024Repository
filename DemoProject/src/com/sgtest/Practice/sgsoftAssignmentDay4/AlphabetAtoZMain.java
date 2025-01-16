package com.sgtest.Practice.sgsoftAssignmentDay4;
class Alphabet
{
    void getAlphabet()
    {
        for (char i='A';i<='Z';i++)
        {
            System.out.print(i+" ");
        }
    }
}
public class AlphabetAtoZMain
{
    public static void main(String[] args)
    {
        Alphabet o=new Alphabet();
        o.getAlphabet();
    }
}