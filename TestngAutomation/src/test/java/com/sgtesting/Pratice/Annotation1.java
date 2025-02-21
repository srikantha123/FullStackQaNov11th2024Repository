package com.sgtesting.Pratice;

import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.*;

public class Annotation1
{
    @Test
    public void Method1()
    {
        System.out.println("Tis is @Test Annotation Method1");
    }
    @Test
    public void Method2()
    {
        System.out.println("This is @Test Annotation Method2");
    }
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("This is @BeforeSuite Annotation Method");
    }
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("This is @AfterSuite Annotation Method");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("This is @BeforeTset Annotaton Method");
    }
    @AfterTest
    public void afterTest()
    {
                System.out.println("This is @AfterTest Annotaion Method");
    }
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("This is @BeforeClass Annotation Method");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("This is @AfterClass Annotation Method");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("This is @BeforeMethod Annoation Method");
    }
    @AfterClass
    public void afterMethod()
    {
        System.out.println("This is @AfterClass Annotation Method");
    }
}
