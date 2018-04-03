package com.automation.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StarBucksHomePage extends BasePage{

	public StarBucksHomePage(WebDriver driver) {
		super(driver);
		driver.get("https://www.starbucks.com/");
	}

	@FindBy(id="nav")
	private WebElement menuNavegacion;
	
	@FindBy(id="nav_coffee")
	private WebElement tabCafe;
	
	public void buscarNav(String buscarNav) {
		getWait().until(ExpectedConditions.visibilityOf(menuNavegacion));
		tabCafe.getText();
		System.out.println(menuNavegacion.getText());
		
	}
	
}
