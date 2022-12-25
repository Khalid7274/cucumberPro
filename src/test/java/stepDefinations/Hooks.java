package stepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.TestContextsetup;

public class Hooks extends BaseClass{
	TestContextsetup testContextsetup;
	BaseClass bs=new BaseClass();
	
	public Hooks(TestContextsetup testContextsetup) {
		this.testContextsetup= testContextsetup;
	}
	@Before
	public void beforeScenario() throws IOException {
		bs.inicializeDriver();
	}
	
	@After
	public void afterScenario() throws IOException {
		//driver.quit();
		BaseClass.getDriver().quit();
	}
	
	@AfterStep
	public void addScreenShot(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			//take screen shot
			File sourcePath=((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
			byte[] fileContent=FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", "image");
		}
	}
}
