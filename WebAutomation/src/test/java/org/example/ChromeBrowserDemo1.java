package org.example.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo1
{
    public static WebDriver oBrowser=null;

    public static void main(String[] args)
    {
        launchBrowser();
        navigateURL();
        closeApplication();
    }
    private static void launchBrowser()
    {
        try
        {
            oBrowser=new ChromeDriver();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
    private static void navigateURL()
    {
        try
        {
            oBrowser.get("http://localhost/login.do");
            Thread.sleep(4000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void closeApplication()
    {
        try
        {
            oBrowser.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
