package com.facebook.pom.pages.session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.facebook.pom.pages.LaunchPage;
import com.facebook.pom.pages.LoginPage;
import com.facebook.pom.pages.common.TopMenu;
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;

public class ProfilePage {
	
//	ExtentReports reports;
//	ExtentTest log;
	
	@Test
	public void testProfile() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Pagefactory helps passing the driver to launch class and then the same dirver is start pointing it to the 
		LaunchPage launchPage = PageFactory.initElements(driver, LaunchPage.class);
		LoginPage  loginPage  =	launchPage.gotoLoginPage();// Browser willl open from the method gotologinpage
		//loginPage.menu.search();
		LandingPage landingPage =loginPage.doLogin("praduman.mehta.ncc@gmail.com","Mehta1980");
		ProfilePage	profPage = landingPage.gotoProfilepage();
		 
		
		//the idea of making a return type profilePage is that we can call other mwthods from the class .i.e. for verification etc. 						  
					
	}

}
