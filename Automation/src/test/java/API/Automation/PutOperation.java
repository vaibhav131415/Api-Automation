package API.Automation;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commonPackage.RestUtils;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;


public class PutOperation {
	
	
	public static HashMap map = new HashMap(); 
	
	@BeforeClass
	public void postdata() {
		map.put("name", RestUtils.personName());
		
		map.put("job", RestUtils.jobName());
		
		RestAssured.baseURI = "https://reqres.in/api";
		RestAssured.basePath = "/users";
		
	}
	
	
	@Test
public void postRequest() {
		
	given()
	  .relaxedHTTPSValidation()
	  .contentType("application/json")
	  .body(map)
	  
	.when()
	  .post()
	  
	.then()
	  .assertThat().statusCode(201);
	
		
	}


}
