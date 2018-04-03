package com.automation.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver {

	private WebDriver driver;

	public MyDriver(String browser) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\joshua.amador\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public WebDriver getDriver() {
		return this.driver;
	}
}
