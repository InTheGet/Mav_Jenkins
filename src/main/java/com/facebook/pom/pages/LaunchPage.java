package com.facebook.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.facebook.pom.base.BasePage;

public class LaunchPage extends BasePage {
	//WebDriver driver;
	public LaunchPage(WebDriver driver) {// This driver is the same driver which is intialised in the profile page in test cases 
	//	System.out.println("Here");
	//	driver.get("http://www.google.com");
		//this.driver2 = driver1; // this.driver means global driver = driver is the local driver declared int he constructor 
		//driver2 = driver1;
		//this.driver =driver;
		super(driver);
	}
	
	public LoginPage gotoLoginPage() {
		getDr().get("http://www.google.com");//.get("http://www.google.com");
		return PageFactory.initElements(driver, LoginPage.class);
	}
}
