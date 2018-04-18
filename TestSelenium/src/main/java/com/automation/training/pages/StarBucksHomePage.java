package com.automation.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StarBucksHomePage extends BasePage {

	Actions mouseOver;
	
	public StarBucksHomePage(WebDriver driver) {
		super(driver);
		driver.get("https://www.starbucks.com/");
	}

	@FindBy(id = "nav")
	private WebElement menuNavegacion;

	public WebElement getTabMenuNavegacion() {
		return menuNavegacion;
	}

	@FindBy(id = "nav_coffee")
	private WebElement tabCoffee;

	public WebElement getTabCoffee() {
		return tabCoffee;
	}

	@FindBy(id = "nav_menudrinkstea")
	private WebElement tabTea;

	public WebElement getTabTea() {
		return tabTea;
	}

	@FindBy(id = "nav_menu")
	private WebElement tabMenu;

	public WebElement getTabMenu() {
		return tabMenu;
	}

	@FindBy(id = "nav_coffeehouse")
	private WebElement tabCoffeeHouse;

	public WebElement getTabCoffeHouse() {
		return tabCoffeeHouse;
	}

	@FindBy(id = "nav_responsibility")
	private WebElement tabResponsibility;

	public WebElement getTabResponsibility() {
		return tabResponsibility;
	}

	@FindBy(id = "nav_starbucks_rewards")
	private WebElement tabRewards;

	public WebElement getTabRewards() {
		return tabRewards;
	}

	@FindBy(id = "nav_blog")
	private WebElement tabBlog;

	public WebElement getTabBlog() {
		return tabBlog;
	}

	@FindBy(id = "nav_gift_cards")
	private WebElement tabGift;

	public WebElement getTabGift() {
		return tabGift;
	}
	
	@FindBy(xpath = "//*[@id=\'menu_coffee\']/div[1]/ol/li[2]/p/a")
	private WebElement findYourPerfectCoffeeButton;

	public WebElement getFindYourPerfectCoffeeButton() {
		return findYourPerfectCoffeeButton;
	}
	
	@FindBy(xpath="//*[@id=\'menu_gift_cards\']/div[1]/ol/li[1]/ol/li[1]/a")
	private WebElement GiftbyEmail;
	
	public WebElement getGiftbyEmail() {
		return GiftbyEmail;
	}

	public StarBucksHomePage buscarNav() {
		getWait().until(ExpectedConditions.visibilityOf(menuNavegacion));
		
		return this;
	}
	
	public FindYourPerfectCoffeePage getFindYourPerfectCoffeePage() {
		
		mouseOver = new Actions(getDriver());
		
		mouseOver.moveToElement(tabCoffee);
		mouseOver.moveToElement(findYourPerfectCoffeeButton);
		mouseOver.click().perform();;
		
		return new FindYourPerfectCoffeePage(getDriver());
		
	}
	
	public GiftCardsPage getGiftCardPage() {
		
		mouseOver = new Actions(getDriver());
		
		mouseOver.moveToElement(tabGift);
		mouseOver.moveToElement(GiftbyEmail);
		mouseOver.click().perform();
		
		return new GiftCardsPage(getDriver());
		
	}

}
