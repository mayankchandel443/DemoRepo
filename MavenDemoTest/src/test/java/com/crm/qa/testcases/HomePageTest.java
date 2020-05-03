package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	
	public void setUp(){
		
		initialization();
		testUtil=new TestUtil();
		loginPage= new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	//test case should be separated 
	//before each test case launch the browser and login
	//@test-- run the test case 
	// after each test case close the browser 
	
	@Test(priority=1)
	
	public void verifyHomePageTitleTest(){
		
		String homepagetitle= homePage.HomePageTitle();
		Assert.assertEquals(homepagetitle, "CRMPRO","Home page title is not matching");
		
	}
	
	@Test(priority=2)
	public void verifyCorrectUsernameTest(
			){
		
		
		Assert.assertTrue(homePage.verifyCorrectUsername1());
	}
	
	
	
	@AfterMethod
	
	public void tearDown(){
		
		driver.quit();
	}
}
