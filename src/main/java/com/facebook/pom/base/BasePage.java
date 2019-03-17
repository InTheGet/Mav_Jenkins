package com.facebook.pom.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.facebook.pom.pages.LoginPage;
import com.facebook.pom.pages.common.TopMenu;

public class BasePage {
	 
	public BasePage() {}//this is not doing anything but imprortant to call it here
	public WebDriver driver;
	public EventFiringWebDriver dr;
	//public WebDriverWait wait = new WebDriverWait(driver,30);
	public TopMenu menu;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
		setDr(new EventFiringWebDriver(driver));
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
//		driver.manage().window().fullscreen();
//		driver.manage().timeouts().implicitlyWait(30, milliseconds);
		//this.wait = wait;
		 menu = PageFactory.initElements(driver, TopMenu.class);
	}
	
	public WebElement Obj_xpath(String Xpath) {
		try {
		return getDr().findElement(By.xpath("Xpath"));
		}catch (Exception e) {
			
		}
		return null;
	}
	
	public WebElement Obj_id(String ID) {
		return getDr().findElement(By.id("ID"));
		
	}
	
	public WebElement Obj_css(String css) {
		return getDr().findElement(By.cssSelector("css"));
		
	}
	
	public WebElement Obj_tag(String tag) {
		return getDr().findElement(By.cssSelector("tag"));
		
	}
	
	public WebElement Obj_cname(String Cname) {
		return getDr().findElement(By.cssSelector("Cname"));
		
	}
	
	public String VerifyTitle() {
		
		System.out.println();
	return "";
	}
	
public String VerifyText(String locator, String expText) {
	//locator = "Verify it's you";
	
	return "";
	}

public boolean isElementtPresent(String locator) {
	//This function will return if the element is present or not
	return false; 
}


public TopMenu getMenu() {// This is encapsulation we are getting that class istantiated 
	return menu;
}

public EventFiringWebDriver getDr() {
	return dr;
}

public void setDr(EventFiringWebDriver dr) {
	this.dr = dr;
}

}
