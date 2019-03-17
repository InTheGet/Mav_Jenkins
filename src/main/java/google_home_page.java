

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



public class google_home_page extends Reg_Base  {
	
		@Test
		public static void Launch() throws IOException, InterruptedException {
		
			 intia();
			//dr.get(config.getProperty("google_Home"));
			//obj_id(Prop.getProperty("Goo_Search_name")).sendKeys("selenium");
			//Prop.getProperty("Goo_Search_name").sendKeys(Keys.ENTER);
			String Home_Title = "Google";
			String Real_Time_Title= driver.getTitle();
			System.out.println(Real_Time_Title);
			//if(Home_Title==Real_Time_Title){			
				System.out.println("in if statment");
			//WebElement ee=	dr.findElement(By.linkText("About"));
			//ee.click();
			//Thread.sleep(300);
				//System.out.println(ee);
				//dr.findElement(By.name("q")).sendKeys("selenium");
				obj_Name("q").sendKeys("selenium");
				//Prop.getProperty(key)
				//obj_id.sendKeys(Keys.ENTER);
				
			//}
		}
		@AfterTest

		public void shut() {
		dr.close();	
		}
}