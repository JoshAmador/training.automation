package com.automation.training.pages;

import org.openqa.selenium.WebDriver;

public class CoffeeMenu extends BasePage{

	public CoffeeMenu(WebDriver driver) {
		super(driver);
		driver.get("https://www.starbucks.com/coffee");
	}
	
	@FindBy(id="nav_coffee")
	
}
