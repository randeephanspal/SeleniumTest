//14

package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class BrokenLinkTest {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html");  //enter url
		
		driver.findElement(By.name("username")).sendKeys("rsingh");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		//links -- //a href<http://www.google.com>
		//image -- //img href<http://www.yahoo.com>
		
		//1. get the list of all the links and images -- 500
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		linksList.add(driver.findElement(By.tagName("img")));
		
		System.out.println("Size of full links and images-->" + linksList.size());
		
		List<WebElement> activeLinks= new ArrayList<WebElement>();
		
		//2. iterate listsList : exclude all the links/images that doesnt have href attribute
		for(int i=0; i<linksList.size(); i++){
			System.out.println(linksList.get(i).getAttribute("href"));
			if(linksList.get(i).getAttribute("href") != null && (!linksList.get(i).getAttribute("href").contains("javascript"))){
				activeLinks.add(linksList.get(i));
			}
		}
		
		---incomplete
		
	}

}
