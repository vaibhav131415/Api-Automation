package API.Automation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class FirstScript {
	
	
	@Test(priority = 1)
	public void Statuscheck200() {
		
		
		given().relaxedHTTPSValidation().
		when().get("https://reqres.in/api/users?page=2")
		.then().statusCode(200).
		assertThat().body("data.first_name", hasItems("Michael","Lindsay"))
		.header("CF-Cache-Status", "HIT");
		}
	
	@Test(priority = 2)
	public void statuscheck404() {
		given().relaxedHTTPSValidation().
		when().get("https://reqres.in/api/users/23")
		.then().assertThat().statusCode(404);
		
		
		
		
	}

}
