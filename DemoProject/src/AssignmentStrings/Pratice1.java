package AssignmentStrings;

class sri {
    String string() {
        String s = "WELCOME";
        String b1 = s.toLowerCase();
        return b1;
        // System.out.println("LowerCase:"+s1);
    }

    String uppercase() {
        String s = "welcome";
        String b2 = s.toUpperCase();
        return b2;

    }

    int getLength() {
        String s = "Welcome";
        int b3 = s.length();
        return b3;
    }

    boolean verifyEmpty() {
        String s = "";
        return Boolean.parseBoolean(s);
        //Boolean.parseBoolean(s);
    }

    char getCharIndex() {
        String b5 = "GENTECH";
        char ch = b5.charAt(0);
        return ch;
    }

    String rePlace() {
        String b6 = "Welcome";
        String s = b6.replace("l", "ll");
        return s;
    }

    boolean strCompare() {
        String b7 = "WELCOME";
        String b8 = "welcome";
        boolean s = b7.equals(b8);
        return s;
    }

    boolean strCompare1() {
        String b7 = "WELCOME";
        String b8 = "welcome";
        boolean s1 = b7.equalsIgnoreCase(b8);
        return s1;
    }

    int strCompare2() {
        String b9 = "JavaScript";
        String b10 = "JAVASCRIPT";
        int s3 = b9.compareTo(b10);
        return s3;
    }

    int strCompare3() {
        String b9 = "JavaScript";
        String b10 = "WELCOME";
        int s3 = b9.compareToIgnoreCase(b10);
        return s3;
    }

    boolean ExestinceOfString() {
        String b11 = "Banglore Is Capital City Of Karnataka";
        boolean s1 = b11.startsWith("Banglore");
        boolean s2 = b11.endsWith("Karnataka");
        boolean s3 = b11.contains("Capital");
        return s2;
    }

    int showPosition() {
        String b12 = "It is a new college,it is";
        int s1 = b12.indexOf("is");
        int s2 = b12.indexOf("is", 5);
        return s1;
    }

    int lastIndex() {
        String b13 = "It is a new college,it is";
        int s1 = b13.lastIndexOf("is");
        return s1;
    }

    String ConverttoString() {
        int b14 = 35;
        String s1 = String.valueOf(b14);
        return s1;
    }
    String substring()
    {
        String s="Programming";
        String v1=s.substring(3,7);
        String v2 = v1;
        return v2;
    }
    int  astring()
    {
        String s=new String("program");
        int s1=s.length();
        return s1;
    }
//    String appenda()
//    {
//        String c=new String("Program");
//        String c1= append("java");
//        return v1;
//    }
}

public class Pratice1
{
    public static void main(String[] args)
    {

        sri o=new sri();
       String v1= o.string();
        System.out.println(v1);
        String v2=o.uppercase();
        System.out.println(v2);
        int v3=o.getLength();
        System.out.println(v3);
        boolean v4=o.verifyEmpty();
        System.out.println(v4);
        char v5=o.getCharIndex();
        System.out.println(v5);
        String v6=o.rePlace();
        System.out.println(v6);
        boolean v7=o.strCompare();
        System.out.println(v7);
        boolean v9=o.strCompare1();
        System.out.println(v9);
        int v10=o.strCompare2();
        System.out.println(v10);
        int v11=o.strCompare3();
        System.out.println(v11);
        boolean v12=o.ExestinceOfString();
        System.out.println(v12);
        int v13=o.showPosition();
        System.out.println(v13);
        int v14=o.lastIndex();
        System.out.println(v14);
        String v15=o.ConverttoString();
        System.out.println(v15);
        String v16=o.substring();
        System.out.println(v16);
        int v17=o.astring();
        System.out.println(v17);
//        String v18=o.appenda();
//        System.out.println(v18);
    }

}
