package com.techproed2.javaapi01;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetRequest01 {

	
	@Test
	public void get01() {
		//set url
		String url="https://restful-booker.herokuapp.com/booking/3";
		//set accepted data and send request api
		Response res = given().accept("application/json").when().get(url);
		res.prettyPrint();
		
		//assertion
		
		res.then().assertThat().statusCode(200).contentType(ContentType.JSON)
		.and().statusLine("HTTP/1.1 200 OK");
		
		
		
		//print status
		System.out.println("============");
		System.out.println("============");
		System.out.println("status code:" + res.getStatusCode());
		System.out.println("============");
		System.out.println("COntent type"+res.getContentType());
		System.out.println("============");
		System.out.println("status line: "+res.getStatusLine());
		System.out.println("============");
		System.out.println("headers: "+res.getHeaders());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
