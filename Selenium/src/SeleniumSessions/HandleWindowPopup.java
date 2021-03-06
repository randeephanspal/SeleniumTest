//12
package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		
		//3 ways of handling popups
		//1.alerts - javascript popup -- alert API
		//2. fileupload popup - browse button -- (type=file, sendKeys(path))
		//3. BrowserWindow popup - Advertisement popup (getWindowHandles() method)

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.popuptest.com/goodpopups.html");  //enter url
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[2]")).click();
		Thread.sleep(2000);
		
		//getWindowHandles() method gives the window ids
		Set<String> handler = driver.getWindowHandles(); //Set object stores 2 windows id
		//In set values are not stored on indexes and thus we need iterator to get the values
		
		Iterator<String> it = handler.iterator(); //Fetch all the values from Set
		
		String parentWindowId = it.next();
		System.out.println("parentWindow id:" + parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("Child Window id:" + childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("child window popup title:"+ driver.getTitle());
		Thread.sleep(2000);
		
		driver.close(); //close the existing page only.
		
		driver.switchTo().window(parentWindowId);
		Thread.sleep(2000);
		System.out.println("Parent window title id:"+ driver.getTitle());
		
		
		
		
		
		
		
	}

}
