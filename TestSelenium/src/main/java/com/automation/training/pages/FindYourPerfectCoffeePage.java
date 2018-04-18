package com.automation.training.pages;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.training.MyDriver;

public class FindYourPerfectCoffeePage extends BasePage{

	FindYourPerfectCoffeePage findYourPerfectCoffeePage;
	
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
	
	public WebElement getBoton1Q1() {
		return boton1Q1;
	}
	
	public WebElement getBoton1Q2() {
		return boton1Q2;
	}
	
	public WebElement getBoton1Q3() {
		return boton1Q3;
	}
	
	public WebElement getBoton1Q4() {
		return boton1Q4;
	}
	
//	FindBy de opcion 2 
	
	@FindBy(xpath="//*[@id='question1']/button[2]")
	private WebElement boton2Q1;
	
	@FindBy(xpath="//*[@id='question2']/button[2]")
	private WebElement boton2Q2;
	
	@FindBy(xpath="//*[@id=\"medium-questions\"]/button[2]")
	private WebElement boton2Q3;
	
	@FindBy(xpath="//*[@id='question4']/button[2]")
	private WebElement boton2Q4;
	
//	WebElements de opcion 2 
	
	public WebElement getBoton2Q1() {
		return boton2Q1;
	}
	
	public WebElement getBoton2Q2() {
		return boton2Q2;
	}
	
	public WebElement getBoton2Q3() {
		return boton2Q3;
	}
	
	public WebElement getBoton2Q4() {
		return boton2Q4;
	}
	
//	FindBy de opcion 3 
	
	@FindBy(xpath="//*[@id='question1']/button[3]")
	private WebElement boton3Q1;
	
	@FindBy(xpath="//*[@id='question2']/button[3]")
	private WebElement boton3Q2;
	
	@FindBy(xpath="//*[@id=\'dark-questions\']/button[3]")
	private WebElement boton3Q3;
	
	@FindBy(xpath="//*[@id='question4']/button[3]")
	private WebElement boton3Q4;
	
//	WebElements de opcion 3 
	
	public WebElement getBoton3Q1() {
		return boton3Q1;
	}
	
	public WebElement getBoton3Q2() {
		return boton3Q2;
	}
	
	public WebElement getBoton3Q3() {
		return boton3Q3;
	}
	
	public WebElement getBoton3Q4() {
		return boton3Q4;
	}
	
	//WebElement cafe seleccionado
	
	@FindBy(id="find-my-coffee")
	private WebElement botonFindMyCoffee;
	
	@FindBy(id="back-top")
	private WebElement botonBack;
	
	public WebElement botonBack(){
		return botonBack;
	}
	
	//WebElement cafe sugerido
	
	@FindBy(id="results-headline")
	private WebElement cafeSugerido;
	
	public WebElement getCafeSugerido() {
		return cafeSugerido;
	}
	
	public void selectOptionsQuestions() throws InterruptedException {
		mouseOver = new Actions(getDriver());
			
		mouseOver.moveToElement(boton3Q1);
		mouseOver.click();

		mouseOver.moveToElement(boton3Q2);
		mouseOver.click();

		mouseOver.moveToElement(boton3Q3);
		mouseOver.click();

		mouseOver.moveToElement(boton3Q4);
		mouseOver.click();
		
		mouseOver.perform();

	}
	
	public FindYourPerfectCoffeePage searchCoffee() throws InterruptedException {
		Thread.sleep(5000);
		mouseOver.moveToElement(botonFindMyCoffee);
		mouseOver.click();
		mouseOver.perform();
		
		return this;
	}
		
	public FindYourPerfectCoffeePage clickBotones(WebElement boton1, WebElement boton2, WebElement boton3, WebElement boton4) {
		
		mouseOver.moveToElement(boton1);
		mouseOver.click(boton1);
		
		mouseOver.moveToElement(boton2);
		mouseOver.click(boton2);
		
		mouseOver.moveToElement(boton3);
		mouseOver.click(boton3);
		
		mouseOver.moveToElement(boton4);
		mouseOver.click(boton4);
		
		return this;
	}
	
	public FindYourPerfectCoffeePage regresarCafe() throws InterruptedException {
		Thread.sleep(5000);
		mouseOver.moveToElement(botonBack);
		mouseOver.click();
		mouseOver.perform();
		
		return this;
	}
	
}
