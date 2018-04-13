package TaeAutomation.AssuredTraining;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import org.testng.annotations.Test;

public class EjerciciosAssured {

//	Prueba para Jsons
	
//	@Test 
	public void testStatusCode() {
		given().get("https://jsonplaceholder.typicode.com/posts/3").then().statusCode(200);
		
	}
	
//	@Test
	public void testLogging() {
		given().get("http://services.groupkt.com/country/get/iso2code/in").then().statusCode(200).log().all();
	}
	
//	@Test 
	public void testEqualToFunction() {
		given().get("http://services.groupkt.com/country/get/all").then().body("RestResponse.result.name",hasItems("Afghanistan","Argentina","Australia")).log().body();
	}
		
	
//	Prueba para XML
	
//	@Test
	public void testSingleContent() {
		given().
		get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/10/").
		then().
		body("CUSTOMER.ID", equalTo("10")).
		log().all();
	}
	
//	Prueba 1 de lo que nos pidieron
	
	@Test
	public void testPost1() {
//		given().get("https://jsonplaceholder.typicode.com/posts/3").then().statusCode(200);
		
		given().get("https://jsonplaceholder.typicode.com/posts/1").then().statusCode(200).log().all();
		
		
	}
	
}
