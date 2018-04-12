package com.automation.training.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.automation.training.MyDriver;
import com.automation.training.pages.StarBucksHomePage;

public class BaseTests {

	MyDriver myDriver;
	
	private StarBucksHomePage starHome;
	
	@BeforeSuite(alwaysRun = true)
	@Parameters({"browser"})
	public void beforeSuite(String browser) {
		myDriver = new MyDriver(browser);
		starHome = new StarBucksHomePage(myDriver.getDriver());
	}
	
	@AfterSuite(alwaysRun=true)
	public void afterSuite() {
		starHome.dispose();
	}
}
