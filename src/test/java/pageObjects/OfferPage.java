package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class OfferPage extends BaseClass{

	@FindBy (linkText="Top Deals")
	WebElement topDealsLink;
	
	@FindBy (css="input[type='search']")
	WebElement searchByPro;
	
	public OfferPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void clickTopDealsLink() {
		topDealsLink.click();
	}
	
	public void searchByProductName(String proName) {
	 searchByPro.sendKeys(proName);
	}
	
	public String getTitleOfLandingPage() {
		return getDriver().getTitle();
	}
}
