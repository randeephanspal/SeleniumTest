package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	//pre conditions annotations --  starts with @Before
	
	@BeforeSuite 
	public void setUp(){
		System.out.println("setup system property from chrome");	
	}
	
	@BeforeTest
	public void launchBrowser(){
		System.out.println("launchBrowser");
	}
	
	@BeforeClass
	public void login(){
		System.out.println("login to app");
	}
	
	@BeforeMethod
	public void enterURL(){
		System.out.println("Enter url");
	}
	
//Testcases -- starting with @Test
	@Test
	public void googleTitleTest(){
		System.out.println("Google Title test");
	}
	
	@Test
	public void searchTest(){
		System.out.println("search Test");
	}
	
	@Test
	public void googlelogoTest(){
		System.out.println("google logo test");
	}
	
	/*@BeforeMethod
	 * Test1
	 *@AfterMethod
	 *
	 *@BeforeMethod
	 *Test2
	 *@AfterMethod
	 *
	 */
	
	//post condition -- starting with @After
	@AfterMethod
	public void logout(){
		System.out.println("Logout from app");
	}
	
	@AfterClass
	public void closeBrowser(){
		System.out.println("Close Browser");
	}
	
	@AfterTest
	public void deleteAllCookies(){
		System.out.println("delete cookies");
	}
	

	
	
}
