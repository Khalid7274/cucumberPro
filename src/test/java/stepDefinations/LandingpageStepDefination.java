package stepDefinations;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;

public class LandingpageStepDefination {
	
	public static String landingPageProductName;
	LandingPage landingPage;
	
	//spring framework, EJB, cucumber picocontainer
	@Given("user is on Greenkart landing page")
	public void user_is_on_greenkart_landing_page() throws IOException {
		//landingPage.getTitleLandingPage();
		
		
	}
	
	@When("^user searched with short name (.+) and extracted actual name of product$")
	public void user_searched_with_short_name_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
		landingPage=new LandingPage();
		landingPage.searPro(shortName);
	    Thread.sleep(3000);
	    landingPageProductName=landingPage.getProText().split("-")[0].trim();
	    
	}
	
}
