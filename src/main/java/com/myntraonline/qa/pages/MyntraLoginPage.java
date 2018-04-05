package com.myntraonline.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myntraonline.qa.base.TestBase;

public class MyntraLoginPage extends TestBase {
	
	

    @FindBy(xpath="//*[@class='desktop-userIconsContainer']")
    WebElement LoginIcon;
    
    @FindBy(xpath="//*[@class='desktop-linkButton' and contains(text(),'login')]")
    WebElement LogInButtonOnHomePage;
    
    @FindBy(xpath="//input[@type='email']")
    WebElement UserName;
    
    
    @FindBy(xpath="//input[@type='password']")
    WebElement Password;
    
    @FindBy(xpath="//button[contains(text(),'Log in')]")
    WebElement LoginButton;
    
    public MyntraLoginPage() throws IOException{
    	PageFactory.initElements(driver, this);
    }
	
    public String CheckTitle(){
    	return driver.getTitle();
    }
    public MyntraHomePage Login(String un, String pwd){
    	LoginIcon.click();
    	LogInButtonOnHomePage.click();
    	UserName.sendKeys(un);
    	Password.sendKeys(pwd);
    	return new MyntraHomePage();
    	
    }
    
    
	}


