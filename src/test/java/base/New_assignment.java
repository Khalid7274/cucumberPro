package base;

import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import groovy.util.Proxy;
import io.github.bonigarcia.wdm.WebDriverManager;

public class New_assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		
		String searchCareer="QA Test Automation Developer";
		
		//open labcorp
		driver.get("https://www.labcorp.com");
		driver.findElement(By.linkText("Careers")).click();
		
		Set<String> window=driver.getWindowHandles();
	    Iterator<String> child=window.iterator();
	    String parentWindow=child.next();
	    String childWindow=child.next();
	    driver.switchTo().window(childWindow);
	    
		driver.findElement(By.xpath("(//input[@id='typehead'])[1]")).sendKeys(searchCareer,Keys.chord(Keys.ENTER));
		
		//Explicit wait until the element appears
		WebDriverWait wait1=new WebDriverWait(driver, 5);
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[@data-ph-id='ph-page-element-page11-Zk12Zp'])[1]")));
		
		WebElement position=driver.findElement(By.xpath("(//span[@data-ph-id='ph-page-element-page11-Zk12Zp'])[1]"));
		String jobTitle=position.getText();
		String jobLocation=driver.findElement(By.xpath("(//span[@data-ph-id='ph-page-element-page11-uwAgUi'])[1]")).getText();
		String jobId=driver.findElement(By.xpath("(//span[@data-ph-id='ph-page-element-page11-jEtckv'])[1]")).getText();
		//System.out.println(searchResult);
		
		//Assertion
		Assert.assertTrue(jobTitle.contains("QA Test Automation Developer"));
		Assert.assertTrue(jobLocation.contains("Durham, North Carolina, United States of America"));
		Assert.assertTrue(jobId.contains("21-90223_RM"));

		position.click();
		//Three more Assertion
		String Introduction=driver.findElement(By.xpath("//div[@data-ph-id='ph-page-element-page4-zlsOvX']")).getText();
		Assert.assertTrue(Introduction.contains("The right candidate for this role will participate in the test automation technology development and best practice models."));
		
		//Confirm second bullet point under Management Support 
		String expectedResult="Prepare test plans, budgets, and schedules.";
		String confirmSecondBullet=driver.findElement(By.xpath("//p[contains(text(),'Prepare test plans, budgets, and schedules.')]")).getText();
		Assert.assertEquals(confirmSecondBullet, expectedResult);
		
		//Confirm third requirement  
		String expectedRequirment="5+ years of experience in QA automation development and scripting.";
		String confirmRequirement=driver.findElement(By.xpath("//p[contains(text(),'5+ years of experience in QA automation development and scripting.')]")).getText();
		Assert.assertEquals(confirmRequirement, expectedRequirment);
		
		String expectedAutomationTools="Selenium";
		String confirmAutomationTools=driver.findElement(By.xpath("(//p[contains(text(),'Selenium')])[2]")).getText().split(":")[1].split(",")[0].trim();
		Assert.assertEquals(confirmAutomationTools, expectedAutomationTools);
		
		driver.findElement(By.xpath("//div[@class='Sub-Actions']/a[@ph-tevent='apply_click']")).click();
		
		Set<String> jobwindow=driver.getWindowHandles();
	    Iterator<String> jobwindowchild=jobwindow.iterator();
	    String jobparent=jobwindowchild.next();
	    String jobchild=jobwindowchild.next();
	    String jobchild3=jobwindowchild.next();
	    driver.switchTo().window(jobchild3);
	
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(30))
		        .pollingEvery(Duration.ofSeconds(5))
		        .ignoring(NoSuchElementException.class);

		    WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		      public WebElement apply(WebDriver driver) {
		        if(driver.findElement(By.xpath("//div[@class='css-1s1r74k']/button[@class='css-1ko66zc']")).isDisplayed()) {
		        	 return driver.findElement(By.xpath("//div[@class='css-1s1r74k']/button[@class='css-1ko66zc']"));
		        }else
		        	return null;
		      }
		    });
	    driver.findElement(By.xpath("//input[@data-automation-id='email']")).sendKeys("azizurahmanniazai@gmail.com");
	    driver.findElement(By.xpath("//input[@data-automation-id='password']")).sendKeys("Romaan123!@#");
	    
		    
	    driver.findElement(By.cssSelector("div[aria-label='Sign In']")).click();
	    
	    String expectedJobTitle="QA Test Automation Developer";
	    String actualJobTitle=driver.findElement(By.xpath("//h3[@class='css-18mbozw']")).getText();
	    Assert.assertEquals(actualJobTitle, expectedJobTitle);
	    
	    driver.switchTo().window(jobchild);
	 
		driver.quit();
	}

	

}
