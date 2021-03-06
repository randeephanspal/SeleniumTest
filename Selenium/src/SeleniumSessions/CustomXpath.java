//6.
package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //atleast wait for 40 secs for the page to be loaded
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //wait for all the elements(button,links) to get loaded.
		
		driver.get("https://html.com/input-type-file/");  //enter url
		
		//absolute xpath: not recommended
		///html/body/div[1]/div/div/aside/div/div[1]/form/label/input
		
		//driver.findElement(By.xpath("//input[@class='search-field']")).sendKeys("Java");
		//OR
		//driver.findElement(By.xpath("//input[@placeholder='Search �']")).sendKeys("Java");
		
		driver.findElement(By.xpath("//input[contains(@class,'search-field')]")).sendKeys("Java");
		
		
		//for links: custom xpath
		//all links are represented by <a> html tag
		
		driver.findElement(By.xpath("//a[contains(text(),'Code Example')]")).click();
		
		
		
	}

}
