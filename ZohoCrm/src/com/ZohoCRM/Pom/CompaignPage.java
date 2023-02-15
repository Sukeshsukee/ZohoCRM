package com.ZohoCRM.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompaignPage {
	
	@FindBy(xpath="(//input[@class='button'])[3]")
	WebElement newcompaign;
	
	@FindBy(linkText="Sukesh")
	WebElement campaign;
	
	public CompaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setCompaignPage() {
		newcompaign.click();
	}
	public WebElement getcampaign() {
		
		return campaign;
	}

}
