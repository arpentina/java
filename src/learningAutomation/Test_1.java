package learningAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_1 {

	public static void main(String[] args) throws InterruptedException {

		//Setup 
		
		//run in Firefox
		//String exePath = "C:\\\\Users\\\\ar\\\\Documents\\\\browserDrivers\\geckodriver.exe";
		//System.setProperty("webdriver.gecko.driver",exePath);
		//WebDriver driver = new FirefoxDriver();
		
		//run in Chrome
		String exePath = "C:\\\\Users\\\\ar\\\\Documents\\\\browserDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		String pageUnderTest = "http://www.store.demoqa.com";
		//Open Store.DemoQA.com
		driver.get(pageUnderTest);
		
		//Get Page Title name and Title length 
		String webPageTitle = driver.getTitle();
		int webPageTitleLenght = driver.getTitle().length(); 
		System.out.println("Successfully opened the website www.Store.Demoqa.com; And the web page title is: "  + webPageTitle);
		System.out.println("Successfully opened the website www.Store.Demoqa.com; And the web page title lenght is: "  + webPageTitleLenght);
        
		//Wait for 5 Sec
		Thread.sleep(5000);
		
		//Get Page URL and verify if the it is a correct page opened
		String pageURL = driver.getCurrentUrl();
		if (pageURL.equals(pageUnderTest) )
			{System.out.println("correct page is tested");}
		else 
			{System.out.println("incorrect page is tested");}
		
		
		//Get Page Source (HTML Source code) and Page Source length
		String webPageSource = driver.getPageSource();
		int webPageSourceLenght = driver.getPageSource().length(); 
		System.out.println("Successfully opened the website www.Store.Demoqa.com; And the web page source is: "  + webPageSource);
		System.out.println("Successfully opened the website www.Store.Demoqa.com; And the web page source lenght is: "  + webPageSourceLenght);
		//comment
        // Close the driver
        driver.quit();
	}

}
