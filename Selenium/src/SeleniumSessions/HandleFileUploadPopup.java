//5
package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		driver.get("https://html.com/input-type-file/");  //enter url
		
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Recovery.txt");

	}

}
