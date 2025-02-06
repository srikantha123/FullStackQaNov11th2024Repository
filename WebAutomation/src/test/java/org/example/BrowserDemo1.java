package org.example.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserDemo1
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
            oBrowser=new InternetExplorerDriver();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
    private static void navigateURL()
    {
        try
        {
            oBrowser.get("http://localhost/login.do");
            Thread.sleep(10000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void closeApplication()
    {
        try
        {
            oBrowser.close();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
