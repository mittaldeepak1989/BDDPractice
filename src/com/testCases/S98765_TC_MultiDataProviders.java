package com.testCases;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class S98765_TC_MultiDataProviders {
	
	
	@Before
	public static void getdata()
	{
		System.out.println("Before hooks");
	}
	
	@After
	public static void disconnect()
	{
		System.out.println("After hooks");
	}
	
	@Given("^a precondition has value (.*) with (http:.*)$")
	public void testmultipledata(String browser,String url) {
	    
		
		
		System.out.println(browser+"......"+url);
	}
	

}
