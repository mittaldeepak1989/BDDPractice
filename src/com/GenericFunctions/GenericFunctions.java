package com.GenericFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericFunctions {

	public static WebDriver driver;
		
	public static boolean launchBrowser(String browser,String url)
	{
		boolean status=true;
		try
		{
			
		switch(browser.toLowerCase())	
		{	
		case "ff":
			driver= new FirefoxDriver();
			driver.get(url);
			break;
			
		case "chrome":	
			System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
			driver= new ChromeDriver();
			driver.get(url);
			break;	
			
		default :
			throw new Exception("Invalid Browser input " +browser);
		}
			
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			status = false;
		}
		return status;
	}
}
