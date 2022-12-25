package base;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;

import files.PayLoad;
import files.ReUseableMethods;

public class Assignment2 {

	public static void main(String[] args) throws IOException {
		
		
		//RestAssured.baseURI="";
		
		//Content of the file to String -> content of file can convert into byte-> Byte data to string 
		String response=given().log().all().header("Content-Type","application/json")
		.body(PayLoad.addPlace())	
		.when().post("https://6143a99bc5b553001717d06a.mockapi.io/testapi/v1//Users")
		.then().assertThat().statusCode(200).body("employee_firstname", equalTo("TestData12345"))
		.extract().response().asString();
			
	    JsonPath js=new JsonPath(response);  //for parsing JSON
		String createdAt=js.getString("1631825833");
		
		//Get place
		ValidatableResponse getPlaceResponse=given().log().all()
		.queryParam("1631825833", createdAt)
		.when().get("https://6143a99bc5b553001717d06a.mockapi.io/testapi/v1//Users")
		.then().log().all().assertThat().statusCode(200).body("employee_firstname", equalTo("TestData12345"),
		"employee_phonenumbe", equalTo("264-783-9453"), "ademployee_emaildress", equalTo("ademployee_emaildress 1"),
		"citemployee_addressy", equalTo("citemployee_addressy 1"),"stateemployee_dev_level", equalTo("stateemployee_dev_level 1")
		,"employee_gender", equalTo("employee_gender 1"), "employee_hire_date", equalTo("2025-10-31T16:35:45.426Z"));
		
	}

}
