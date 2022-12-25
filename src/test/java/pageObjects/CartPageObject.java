package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class CartPageObject extends BaseClass{

	@FindBy (xpath="//tbody/tr/td[2]/p[@class='product-name']")
	WebElement productName;
	
	@FindBy (xpath="//tbody/tr/td[3]/p[@class='quantity']")
	WebElement quantity;
	
	@FindBy (xpath="//a[@class='cart-icon']/img")
	WebElement clickOnCartIcon;
	
	@FindBy (xpath="(//div[@class='action-block']/button)[1]")
	WebElement proceedToCheckoutBtn;
	
	@FindBy (xpath="//div[@class='promoWrapper']/button")
	WebElement applyButton;
	
	@FindBy (xpath="//div[@class='promoWrapper']/button")
	WebElement placeOrderButton;
	
	
	public CartPageObject() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public String getProductName() {
		return productName.getText();
	}
	
	public String getQuantity() {
		return quantity.getText();
	}
	
	public void clickOnProceedToCheckout() {
		clickOnCartIcon.click();
		proceedToCheckoutBtn.click();
		
	}
	
	public boolean verifyApplyButton() {
		return applyButton.isDisplayed();
	}
	
	public boolean verifyPlaceOrderButton() {
		return placeOrderButton.isDisplayed();
	}
	
	
	
}
