package com.sgtest.Practice.InhertanceAssignment;
class State
{
    String statename1;
    void state()
    {
        System.out.println("StateName:"+statename1);
    }
    void Displayname(String ename)
    {
        System.out.println("ename:"+ename);
    }
}
class state1 extends State
{
    String statename1;
    state1(String statename2,String name)
    {
        super.statename1=statename2;
        super.Displayname(name);
    }

    public state1(String statename1) {
        super();
    }
//    public state1(String Displayname)
//    {
//        super();
//    }

    void Displayname(String statename1)
    {
        System.out.println("Ename:"+statename1);
    }
}
public class BothSameDataTypeSameMethod {
    public static void main(String[] args) {
        state1 o=new state1("sri");
        o.Displayname("srikantha");
    }
}
