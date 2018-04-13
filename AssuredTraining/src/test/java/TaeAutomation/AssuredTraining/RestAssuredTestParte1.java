package TaeAutomation.AssuredTraining;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class RestAssuredTestParte1 {
	
	String postResource = "https://jsonplaceholder.typicode.com/posts";
	String postComments = "https://jsonplaceholder.typicode.com/comments";
	String postAlbums = "https://jsonplaceholder.typicode.com/posts";
	String postPhotos = "https://jsonplaceholder.typicode.com/posts";
	String postTodos = "https://jsonplaceholder.typicode.com/posts";
	String postUsers = "https://jsonplaceholder.typicode.com/users";

	// Punto 1 peticion de los resources y verificacion del statusCode 200

	@DataProvider(name="RestAssuredResources")
	public Object [][] createDataResources(){
		return new Object[][] {
			{"https://jsonplaceholder.typicode.com/posts"},
			{"https://jsonplaceholder.typicode.com/comments"},
			{"https://jsonplaceholder.typicode.com/albums"},
			{"https://jsonplaceholder.typicode.com/photos"},
			{"https://jsonplaceholder.typicode.com/todos"},
			{"https://jsonplaceholder.typicode.com/users"},
		};
	}
	
	@Test(dataProvider = "RestAssuredResources")
	public void testResources(String resources) {
		Response response = RestAssured.given().get(resources);
		response.then().assertThat().statusCode(200).log().body();
		
		Assert.assertEquals(200, response.statusCode());
	}
	

}
