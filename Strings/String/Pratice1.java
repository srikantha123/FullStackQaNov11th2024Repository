package Strings.String;

public class Pratice1 {
    public static void main(String[] args) {
        lowercase();
        uppercase();
        getStrLength();
        verifyEmpty();
        getCharBasedOnIndex();
        replaceDemo();
        strCompare1();
        strCompare2();
        existanceOfString();
        showPosition1();
        showPosition2();
        convertToCharArray();
        splitString();
        convertToString();
        subStringDemo();
    }

    private static void lowercase() {
        String s = "WELCOME";
        String s1 = s.toLowerCase();
        System.out.println("Lower case :" + s1);
        System.out.println("+++++++++++++++++++");
    }
    private static void uppercase() {
        String s = new String("program");
        String s1 = s.toUpperCase();
        System.out.println("Upper case :" + s1);
        System.out.println("+++++++++++++++++++");
    }
    private static void getStrLength() {
        String s = "S G Testing";
        int count = s.length();
        System.out.println("Number of Chars :" + count);
        System.out.println("+++++++++++++++++++");
    }
    private static void verifyEmpty() {
        String s = new String();
        boolean v1 = s.isEmpty();
        System.out.println("Is this String Empty :" + v1);
        System.out.println("+++++++++++++++++++");
    }
    private static void getCharBasedOnIndex() {
        String s = "GENTECH";
        //char ch = s.charAt(0);
        char ch = s.charAt(0);
        System.out.println("1st Position Character :" + ch);
        System.out.println("+++++++++++++++++++");
    }
    private static void replaceDemo() {
        String s = "It is a new palace";
        //String s1 = s.replace("is", "was");
        String s1 = s.replace("is", "was");
        System.out.println("Replace Result:" + s1);
        System.out.println("+++++++++++++++++++");
    }
    private static void strCompare1() {
        String s1 = "JavaScript";
        String s2 = "JAVASCRIPT";
        boolean v1 = s1.equals(s2);
        System.out.println("s1 and s2 are equal :" + v1);
        boolean v2 = s1.equalsIgnoreCase(s2);
        System.out.println("s1 and s2 are equal :" + v2);
        System.out.println("+++++++++++++++++++");
    }
    private static void strCompare2() {
        String s1 = "JavaScript";
        String s2 = "JAVASCRIPT";
        int v1 = s1.compareTo(s2);
        System.out.println("s1 and s2 are equal :" + v1);
        int v2 = s1.compareToIgnoreCase(s2);
        System.out.println("s1 and s2 are equal :" + v2);
        System.out.println("+++++++++++++++++++");
    }
    private static void existanceOfString() {
        String s1 = "Bangalore is capital city of karnataka";
        boolean v1 = s1.startsWith("Bangalore");
        System.out.println("Starts With :" + v1);
        boolean v2 = s1.endsWith("Karnataka");
        System.out.println("Ends With :" + v2);
        boolean v3 = s1.contains("capital");
        System.out.println("Contains :" + v3);
        System.out.println("+++++++++++++++++++");
    }
    private static void showPosition1() {
        String s1 = "It is a new College,It is";
        int v1 = s1.indexOf("is");
        System.out.println("Position of 'is' :" + v1);
        int v2 = s1.indexOf("is", 5);
        System.out.println("Position of 'is' :" + v2);
        System.out.println("+++++++++++++++++++");
    }
    private static void showPosition2() {
        String s1 = "It is a new College,It is";
        int v1 = s1.lastIndexOf("is");
        System.out.println("Position of 'is' :" + v1);
        System.out.println("+++++++++++++++++++");
    }
    private static void convertToCharArray() {
        String s = "GENTECH";
        char ch[] = s.toCharArray();
        for (char ch1 : ch) {
            System.out.println(ch1);
        }
        System.out.println("+++++++++++++++++++");
    }

    private static void splitString() {
        String s = "Mango Apple Orange Banana";
        String str[] = s.split(" ");
        for (String kk : str) {
            System.out.println(kk);
        }
        System.out.println("+++++++++++++++++++");
    }

    private static void convertToString() {
        int a = 35;
        String s1 = String.valueOf(a);
        System.out.println(s1);
        double d = 14.77;
        String s2 = String.valueOf(d);
        System.out.println(s2);
        System.out.println("+++++++++++++++++++");
    }

    private static void subStringDemo() {
        String s = "Programming";
        String s1 = s.substring(3);
        System.out.println(s1);
        String s2 = s.substring(3, 7);
        System.out.println(s2);
        System.out.println("+++++++++++++++++++");
    }
}
