package stepDefinations;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CartPageObject;

public class CartPageStepDefinition {
	CartPageObject CartPageObject=new CartPageObject();
	

	@Then("^user proceeds to checkout and validate the (.+) items in checkout page$")
	public void user_proceeds_to_checkout_and_validate_the_name_carrot_items_in_checkout_page(String name) throws InterruptedException {
		CartPageObject.clickOnProceedToCheckout();
		Thread.sleep(5000);
		Assert.assertEquals(CartPageObject.getProductName(), name);
		
		String expQuantity="3";
		Assert.assertEquals(CartPageObject.getQuantity(), expQuantity);
	}
	
	
	@Then("^verify user has ability to enter promo code and place the order$")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() {
         Assert.assertTrue(CartPageObject.verifyApplyButton());
		 Assert.assertTrue(CartPageObject.verifyPlaceOrderButton());
	}
	
}
