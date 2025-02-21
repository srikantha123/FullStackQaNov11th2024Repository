package com.sgtesting.conditions.PraticeConditions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class User1
{
    @Test(priority = 1)
    public void createUser()
    {
        System.out.println("The User demoUser1 has created successfully");
    }
    @Test(priority = 3)
    public void modifyUser()
    {
        System.out.println("The User demoUser1 has modified successfully");
    }
    @Test(priority = 2)
    public void deleteUser()
    {
        System.out.println("The User demoUser1 has deleted successfully");
    }
    @BeforeClass
    public void setUp()
    {
        System.out.println("Launch Browser, NavigateURL and Login Application");
    }
    @AfterClass
    public void tearDown()
    {
        System.out.println("Logout Applications ,and Close Application");
    }
}
