//2

package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
//import org.openqa.selenium.interactions.SendKeysAction;

public class LocatorConcept {

	public static void main(String[] args) {

		//2. Chrome browser:
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		driver.get("https://reg.ebay.com/reg/PartialReg?siteid=0&UsingSSL=1&co_partnerId=2&errmsg=&src=&ru=https%3A%2F%2Fwww.ebay.com%2F&signInUrl=https%3A%2F%2Fsignin.ebay.com%3A443%2Fws%2FeBayISAPI.dll%3FSignIn%26ru%3Dhttps%253A%252F%252Fwww.ebay.com%252F&rv4=1");  //enter url
		
		//xpath: address of that particular element  ---P2
		//absoute path should not be used.//only relative path should be used
		
		//driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Tom");
		//driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Moody");
		
		//id  ---P1
		//driver.findElement(By.id("firstname")).sendKeys("Tommy");
		
		//name ---P3
		//driver.findElement(By.name("firstname")).sendKeys("Tom");
		
		//4. LinkText: this is only for links
		//driver.findElement(By.linkText("User Agreement")).click();
		
		//5. partialLinkText: not useful, not recommended
		
		//6. CSSSelector: '#id'   ---P2
		//if id present: #{id}
		//if class is present: .{class}
		//driver.findElement(By.cssSelector("#firstname")).sendKeys("Bunt");
		
		//7. className: not useful bz class name can be duplicate
		//driver.findElement(By.className("wide fld")).sendKeys("Myname");
		
		
		
		
	}

}
