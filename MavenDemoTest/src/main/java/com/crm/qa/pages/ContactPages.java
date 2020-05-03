package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactPages extends TestBase {
	
	
	public ContactPages contactpages;
	
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement contactsLabel;
	
	@FindBy(xpath="//form[@id='vContactsForm']//tr[5]//input")
	WebElement checkbox;
	
	
	public ContactPages(){
		
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyContactLabel(){
		return contactsLabel.isDisplayed();
	}
	
	public void selectContactsByName(String Name){
		
		driver.findElement(By.xpath("//a[contains(text(),'"+Name+"')]//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input"));
		
	}
}
