package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Drivers 
{
	public static String browser="FF";
	public static String wikiURL="https://www.wikipedia.org/";
	public static String imbdURL="https://www.imdb.com/";
    public static WebDriver d;
    @BeforeMethod
    public static void launchBrowser()
    {
    	switch(browser)
    	{
    	case "FF": 
    		d=new FirefoxDriver();
    		break;
    	case "GC": 
    		d=new ChromeDriver();
    		break;
    	case "Edge":
    		d=new EdgeDriver();
    		break;
    	}
    	
    	d.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    	d.manage().timeouts().pageLoadTimeout(4, TimeUnit.MINUTES);
    	d.manage().window().maximize();
    	d.manage().deleteAllCookies();
    }
    @AfterMethod
    public static void closeBrowser()
	{
		d.quit();
	}
}
