package com.automation.training;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AnnotationTests {
	
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("Before Method");	
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Antes del test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Despues del test");
	}
	
	@Test
	public void testConcact() {
		String a = "I love ";
		String b = "test automation";
		String resultado = a + b;
		Assert.assertEquals(resultado, "I love test automation");
		System.out.println(resultado);
	}
	
	@Test(groups = {"grupo1"})
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(groups = {"grupo2"})
	public void test2() {
		System.out.println("Test 2");
	}
	@Test(groups = {"grupo3"})
	public void test3() {
		System.out.println("Test 3");
	}
	@Test(groups = {"grupo4"})
	public void test4() {
		System.out.println("Test 4");
	}
}