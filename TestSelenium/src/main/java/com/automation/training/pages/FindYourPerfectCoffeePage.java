package com.automation.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.training.MyDriver;

public class FindYourPerfectCoffeePage extends BasePage{

	Actions mouseOver = new Actions(getDriver());
	
	public FindYourPerfectCoffeePage(WebDriver driver) {
		super(driver);
		driver.get("https://athome.starbucks.com/coffee-finder/");
	}
	
//	FindBy de opcion 1 
	
	@FindBy(xpath="//*[@id=\'question1\']/button[1]")
	private WebElement boton1Q1;
	
	@FindBy(xpath="//*[@id=\'question2\']/button[1]")
	private WebElement boton1Q2;
	
	@FindBy(xpath="//*[@id=\'light-questions\']/button[1]")
	private WebElement boton1Q3;
	
	@FindBy(xpath="//*[@id=\'question4\']/button[1]")
	private WebElement boton1Q4;

//  WebElements de opcion 1
	
	public WebElement boton1Q1() {
		return boton1Q1;
	}
	
	public WebElement boton1Q2() {
		return boton1Q2;
	}
	
	public WebElement boton1Q3() {
		return boton1Q3;
	}
	
	public WebElement boton1Q4() {
		return boton1Q4;
	}
	
	@FindBy(id="find-my-coffee")
	private WebElement botonFindMyCoffee;
	
	@FindBy(id="question1")
	private WebElement preguntas1;
	
	@FindBy(id="question2")
	private WebElement preguntas2;
	
	@FindBy(id="light-questions")
	private WebElement preguntas3;
	
	@FindBy(id="question4")
	private WebElement preguntas4;
	
	@FindBy(id="masthead")
	private WebElement mastHeadPant;
	
	@FindBy(id="results-headline")
	private WebElement cafeSelecciona;
	
	//WebElement cafe seleccionado
	
	public WebElement cafeSelecciona() {
		return cafeSelecciona;
	}
	
	@FindBy(id="back-top")
	private WebElement botonBack;
	
	public WebElement botonBack(){
		return botonBack;
	}
	
	public void selectOptionsQuestion1() throws InterruptedException {
		mouseOver = new Actions(getDriver());
	
		Thread.sleep(5000);
		
		mouseOver.moveToElement(boton1Q1);
		mouseOver.click();

		mouseOver.moveToElement(boton1Q2);
		mouseOver.click();

		mouseOver.moveToElement(boton1Q3);
		mouseOver.click();

		mouseOver.moveToElement(boton1Q4);
		mouseOver.click();
		
		mouseOver.moveToElement(botonFindMyCoffee);
		mouseOver.click();
		
		mouseOver.moveToElement(botonBack);
		mouseOver.click().perform();
		
		Thread.sleep(3000);

		
	}
	
}
