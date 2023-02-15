package com.ZohoCRM.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="userName")
    WebElement untbx;
	
	@FindBy(id="passWord")
	WebElement pwdtx;
	
	@FindBy(xpath="//input[@alt='Sign In']")
	WebElement signin;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setLoginPage(String LoginName,String password) {
		untbx.sendKeys(LoginName);
		pwdtx.sendKeys(password);
		signin.click();
	}
}
