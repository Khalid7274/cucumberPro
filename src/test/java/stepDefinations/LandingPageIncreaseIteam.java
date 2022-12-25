package stepDefinations;

import io.cucumber.java.en.When;
import pageObjects.LandingPage;

public class LandingPageIncreaseIteam {
	LandingPage landingPage=new LandingPage();
	
	@When("^When_user_searched_with_short_name (.+) and_extracted_actual_name_of_product$")
	public void When_user_searched_with_short_name_and_extracted_actual_name_of_product(String Name) throws InterruptedException {
		landingPage.searPro(Name);
		Thread.sleep(4000);
	}

	@When("added {string} items of the selected product to the cart")
	public void added_3_items_of_the_selected_product_to_the_cart(String quantity) throws InterruptedException {
		landingPage.clickOnIncrementButton(Integer.parseInt(quantity));
		landingPage.clickOnAddToCartButton();
		Thread.sleep(5000);
	}
	

	
}
