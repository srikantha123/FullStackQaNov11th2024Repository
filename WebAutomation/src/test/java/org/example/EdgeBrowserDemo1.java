package org.example.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserDemo1
{
    public static WebDriver oBrowser=null;
    public static void main(String[] args)
    {
        launchBrowser();
        NavigateURL();
        closeApplication();
    }
    private static void launchBrowser()
    {
        try
        {
            oBrowser=new EdgeDriver();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    private static void NavigateURL()
    {
        try
        {
            oBrowser.get("http://localhost/login.do");
            Thread.sleep(4000);
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
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}
