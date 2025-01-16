package com.sgtest.Practice.InterfaceAssignments;
interface University
{
    abstract void UniversityName(String name);
}
interface UniversityCode
{
    abstract void Universitynumber(int number);
}
interface UniversityBranch extends UniversityCode,University
{
    abstract void UniversityPlace(String name);
}
class College implements UniversityBranch
{
    public void UniversityName(String name)
    {
        System.out.println("Name:" + name);
    }

    public void Universitynumber(int number)
    {
        System.out.println("number:" + number);
    }

    public void UniversityPlace(String name)
    {
        System.out.println("Place:"+name);
    }
}
public class WAPExtendMoreInterface
{
    public static void main(String[] args)
    {
    College o=new College();
    o.UniversityName("VTU");
    o.Universitynumber(112);
    o.UniversityPlace("Balagavi");
    }
}
