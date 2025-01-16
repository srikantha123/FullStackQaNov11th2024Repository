package MainPackage;

import P1.SubClassINP1Package;
import P1.Protection;
import P1.IndependentClassInP1Package;
import P2.IndependentClassInP2Package;
import P2.SubClassInP2Package;

public class ExecutionDemo {
    public static void main(String[] args) {
        //Execute Protection class Constructor
       // Protection o=new Protection();

        //SubClassINP1Package o1=new SubClassINP1Package();
      //  IndependentClassInP1Package o2=new IndependentClassInP1Package();
        IndependentClassInP2Package o4=new IndependentClassInP2Package();
        SubClassInP2Package o5=new SubClassInP2Package();
    }
}
