package TaeAutomation.AssuredTraining;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import java.nio.file.Paths;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class RestAssuredTestParte2 {

	@DataProvider(name = "DataProviderFilterSchemas")
	public Object[][] createSchemaValidationData() {
		return new Object[][] { { "https://jsonplaceholder.typicode.com/posts", "resources/SchemaPosts.json" },
				{ "https://jsonplaceholder.typicode.com/comments", "resources/SchemaComments.json" },
				{ "https://jsonplaceholder.typicode.com/albums", "resources/SchemaAlbums.json" },
				{ "https://jsonplaceholder.typicode.com/photos", "resources/SchemaPhotos.json" },
				{ "https://jsonplaceholder.typicode.com/todos", "resources/SchemaTodos.json" },
				{ "https://jsonplaceholder.typicode.com/users", "resources/SchemaUsers.json" }, };
	}

	 @Test(dataProvider = "DataProviderFilterSchemas")
	public void testJsonResponseValidationPosts(String resourceName, String resourcePath) {

		Response response = RestAssured.given().get(resourceName);
		response.then().body(matchesJsonSchema(Paths.get(resourcePath).toUri())).log().body();

	}

	@DataProvider(name = "DataProviderFilterItems")
	public Object[][] createDataItems() {
		return new Object[][] { { "20", 20, 2, "doloribus ad provident suscipit at",
				"qui consequuntur ducimus possimus quisquam amet similique\nsuscipit porro ipsam amet\neos veritatis officiis exercitationem vel fugit aut necessitatibus totam\nomnis rerum consequatur expedita quidem cumque explicabo" },
				{ "50", 50, 5, "repellendus qui recusandae incidunt voluptates tenetur qui omnis exercitationem",
						"error suscipit maxime adipisci consequuntur recusandae\nvoluptas eligendi et est et voluptates\nquia distinctio ab amet quaerat molestiae et vitae\nadipisci impedit sequi nesciunt quis consectetur" },
				{ "100", 100, 10, "at nam consequatur ea labore ea harum",
						"cupiditate quo est a modi nesciunt soluta\nipsa voluptas error itaque dicta in\nautem qui minus magnam et distinctio eum\naccusamus ratione error aut" }, };
	}

	 @Test(dataProvider = "DataProviderFilterItems")
	public void testJsonResponseCompare(String resourceName, int paramName, int paramValue, String fieldName,
			String expectedValue) {

		Response response = RestAssured.given().baseUri("http://jsonplaceholder.typicode.com")
				.pathParam("id", resourceName).when().get("posts/{id}");
		response.then().log().all();

		JsonPath jsonPath = response.jsonPath();

		Assert.assertEquals(jsonPath.getInt("id"), paramName);
		Assert.assertEquals(jsonPath.getInt("userId"), paramValue);
		Assert.assertEquals(jsonPath.getString("title"), fieldName);
		Assert.assertEquals(jsonPath.getString("body"), expectedValue);

	}

	@DataProvider(name = "DataProviderFilterParams")
	public Object[][] createDataParamsItems() {
		return new Object[][] { { "https://jsonplaceholder.typicode.com/comments?postId" },
				{ "https://jsonplaceholder.typicode.com/posts?userId" }, };
	}

	@Test(dataProvider = "DataProviderFilterParams")
	public void testParamsPosts(String resourceName) {
		
		RestAssured.given().params("postId", 1).params("userId", 1).when()
				.get(resourceName).then().log().all();
		System.out.println("Output:" + resourceName);
		
		Assert.assertNotNull(resourceName);

	}

}
