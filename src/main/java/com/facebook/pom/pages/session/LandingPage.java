package com.facebook.pom.pages.session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.facebook.pom.base.BasePage;
import com.facebook.pom.pages.LoginPage;

public class LandingPage extends BasePage {
	
	
	
	@FindBy(xpath=".//*[@id='gbw']/div/div/div[2]/div[4]/div[1]/a/span")
	public WebElement profileButton;
	@FindBy(xpath=".//*[@id='gbw']/div/div/div[2]/div[4]/div[2]/div[1]/div/div[2]")
	public WebElement profileLink;
	
	public LandingPage(WebDriver driver) {
		//this.driver=driver;
		super(driver);
	}
	
	
	public ProfilePage gotoProfilepage() {
		profileButton.click();
		String Lemail =profileLink.getText();
		String email="praduman.mehta.ncc@gmail.com";
		Assert.assertEquals(Lemail, email);
		return PageFactory.initElements(driver, ProfilePage.class);
		
	}
	
//	public ProfilePage VerifyLandingPage() {
//		profileButton.click();
//		String Lemail =profileLink.getText();
//		String email="praduman.mehta.ncc@gmail.com";
//		Assert.assertEquals(Lemail, email);
//		return PageFactory.initElements(driver, ProfilePage.class);
//		
// }

}
