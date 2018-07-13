package learningAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setup 
		
				//run in Firefox
				//String exePath = "C:\\\\Users\\\\ar\\\\Documents\\\\browserDrivers\\geckodriver.exe";
				//System.setProperty("webdriver.gecko.driver",exePath);
				//WebDriver driver = new FirefoxDriver();
				
				//run in Chrome
				String exePath = "C:\\\\Users\\\\ar\\\\Documents\\\\browserDrivers\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", exePath);
				WebDriver driver = new ChromeDriver();
				
				String pageUnderTest = "http://demoqa.com/frames-and-windows/";
				//Open Store.DemoQA.com
				driver.get(pageUnderTest);
				driver.findElement(By.xpath(".//*[@id='tabs-1']/div/p/a")).click();
				driver.close();
	}
	

}
