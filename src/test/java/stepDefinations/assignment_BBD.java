package stepDefinations;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;

import files.PayLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;

public class assignment_BBD {
	
	String response;
	
	@Given("^user is on LabCorp landing page$")
	public void user_is_on_greenkart_landing_page() throws IOException {
		//landingPage.getTitleLandingPage();
		//RestAssured.baseURI="";
	}

	@When("^user enters the emplyee payload$")
	 public void user_enters_the_emplyee_payload() throws Throwable  {
		response=given().log().all().header("Content-Type","application/json")
		.body(PayLoad.addPlace())	
		.when().post("https://6143a99bc5b553001717d06a.mockapi.io/testapi/v1//Users")
		.then().assertThat().statusCode(200).body("employee_firstname", equalTo("TestData12345"))
		.extract().response().asString();
	}
	
	   JsonPath js=new JsonPath(response);  //for parsing JSON
	   String createdAt=js.getString("1631825833");
	 
	 //Get Call
	  @Then("^user to validate the employee first name$")
	    public void user_to_validate_the_employee_first_name() throws Throwable {
		  ValidatableResponse getPlaceResponse=given().log().all()
		 .queryParam("1631825833", createdAt)
		 .when().get("https://6143a99bc5b553001717d06a.mockapi.io/testapi/v1//Users")
		 .then().log().all().assertThat().statusCode(200).body("employee_firstname", equalTo("TestData12345"),
		"employee_phonenumbe", equalTo("264-783-9453"), "ademployee_emaildress", equalTo("ademployee_emaildress 1"),
		"citemployee_addressy", equalTo("citemployee_addressy 1"),"stateemployee_dev_level", equalTo("stateemployee_dev_level 1")
		,"employee_gender", equalTo("employee_gender 1"), "employee_hire_date", equalTo("2025-10-31T16:35:45.426Z"));
					
		}
	    
	
}
