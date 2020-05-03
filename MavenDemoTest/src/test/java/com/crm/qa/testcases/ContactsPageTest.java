package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPages;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homepage;
	TestUtil testUtil;
	ContactPages contactPages;
	
	public ContactsPageTest(){
		
		super();
	}
	
   @BeforeMethod
	
	public void setUp(){
		
		initialization();
		testUtil=new TestUtil();
		loginPage= new LoginPage();
		contactPages=new ContactPages();
		homepage= loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		contactPages=homepage.clickOnContactLinks();
		
	}

   @Test(priority=1)
   public void verifyContactsPageLabel(){
	   
	   
	   Assert.assertTrue(contactPages.verifyContactLabel());
	   
	   
   }
    @Test(priority=2)
    
    public void selectContactsTest(){
    	
    	contactPages.selectContactsByName("Aakash Jain");
    }
   
   
   
   @AfterMethod
   
   public void teardown(){
	   
	   
	   driver.quit();
   }
}
