package com.testCases;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.RegistrationPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class S123412_TC_001_SectionHeader extends GenericFunctions {

	public static RegistrationPage reg;
	@Given("^As an user i want to launch \"([^\"]*)\" browser and pass the url and maximize it$")
	public static void launchApplication(String browser,DataTable testdata)
	{	
		
		List<List<String>> data=testdata.raw();
		
		System.out.println(data.get(0).get(0));
		
		String url=data.get(0).get(0);
		
		boolean status;
		status= launchBrowser(browser,url);
		if(status)
		{
			System.out.println("Browser is launched successfully");
		}
		else
		{
			System.out.println("Browser is not launched");
		}		
	}
	
	@When("Application is launched click on register link")
	public static void clickOnRegisterLink()
	{
		RegistrationPage reg = PageFactory.initElements(driver, RegistrationPage.class);
		reg.clickRegistrationLink();
		System.out.println("Clicking on Register Link");
	}
	
	/*@Then("Verify Register page is launched successfully")
	public static void verifyRegisterPage()
	{
		System.out.println("Verify Register page");
	}
	
	@And("Verify section headers are displayed as expected")
	public static void verifySectionHeaders()
	{
		System.out.println("Verify Register page");
	}*/
}
