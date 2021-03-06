//16
package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchText {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize(); //maximize window
		driver.manage().deleteAllCookies(); //delete cookies
		
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in/");  //enter url
		
		//get the locator of searchtext as Testing
		driver.findElement(By.id("lst-ib")).sendKeys("Testing");
				
		//get all the elements in searcch options
		List<WebElement> listtest = driver.findElements(By.xpath("//ul[@role='listbox']//li/descedant::div[@class='sbqs_c']"));
		
		System.out.println("Total no of suggestions:::"+listtest.size());
		
		for(int i=0; i<listtest.size(); i++){
			System.out.println(listtest.get(i).getText());
			if(listtest.get(i).getText().contains(("Testing interview questions")){
				listtest.get(i).click();
				break;
			}
		}
		
	}

}
