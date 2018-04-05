package TaeAutomation.AssuredTraining;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

import java.nio.file.Paths;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssuredTest2 {
	
	@DataProvider(name = "DataProviderSchemas")
	public Object[][] createSchemaValidationData() {
	return new Object[][] {
	{"https://jsonplaceholder.typicode.com/posts", "resources/SchemaPosts.json"},
	{"https://jsonplaceholder.typicode.com/comments", "resources/SchemaComments.json"},
	{"https://jsonplaceholder.typicode.com/albums", "resources/SchemaAlbums.json"},
	{"https://jsonplaceholder.typicode.com/photos", "resources/SchemaPhotos.json"},
	{"https://jsonplaceholder.typicode.com/todos", "resources/SchemaTodos.json"},
	{"https://jsonplaceholder.typicode.com/users", "resources/SchemaUsers.json"},
	};
	}

	@Test(dataProvider = "DataProviderSchemas")
	public void testJsonResponseValidationPosts(String resourceName, String resourcePath) {

		
		Response response = RestAssured.given().get(resourceName);
		response.then().body(matchesJsonSchema(Paths.get(resourcePath).toUri())).log().body();

	}
}
