//8.
package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");  //enter url
		
		driver.findElement(By.name("username")).sendKeys("rsingh");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		//add frame
		driver.switchTo().frame("mainpanel");
		
		//exception: when frame not mentioned:
	//NoSuchElementException: no such element: Unable to locate element: {"method":"xpath","selector":"//a[contains(text(),'Contacts')]"}
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		System.out.println("Get Title after click contacts::::" + driver.getTitle());
	}

}
