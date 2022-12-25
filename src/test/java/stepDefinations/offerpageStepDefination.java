package stepDefinations;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.OfferPage;
import utils.CommonUtils;

public class offerpageStepDefination extends BaseClass{
	
	public String offerPageProductName;
	OfferPage offerpage=new OfferPage();
	
//	public void user_is_on_greenkart_landing_page() throws IOException {
//		//bs.inicializeDriver();
//		
//	}
	

	@Then("^user searched with for (.+) short name in offers page$")
	public void user_searched_with_for_short_name_in_offers_page(String shortName) {
		offerpage.clickTopDealsLink();
		CommonUtils.switchWindow();
	    //driver.findElement(By.cssSelector("input[type='search']")).sendKeys(shortName);
		offerpage.searchByProductName(shortName);
	    offerPageProductName=getDriver().findElement(By.xpath("//tbody/tr/td[1]")).getText();
	  
	}

	
	@Then("validate product name in offer page matches with landing page")
	public void validate_product_name_in_offer_page_matches_with_landing_page() {
	   Assert.assertEquals(LandingpageStepDefination.landingPageProductName, offerPageProductName);
	   
	}
	
	
}
