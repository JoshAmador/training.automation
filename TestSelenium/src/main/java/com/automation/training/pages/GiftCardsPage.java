package com.automation.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GiftCardsPage extends BasePage{

	GiftCardsPage giftCardsPage;

	Actions mouseOver;
	
	public GiftCardsPage(WebDriver driver) {
		super(driver);
		driver.get("https://www.starbucks.com/shop/card/egift");
	}
	
	@FindBy(xpath="//*[@id=\'egift-categories\']/li[7]/a/img")
	private WebElement WorkPlaceCard;
	
	@FindBy(id="egift-categories")
	private WebElement eCards;
	
	public GiftCardWorkPlacePage clickCard() {
		mouseOver = new Actions(getDriver());
		getWait().until(ExpectedConditions.elementToBeClickable(eCards));
		mouseOver.moveToElement(WorkPlaceCard);
		mouseOver.click().perform();
		
		return new GiftCardWorkPlacePage(getDriver());
	}
	
}
