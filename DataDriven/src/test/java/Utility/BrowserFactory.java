package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class BrowserFactory {
	static WebDriver driver = null;
			
	@Test
		public static WebDriver BrowserOptions(String browserName, String url, String appURL) 
		{
					
			if(browserName.equalsIgnoreCase("Chrome")||browserName.equalsIgnoreCase("GC")||browserName.equalsIgnoreCase("Google Chrome")){
				System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Chromenew\\chromedriver_win32 (1)\\chromedriver.exe");
				driver = new ChromeDriver();
							
			}
			else if(browserName.equalsIgnoreCase("Edge")||browserName.equalsIgnoreCase("EG")||browserName.equalsIgnoreCase("Microsoft Edge")){
				System.setProperty("webdriver.edge.driver","C:\\Selenium\\EdgeDriver\\edgedriver_win64\\msedgedriver.exe");
				driver = new EdgeDriver();
			}else {
				System.out.println("sorry we do not support this browser");
			} return driver;
			
		}
		
		public static void closeBrowser(WebDriver driver) {
			driver.quit();
		}

		public static WebDriver BrowserOptions(WebDriver driver2, String browser, String appURL) {
			// TODO Auto-generated method stub
			return null;
		}
	
		
	
}
