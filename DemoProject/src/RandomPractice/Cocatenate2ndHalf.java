package RandomPractice;
class Maths1
{
    void ConcatenateElements(String s[])
    {
        String str="";
        for(int i=s.length/2;i<s.length;i++)
        {
            str=str+s[i]+" ";
        }
        System.out.println(str);

    }
}

public class Cocatenate2ndHalf {
    public static void main(String[] args) {
        Maths1 o=new Maths1();
        String zz[]={"Aapple","Boll","Cat","Doll","Elephant","Fish"};
        o.ConcatenateElements(zz);
        o.ConcatenateElements(new String[]{"AA","BB","CC","DD","EE","FF"});

    }
}
