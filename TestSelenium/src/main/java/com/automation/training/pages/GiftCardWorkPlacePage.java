package com.automation.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GiftCardWorkPlacePage extends BasePage {

	Actions mouseOver;

	public GiftCardWorkPlacePage(WebDriver driver) {
		super(driver);
		driver.get("https://www.starbucks.com/shop/card/egift/workplace");
	}

	@FindBy(id="card_image")
	private WebElement cardsForm;
	
	@FindBy(id="recipient_name")
	private WebElement insertName;
	
	@FindBy(id="message")
	private WebElement insertMessage;
	
	public GiftCardWorkPlacePage fillDataCard() {
		mouseOver = new Actions(getDriver());
		
		getWait().until(ExpectedConditions.visibilityOf(cardsForm));
		mouseOver.moveToElement(insertName);
		mouseOver.click();
		mouseOver.sendKeys(insertName, "Glober");
		mouseOver.click();
		mouseOver.sendKeys(insertMessage, "Your effort is worth it!");
		mouseOver.perform();
		return this;
	} 
	
	@FindBy(id="sender_name")
	private WebElement insertSenderName;
	
	@FindBy(id="sender_email")
	private WebElement insertSenderEmail;
	
	@FindBy(id="recipient_email")
	private WebElement insertRecipientEmail;
	
	public GiftCardWorkPlacePage fillDataInfoPurchaser() {
		mouseOver = new Actions(getDriver());
		
		mouseOver.moveToElement(insertSenderName);
		mouseOver.click();
		mouseOver.sendKeys(insertSenderName, "Joshua");
		mouseOver.moveToElement(insertSenderEmail);
		mouseOver.click();
		mouseOver.sendKeys(insertSenderEmail, "joshua@ejemplo.com");
		mouseOver.moveToElement(insertRecipientEmail);
		mouseOver.click();
		mouseOver.sendKeys(insertRecipientEmail, "ejemplo@ejemplo.com");
		mouseOver.perform();

		return this;
		
	}
	
	@FindBy(id="delivery_date")
	private WebElement chooseDate;
	
	@FindBy(xpath="//*[@id=\"ecardform\"]/div[3]/span/button")
	private WebElement addToCartButton;
	
	public GiftCardWorkPlacePage fillDate() {
		
		mouseOver = new Actions(getDriver());
		
		mouseOver.moveToElement(addToCartButton);
		mouseOver.click();
		mouseOver.perform();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return this;
	}
	
}
