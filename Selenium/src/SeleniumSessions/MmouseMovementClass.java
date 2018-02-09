//9
//Understand mouse hover
//practise multi mouse over

package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MmouseMovementClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.spicejet.com/Default.aspx");  //enter url
		
		//Actions class object is used for mouse over
		//mouse movement is done by action class
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Hot Meals")).click();
		


	}

}
