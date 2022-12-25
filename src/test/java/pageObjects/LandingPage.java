package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LandingPage extends BaseClass{

	@FindBy (css="input[class='search-keyword']")
	WebElement proname;
	
	@FindBy (css="h4[class='product-name']")
	WebElement actualText;
	
	@FindBy (css="a.increment")
	WebElement clickOnIncreementBtn;
	
	@FindBy (xpath="(//div[@class='product-action']/button)[1]")
	WebElement addToCartButton;
	

	
	public LandingPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	public void searPro(String pname) {
		 proname.sendKeys(pname);
	}
	
	public String getProText() {
		return actualText.getText();
	}
	
	public void clickOnIncrementButton(int quantity) {
		    int i=quantity-1;
		    while(i>0) {
		    	clickOnIncreementBtn.click();
		    	i--;
		    }	
		
	}
	
	public CartPageObject clickOnAddToCartButton() {
		addToCartButton.click();
		return new CartPageObject();
	}
	
	
	public String getTitleLandingPage() {
		return getDriver().getTitle();
	}

}
