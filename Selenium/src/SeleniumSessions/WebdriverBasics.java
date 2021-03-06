package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasics {

	public static void main(String[] args) {

		//C:\\Users\\test\\Downloads\\geckodriver-v0.19.1-win64
		//1. FF browser:
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\test\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://www.google.com");
		
		
		//2. Chrome browser:
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		driver.get("http://www.google.com");  //enter url
		
		String title = driver.getTitle();  //getTitle
		
		System.out.println(title);
		
		//validation point:
		if(title.equals("Google")){
			System.out.println("correct title"); 
		}
			else{
				System.out.println("incorrect title");
		}
		
		System.out.println(driver.getCurrentUrl());  //gt current url
		
		driver.quit();	//quit the browser
	}
}
