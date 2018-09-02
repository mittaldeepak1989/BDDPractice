package com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue={"com.testCases"},
		monochrome=true,
		plugin={"html:Summary.html","json:Summary.json"},
		tags={"@Custom"},  // or ~@Launch to except
		strict=true
				
		)

public class Runner {

}
