package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPage {
	@FindBy(how=How.CSS,using=".ico-register")  //or //a[text()='Register']
	public static WebElement LNK_REGISTER_LOGIN;
	
	public static boolean clickRegistrationLink()
	{
		boolean status = true;
		try
		{
			LNK_REGISTER_LOGIN.click();
		}
	catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
		return status;
	}
	

}
