package com.automation.training.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.training.pages.StarBucksHomePage;

import junit.framework.Assert;

public class StarBucksTests extends BaseTests {

	// Con data provider

	@DataProvider(name = "TabData")
	public Object[][] crearTab() {

		return new Object[][] {
			{new String("COFFEE"),"COFFEE"},
			{new String("TEA"),"TEA"},
			{new String("MENU"),"MENU"},
			{new String("COFFEEHOUSE"),"COFFEEHOUSE"},
			{new String("SOCIAL IMPACT"),"SOCIAL IMPACT"},
			{new String("STARBUCKS REWARDS"),"STARBUCKS REWARDS"},
			{new String("BLOG"),"BLOG"},
			{new String("GIFT CARDS"),"GIFT CARDS"}
		};
	}
	
	@Test(dataProvider = "TabData",groups = {"grupoConDataProvider"})
	public void testStarBucksHomeDataProvider(String tabSend, String tabExpected) {
		StarBucksHomePage starHome = getStarBucksHomePage();
		starHome.buscarNav(tabSend);
		
		Assert.assertEquals(tabSend, tabExpected);
	}

	@Parameters({ "elementoCoffee", "elementoTea", "elementoMenu", "elementoCoffeeHouse", "elementoSocialImpact",
			"elementoStarBucksRewards", "elementoBlog", "elementoGiftCards" })
//	@Test
	public void testStarBucksHome(String cafe, String tea, String menu, String casaCafe, String impactoSocial,
			String rewards, String blog, String tarjetasRegalo) {
		StarBucksHomePage starHome = getStarBucksHomePage();
		Assert.assertEquals(cafe, "COFFEE");
		Assert.assertEquals(tea, "TEA");
		Assert.assertEquals(menu, "MENU");
		Assert.assertEquals(casaCafe, "COFFEEHOUSE");
		Assert.assertEquals(impactoSocial, "SOCIAL IMPACT");
		Assert.assertEquals(rewards, "STARBUCKS REWARDS");
		Assert.assertEquals(blog, "BLOG");
		Assert.assertEquals(tarjetasRegalo, "GIFT CARDS");
	}

}
