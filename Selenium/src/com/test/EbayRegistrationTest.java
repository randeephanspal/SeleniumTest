package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class EbayRegistrationTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies(); 
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.get("https://reg.ebay.in/reg/PartialReg");
	}
	
	
	@DataProvider
	public Iterator<Object[]> getTestData(){
		ArrayList<Object[]> testData = TestUtil.getDataFromExcel();
		return testData.iterator();
	}
	
	
	@Test(dataProvider="getTestData")
	public void ebayRegPageTest(String firstname, String lastname, String email, String password){
		
		//enter data
		driver.findElement(By.xpath("//*[@id='firstname']")).clear();
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(firstname);
		
		driver.findElement(By.xpath("//*[@id='lastname']")).clear();
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//*[@id='email']")).clear();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//*[@id='PASSWORD']")).clear();
		driver.findElement(By.xpath("//*[@id='PASSWORD']")).sendKeys(password);
		
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}
