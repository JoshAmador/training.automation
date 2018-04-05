package TaeAutomation.AssuredTraining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssuredTest {
	
	String postResource = "https://jsonplaceholder.typicode.com/posts";
	String postComments = "https://jsonplaceholder.typicode.com/comments";
	String postAlbums = "https://jsonplaceholder.typicode.com/posts";
	String postPhotos = "https://jsonplaceholder.typicode.com/posts";
	String postTodos = "https://jsonplaceholder.typicode.com/posts";
	String postUsers = "https://jsonplaceholder.typicode.com/users";

	// Punto 1 peticion de los resources y verificacion del statusCode 200

	@Test
	public void testPosts() {

		Response response = RestAssured.given().get(postResource);

		response.then().assertThat().statusCode(200).log().body();
	}

	 @Test
	public void testComments() {

		Response response = RestAssured.given().get(postComments);

		response.then().assertThat().statusCode(200).log().body();

	}

	 @Test
	public void testAlbums() {

		Response response = RestAssured.given().get(postAlbums);

		response.then().assertThat().statusCode(200).log().body();

	}

	 @Test
	public void testPhotos() {

		Response response = RestAssured.given().get(postPhotos);

		response.then().assertThat().statusCode(200).log().body();

	}

	 @Test
	public void testTodos() {

		Response response = RestAssured.given().get(postTodos);

		response.then().assertThat().statusCode(200).log().body();

	}

	 @Test
	public void testUsers() {

		Response response = RestAssured.given().get(postUsers);

		response.then().assertThat().statusCode(200).log().body();

	}

}
