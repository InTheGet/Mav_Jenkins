import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Reg_Base {

	public static Properties Prop = null;
	public static Properties config = null;
	public static WebDriver driver =null;
	public static EventFiringWebDriver dr;
	
	
	
	public static  void intia() throws IOException {
		
		if(driver == null) {
		 Prop = new Properties();
		 config = new Properties();
		 
		 FileInputStream fn = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\prop.properties");
		
		 Prop.load(fn);

		 fn = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\Conifg.Properties");
			//properties.load(new FileInputStream("C:\\Users\\aonwuyal\\Documents\\Java Framework\\src\\main\\resources\\UIConfigurationSettings.properties"));
			config.load(fn);
		
		
		
			config.getProperty("cbro").equals("chrome");
		
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(config.getProperty("google_Home"));
			
			
			//driver.get("https://www.google.com"); 
			 /*else if (Prop.getProperty("browserF").equals("FF")) {

			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/Drivers/geckodriver");

			driver = new FirefoxDriver();
			}*/

			}		
		dr = new EventFiringWebDriver(driver); 
		dr.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	

		//CONFIG.getProperty("chromedriver");
//		System.setProperty("webdriver.chrome.driver", "//Driver//chromedriver.exe");
//		driver = new ChromeDriver();
		 	
		
	public static WebElement obj_xpath(String xpath) {
		return dr.findElement(By.xpath(Prop.getProperty("xpath")));
		
	}
	public static WebElement obj_id(String id) {
		return dr.findElement(By.id(Prop.getProperty("id")));
		
	}public static WebElement obj_Name(String Name) {
		try {
		return dr.findElement(By.name(Prop.getProperty("Name")));
		}catch(Exception e){
			
		}
		return null;
	}
	
	
}



