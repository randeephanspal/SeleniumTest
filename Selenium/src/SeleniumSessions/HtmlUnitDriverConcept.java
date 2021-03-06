
//12
package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver(); //launch chrome
		
		//htmlUnitDriver is not available in Selenium 3.x version
		//we have to download htmlunitdriver jar file
		
		//advantages:
		//1. Testing is happening behind the scene - no browser is launched.
		//2. execution of test cases is very fast - performance of the script
		//3. ghost driver -- headless browser
		
		//disadv: not suitable for Action class. -- user actions -- mouse movement, double click,drag n drop.
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");  //enter url
		
		System.out.println("Get Title before login::::" + driver.getTitle());
		
		driver.findElement(By.name("username")).sendKeys("rsingh");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		System.out.println("Get Title after login::::" + driver.getTitle());
		
		
	}

}
