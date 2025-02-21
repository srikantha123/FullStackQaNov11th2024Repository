package com.sgtesting.hardassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSameDemo {

    @Test
    public void validateSame()
    {
        try
        {
            String s1="JavaScript";
            String s2="JavaScript";
            Assert.assertSame(s1, s2);
            System.out.println("The AssertSame Step has passed successfully");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void validateNotSame()
    {
        try
        {
            String s1="JavaScript";
            String s2=new String("JavaScript");
            Assert.assertNotSame(s1, s2);
            System.out.println("The AssertNotSame Step has passed successfully");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
