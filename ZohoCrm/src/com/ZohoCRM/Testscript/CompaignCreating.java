package com.ZohoCRM.Testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ZohoCRM.Pom.CompaignPage;
import com.ZohoCRM.Pom.CreateCompaign;
import com.ZohoCRM.Pom.HomePage;
import com.ZohoCRM.generic.BaseClasss;
import com.ZohoCRM.generic.FileLib;
@Listeners(com.ZohoCRM.generic.ListenerImplementation.class)
public class CompaignCreating extends BaseClasss{

	@Test
	public void createcompaign() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("test",true);
		HomePage h=new HomePage(driver);
		h.setcompaigns();
		CompaignPage c=new CompaignPage(driver);
		c.setCompaignPage();
		CreateCompaign cc=new CreateCompaign(driver);
		FileLib f=new FileLib();
		String name = f.getExcelData("CreatePage", 1, 0);
		cc.getCname().sendKeys(name);
		
		String startdate = f.getExcelData("CreatePage", 1, 1);
		cc.getStartDate().sendKeys(startdate);
		String erevenue = f.getExcelData("CreatePage", 1, 2);
		cc.getExpectedRevenue().sendKeys(erevenue);
		String Acost = f.getExcelData("CreatePage", 1, 3);
		cc.getActualCost().sendKeys(Acost);
		String Nsent = f.getExcelData("CreatePage", 1, 4);
		cc.getNumsent().sendKeys(Nsent);
		
		Select s=new Select(cc.getType());
		String type = f.getExcelData("CreatePage", 1, 5);
		s.selectByVisibleText(type);
		
		Select sc=new Select(cc.getStatus());
		String status = f.getExcelData("CreatePage", 1, 6);
		sc.selectByVisibleText(status);
		
		String Edate = f.getExcelData("CreatePage", 1, 7);
		cc.getEnddate().sendKeys(Edate);
		String Bcost = f.getExcelData("CreatePage", 1, 8);
		cc.getBudgetedcost().sendKeys(Bcost);
		String Expre = f.getExcelData("CreatePage", 1, 9);
		cc.getExpectedResp().sendKeys(Expre);
		String desc = f.getExcelData("CreatePage", 1, 10);
		cc.getDescription().sendKeys(desc);
		cc.getSaveButton().click();
		//driver.switchTo().alert().accept();
		HomePage hp=new HomePage(driver);
		hp.setcompaigns();
		String expectedcpgn = f.getExcelData("CreatePage", 1, 11);

		CompaignPage co=new CompaignPage(driver);
		String actual = co.getcampaign().getText();
		
		Assert.assertEquals(actual, expectedcpgn);
		
		
		
		
		
				
	}
	
}
