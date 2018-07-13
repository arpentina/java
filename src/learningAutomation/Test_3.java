package learningAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_3 {

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
						
				String pageUnderTest = "http://demoqa.com";
				//Open Store.DemoQA.com
				driver.navigate().to(pageUnderTest);
				
				//Click on Registration link using “driver.findElement(By.xpath(“.//*[@id=’menu-item-374′]/a”)).click();“
				driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
				
				//Come back to Home page (Use ‘Back’ command)
				driver.navigate().back();
				
				//Again go back to Registration page (This time use ‘Forward’ command)
				driver.navigate().forward();
				
				//Again come back to Home page (This time use ‘To’ command)
				driver.navigate().to(pageUnderTest);
				
				//Refresh the Browser (Use ‘Refresh’ command)
				driver.navigate().refresh();
				
				
				//Close the Browser
				driver.close();

	}

}
