package com.automation.training;

import org.junit.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AnnotationTestsGoodCode {

	@Parameters({"stringA","stringB"})
	@Test
	public void testConcactBueno(String a, String b) {
		String resultado = a + b;
		Assert.assertEquals(resultado, "I love test automation");
		
	}
	
}
