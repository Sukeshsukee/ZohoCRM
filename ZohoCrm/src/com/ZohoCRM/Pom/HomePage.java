package com.ZohoCRM.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
@FindBy(linkText="Campaigns")
WebElement compaings;

@FindBy(linkText="Logout [rashmi@dell.com]")
WebElement logout;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setcompaigns() {
	compaings.click();
}
public void setLogout() {
	logout.click();
}
}
