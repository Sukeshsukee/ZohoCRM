package com.ZohoCRM.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateCompaign {

	@FindBy(name="property(Campaign Name)")
	WebElement Cname;
	
	@FindBy(name="property(Start Date)")
	WebElement startDate;
	
	@FindBy(name="property(Expected Revenue)")
	WebElement ExpectedRevenue;
	
	@FindBy(name="property(Actual Cost)")
	WebElement ActualCost;
	
	@FindBy(name="property(Num sent)")
	WebElement Numsent;
	
	@FindBy(name="property(Type)")
	WebElement type;
	
	@FindBy(name="property(Status)")
	WebElement status;
	
	@FindBy(name="property(End Date)")
	WebElement Enddate;
	
	@FindBy(name="property(Budgeted Cost)")
	WebElement Budgetedcost;
	
	@FindBy(name="property(Expected Response)")
	WebElement ExpectedResp;
	
	@FindBy(name="property(Description)")
	WebElement Description;
	
	@FindBy(name="Button")
	WebElement saveButton;
	
	public CreateCompaign(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void createCompaignPage() {
		
	}
	public WebElement getCname() {
		return Cname;
	}
	public WebElement getStartDate() {
		return startDate;
	}
	public WebElement getExpectedRevenue() {
		return ExpectedRevenue;
	}
	public WebElement getActualCost() {
		return ActualCost;
	}
	public WebElement getNumsent() {
		return Numsent;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getStatus() {
		return status;
	}
	public WebElement getEnddate() {
		return Enddate;
	}
	public WebElement getBudgetedcost() {
		return Budgetedcost;
	}
	public WebElement getExpectedResp() {
		return ExpectedResp;
	}
	public WebElement getDescription() {
		return Description;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	
}
