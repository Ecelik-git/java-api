package com.techproed2.javaapi01;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class GetRequest04{
	
//  I send a GET request to REST API URL             https://jsonplaceholder.typicode.com/todos/23  
//And Accept type is “application/JSON”
//Then
//HTTP Status Code should be 200
//And Response format should be "application/JSON"
//And "title" is "et itaque necessitatibus maxime molestiae qui quas velit",
//And "completed" is false
//And "userId" is 2
	
	@Test
	public void get03() {
		//set url
		String url="http://dummy.restapiexample.com/api/v1/employees";
		//accept data and send url
		
		Response res = given().accept(ContentType.JSON).when().get(url);
		res.prettyPrint();
		
		//make assertion
		res.then().assertThat().statusCode(200)
		.contentType(ContentType.JSON)
		.body("date.id", Matchers.hasSize(24),
		"data.employee_name", Matchers.hasItem("Ashton Cox"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

