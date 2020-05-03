package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
          //Page factory-OR
	
	      @FindBy(name ="username")
	      WebElement username;
	      
	      @FindBy(name="password")
	      WebElement password;
	      
	      @FindBy(xpath ="//input[@type='submit']")
	      WebElement loginbtn;
	      
	      @FindBy(xpath="//a[@href='https://register.freecrm.com/register/']")
	      WebElement signupLink;
	      
	      @FindBy(xpath="//a[@class='navbar-brand']/img[contains(@class,'img-responsive')]")
	      WebElement crmLogo;
	      //initialization
	      public LoginPage(){
	    	  
	    	  PageFactory.initElements(driver, this);
	      }
	      //action
	      public String validateLoginPage(){
	    	  
	    	  return driver.getTitle();
	    	  
	      }
	      
	      public Boolean validateCrmImage(){
	    	  
	    	  return crmLogo.isDisplayed();
	    	  
	    	  
	      }
	      
          public HomePage login(String un,String pwd){
        	  
        	  username.sendKeys(un);
        	  password.sendKeys(pwd);
        	  loginbtn.click();
        	  
        	  return new HomePage();
        	  
          }
          
          
          
}

