package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static Properties prop;
	public static ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver() {
		return driver.get();
	}
	
	public void inicializeDriver() throws IOException {
		
		prop = new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\configuration\\config.properties");
		prop.load(fis);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized"); // open Browser in maximized mode
		options.addArguments("disable-infobars"); // disabling infobars
		options.addArguments("--disable-extensions"); // disabling extensions
		options.addArguments("--disable-gpu"); // applicable to windows os only
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		options.addArguments("--no-sandbox"); // Bypass OS security model
		
		String browser_properties=prop.getProperty("browser");
		String browser_maven=System.getProperty("browser");
		//result = testCondition ? value1 : value2:
		String browser = browser_maven!=null ? browser_maven : browser_properties;
		
		 if(browser.equalsIgnoreCase("Chrome")) {
			 WebDriverManager.chromedriver().setup();
			 driver.set(new ChromeDriver(options));
			 System.out.println(prop.getProperty("browser"));
		 }else if(browser.equalsIgnoreCase("edge")) {
			 WebDriverManager.edgedriver().setup();
			 driver.set(new EdgeDriver(options));
		 }
		 
		 
		 getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 getDriver().manage().window().maximize();
		 getDriver().get(prop.getProperty("url"));
		//return driver;
	}
}
