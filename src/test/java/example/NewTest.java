package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	    private WebDriver driver;	
	    
		@BeforeTest
		public void beforeTest() {	
		    driver = new FirefoxDriver();  
			driver.manage.window.maximize();
		}	
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();
			
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}
