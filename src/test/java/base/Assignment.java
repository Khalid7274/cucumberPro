package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static Properties prop;
	public static ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver() {
		return driver.get();
	}
	
	public void inicializeDriver() throws IOException {
		
		prop = new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\configuration\\config.properties");
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		 if(browserName.equalsIgnoreCase("Chrome")) {
			 WebDriverManager.chromedriver().setup();
			 driver.set(new ChromeDriver());
			 System.out.println(prop.getProperty("browser"));
		 }else if(browserName.equalsIgnoreCase("edge")) {
			 WebDriverManager.edgedriver().setup();
			 driver.set(new EdgeDriver());
		 }
		 
		 
		 getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 getDriver().manage().window().maximize();
		 getDriver().get(prop.getProperty("url"));
		
	}
}
