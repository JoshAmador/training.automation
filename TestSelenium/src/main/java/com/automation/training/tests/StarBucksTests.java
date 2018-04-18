package com.automation.training.tests;

import javax.swing.text.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.training.pages.FindYourPerfectCoffeePage;
import com.automation.training.pages.GiftCardWorkPlacePage;
import com.automation.training.pages.GiftCardsPage;
import com.automation.training.pages.StarBucksHomePage;

import gherkin.lexer.Th;
import junit.framework.Assert;

public class StarBucksTests extends BaseTests {

	// Con data provider
	
	StarBucksHomePage homePage;
	
	@DataProvider(name = "TabData")
	public Object[][] crearTab() {
		StarBucksHomePage homePage = new StarBucksHomePage(myDriver.getDriver());

		return new Object[][] {
			{homePage.getTabCoffee().getText(),"COFFEE"},
			{homePage.getTabTea().getText(),"TEA"},
			{homePage.getTabMenu().getText(),"MENU"},
			{homePage.getTabCoffeHouse().getText(),"COFFEEHOUSE"},
			{homePage.getTabResponsibility().getText(),"SOCIAL IMPACT"},
			{homePage.getTabRewards().getText(),"STARBUCKS REWARDS"},
			{homePage.getTabBlog().getText(),"BLOG"},
			{homePage.getTabGift().getText(),"GIFT CARDS"}
		};
	}
	
//	@Test(dataProvider = "TabData",priority = 1)
	public void testStarBucksHomeDataProvider(String tabSend, String tabExpected) throws InterruptedException {
		StarBucksHomePage starHome = new StarBucksHomePage(myDriver.getDriver());
		starHome.buscarNav();
		Assert.assertEquals(tabSend, tabExpected);
	}
	
	@DataProvider(name = "TabData2")
	public Object [][] crearTab2(){
	
		StarBucksHomePage starHome = new StarBucksHomePage(myDriver.getDriver());
		FindYourPerfectCoffeePage findYourPerfectCoffeePage = starHome.getFindYourPerfectCoffeePage();
		
		return new Object [][] {
			{findYourPerfectCoffeePage.getBoton1Q1() , findYourPerfectCoffeePage.getBoton1Q2() , findYourPerfectCoffeePage.getBoton1Q3() , findYourPerfectCoffeePage.getBoton1Q4()},
			{findYourPerfectCoffeePage.getBoton2Q1() , findYourPerfectCoffeePage.getBoton2Q2() , findYourPerfectCoffeePage.getBoton2Q3() , findYourPerfectCoffeePage.getBoton2Q4()},
			{findYourPerfectCoffeePage.getBoton3Q1() , findYourPerfectCoffeePage.getBoton3Q2() , findYourPerfectCoffeePage.getBoton3Q3() , findYourPerfectCoffeePage.getBoton3Q4()},
		};
	}
	
	@Test(dataProvider = "TabData2" , priority = 2)
	public void test2(WebElement boton1 , WebElement boton2 , WebElement boton3 , WebElement boton4) throws InterruptedException {
		
		StarBucksHomePage starHome = new StarBucksHomePage(myDriver.getDriver());
		
		starHome.getFindYourPerfectCoffeePage()
		.clickBotones(boton1, boton2, boton3, boton4)
		.searchCoffee()
		.regresarCafe();
	}
	

//	@Test(priority = 3)
	public void test3() {
	
		StarBucksHomePage starHome = new StarBucksHomePage(myDriver.getDriver());
		
		starHome.buscarNav()
		.getGiftCardPage()
		.clickCard()
		.fillDataCard()
		.fillDataInfoPurchaser()
		.fillDate();
	
	}

}