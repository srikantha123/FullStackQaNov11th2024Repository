package com.sgtesting.Pratice;

import org.testng.annotations.*;

public class AnnotationSummary
{

    @Test
    public void method1()
    {
        System.out.println("This is @Test Annotation method1");
    }
    @Test
    public void method2()
    {
        System.out.println("This is @Test Annotation Method2");
    }
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("This is @BeforeClass Annotation Method");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("This is @AfterClass Annotation method");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("This ia @BeforeMethod Annotation Method");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("This is @AfterMethod Annotation Method");
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
        System.out.println("This is @BeforeTest Annotation Method");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("This is @afterTest Annotation Method");
    }
}
