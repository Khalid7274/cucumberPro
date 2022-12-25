package utils;

import org.openqa.selenium.WebDriver;

import base.BaseClass;

public class TestContextsetup {

	public  WebDriver driver;
	public  static String landingPageProductName;
	public BaseClass baseclass;
	
	
	public TestContextsetup() {
		baseclass=new BaseClass(); 
	}

}
