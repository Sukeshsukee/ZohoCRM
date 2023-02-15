package com.ZohoCRM.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ZohoCRM.Pom.HomePage;
import com.ZohoCRM.Pom.LoginPage;

public class BaseClasss {
	public static WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@BeforeTest
	public void openbrowser() {
		Reporter.log("openBrowser",true);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	}
	@AfterTest
	public void closebrowser() {
		Reporter.log("closeBrowser",true);
		driver.quit();
	}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login",true);
		FileLib fl=new FileLib();
		String un = fl.getPropertydata("un");
		String pwd = fl.getPropertydata("pwd");
		driver.get(fl.getPropertydata("url"));
		LoginPage l=new LoginPage(driver);
				l.setLoginPage(un, pwd);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);
		driver.navigate().back();
		HomePage h=new HomePage(driver);
		h.setLogout();
	}
	

}
