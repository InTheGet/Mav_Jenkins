package com.facebook.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.facebook.pom.base.BasePage;
import com.facebook.pom.pages.session.LandingPage;

public class LoginPage extends BasePage {
	
	//WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		//this.driver=driver;
		super(driver);
	}
	
	//create a findby annotations and intialize all the elements/objects 
	public LandingPage doLogin(String username, String pword) throws InterruptedException {
		dr.findElement(By.xpath(".//*[@id='gb_70']")).click();//click on sign in button
		//dr.findElement((By) Obj_id("gb_70")).click();
		 //WebElement Loggeduser=driver.findElement(By.cssSelector(".Z4o1ee.GyDlGb.cd29Sd.iiFyne"));
		//Assert.assertNull(Loggeduser);
		WebElement userN =driver.findElement(By.cssSelector("#identifierId"));
		userN.clear();
		  userN.sendKeys(username);
		  Obj_id("identifierNext").click();
		 Thread.sleep(3000);
		 WebElement passW= Obj_xpath(".//*[@id='password']/div[1]/div/div[1]/input");
		  //passW.clear();
		  passW.sendKeys(pword);
		  Obj_id("passwordNext").click();
		  Obj_cname("ZFr60d CeoRYc").click();// this is clickinig on done at protest your account screen after password
		  
		    		phone_code("07922569832");
					return null;
	}
	
		public void phone_code(String code) {
			
			String expText = "Verify it's you";
			WebElement phone_verification=  Obj_css("h1[content='Verify it's you']");
			String locator = phone_verification.getText();
			Assert.assertEquals(locator, expText);
			Obj_id("phoneNumberId").sendKeys(code);
	
		}	
			
		
//	if(Loggeduser == null){
//		
//			WebElement userN =driver.findElement(By.tagName("identifier"));
//			userN.clear();
//			  userN.sendKeys("username");
//			  driver.findElement(By.linkText("Next")).click();
//			  WebElement passW= driver.findElement(By.name("password"));
//			  passW.clear();
//			  passW.sendKeys("pword");
//			
//		}
//			
		
		
//		if(user == "pradumanmehta@gmail.com") {
//			driver.findElement(By.cssSelector(".Z4o1ee.GyDlGb.cd29Sd.iiFyne")).click();
//			driver.findElement(By.linkText("Use another account")).click();
//			WebElement userN =driver.findElement(By.tagName("identifier"));
//			userN.clear();
//			  userN.sendKeys("username");
//			  driver.findElement(By.linkText("Next")).click();
//			  WebElement passW= driver.findElement(By.name("password"));
//			  passW.clear();
//			  passW.sendKeys("pword");
			  
			  //there could be occassion when it verify the user by code sent to your phone number
			  // the user is on verification page then enter the phone number and
			  
//		}
	
		public LandingPage LogSucc() { 			
		boolean loginsuccess =true;
		return PageFactory.initElements(driver, LandingPage.class);// this is for the landingpage class, intializing LandingPage class
		}
	

	public void verifyTitle(String expectedTitle) {
		
	}
}

