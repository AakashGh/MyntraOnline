package com.myntraonline.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.myntraonline.qa.base.TestBase;
import com.myntraonline.qa.pages.MyntraHomePage;
import com.myntraonline.qa.pages.MyntraLoginPage;

public class LoginPageTest extends TestBase {
	MyntraLoginPage loginPage;
	MyntraHomePage homepage;

	
	public LoginPageTest() throws IOException{
		super();
	}
	
	@BeforeMethod
	public void setup() throws IOException{
		initialiazation();
		loginPage  = new MyntraLoginPage();
	}

	@Test(priority=1)
	
	public void loginPageTitleTest(){
		String title = loginPage.CheckTitle();
		Assert.assertEquals(title, "Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra");
		
	}
	
	
	@ Test(priority=2)
	
	public void loginPageLoginTest(){
		homepage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
	
	
}
