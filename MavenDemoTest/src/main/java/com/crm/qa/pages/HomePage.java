package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//td[contains(text(),'User: Demo User')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[@title='Contacts']")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	//initialization of Home page objects
	
	public HomePage(){
		
		PageFactory.initElements(driver, this);
	}
	
	public String HomePageTitle(){
		
		return driver.getTitle();
	}
	
	public ContactPages clickOnContactLinks(){
		
	 contactsLink.click();
	 return new ContactPages ();
	}
	
	public DealsPage clickOnDealsLinks(){
		
		 dealsLink.click();
		 return new DealsPage ();
		}
	
	public boolean verifyCorrectUsername1(){
		
		return userNameLabel.isDisplayed();
	}
	
	public TasksPage clickOnTasksLinks(){
		
		 tasksLink.click();
		 return new TasksPage ();
		}

	public boolean verifyCorrectUsername() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyCorrectUsername1() {
		// TODO Auto-generated method stub
		return false;
	}

}
