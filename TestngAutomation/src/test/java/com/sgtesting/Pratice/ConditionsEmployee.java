package com.sgtesting.Pratice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ConditionsEmployee
{
    @Test
    public void createEmployee()
    {
        System.out.println("The Employee DemoEmployee1 has created successfully!!");
    }
    @Test(dependsOnMethods = "createEmployee")
    public void  modifyEmployee()
    {
        System.out.println("The Employee demoEmployee1 has modified succesfully");
    }
    @Test(dependsOnMethods = "modifyEmployee")
    public void deleteEmployee()
    {
        System.out.println("The Employee demoaEmployee1 has deleted successfully");
    }
    @BeforeClass
    public void setUp()
    {
        System.out.println("Launch Browser,Navigte URL and Login into the Application");
    }
    @AfterClass
    public void tearDown()
    {
        System.out.println("Logout from the Application and close Application ");
        System.out.println("+++++++++++++++++++++++++++++++");
    }
}
