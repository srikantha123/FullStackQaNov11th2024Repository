package com.sgtesting.conditions.PraticeConditions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Employee1
{

    @Test
    public void createUser()
    {
        System.out.println("The Employee demoEmployee has created successfully!!!");
    }
    @Test(dependsOnMethods="createUser")
    public void modifyUser()
    {
        System.out.println("The Employee demoEmployee has modified successfully!!!");
    }
    @Test(dependsOnMethods = "modifyUser")
    public void deleteUser()
    {
        System.out.println("The Employee demoEmployee has deleted successfully!!!");
    }
    @BeforeClass
    public void setup()
    {
        System.out.println("Launch Browser ,NavigateURL and login Application");
    }
    @AfterClass
    public void tearDown()
    {
        System.out.println("Logout Application and Close Browser");
    }
}

