package com.sgtest.Practice.sgtesting.practice1;
class demo2 {
    void assignelement(int arr[][]) {
        int p = 0;
        int b[] = new int[arr.length * arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                b[p] = arr[i][j];
                p++;
            }
        }
        for (int z = b.length - 1; z >= 0; z--) {
            System.out.println(b[z]);
        }
    }
}
public class Method2DArrayinto1DArray {
    public static void main(String[] args) {
        demo2 o1=new demo2();
        int a[][]={{10,20,30,},{40,50,60},{70,80,9}};
        o1.assignelement(a);

    }
}
