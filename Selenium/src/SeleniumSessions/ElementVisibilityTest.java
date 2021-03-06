
//13
package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/register/");  //enter url
		
		//1. isDisplayed() method: applicable for all elements
		//will return value
		
		boolean b1 = driver.findElement(By.id("submitButton")).isDisplayed(); //for Submit button
		System.out.println("isDisplayed on Submit:"+ b1); //true
		
		//Thread.sleep(3000);
		
		//2. isEnabled(): primarly used for buttons
		boolean b2 = driver.findElement(By.id("submitButton")).isEnabled(); //for Submit button
		System.out.println("isEnabled on Submit:"+ b2); //false
		
		//select I Agree checkbox
		driver.findElement(By.name("agreeTerms")).click();
		boolean b3 = driver.findElement(By.id("submitButton")).isEnabled(); //for Submit button
		System.out.println("After clicking checkbox,isEnabled:"+ b3); //true
		
		
		//3. isSelected() method: only applicable for checkbox,dropdown,radiobutton
		boolean b4 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println("isSelected:"+b4); //true
		
		driver.findElement(By.name("agreeTerms")).click();
		boolean b5 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println("isSelected after deselecting:"+b5); //false	
		
		
	}

}
