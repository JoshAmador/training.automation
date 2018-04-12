package com.automation.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.automation.training.tests.BaseTests;

public class OtherCoffees extends BasePage{

Actions mouseOver = new Actions(getDriver());
	
	public OtherCoffees(WebDriver driver) {
		super(driver);
		driver.get("https://athome.starbucks.com/explore-our-coffees/");
	}
	
}
