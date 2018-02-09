//3

package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		driver.get("https://www.jetprivilege.com/rewards-program/enrol?q=opef");  //enter url
		
		//import select from Selenium
		//handle dropdown:
		Select select = new Select(driver.findElement(By.id("ctl02_ddlsalutation")));
		select.selectByVisibleText("Brigadier");
		
		
	}

}
