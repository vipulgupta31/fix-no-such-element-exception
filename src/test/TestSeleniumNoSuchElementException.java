package test;

import java.net.*;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;



public class TestSeleniumNoSuchElementException {

	public RemoteWebDriver driver = null;


	   String username = System.getenv("LT_USERNAME") == null ? "<lambdatest_username>" : System.getenv("LT_USERNAME");
	   String accessKey = System.getenv("LT_ACCESS_KEY") == null ? "<lambdatest_accesskey>" : System.getenv("LT_ACCESS_KEY");


	   @BeforeTest
	   public void setup() {
	       try {
	           ChromeOptions chromeOptions = new ChromeOptions();
	           chromeOptions.setPlatformName("Windows 10");
	           chromeOptions.setBrowserVersion("110.0");


	           HashMap<String, Object> ltOptions = new HashMap<String, Object>();
	           ltOptions.put("build", "NoSuchElementException in Selenium");
	           chromeOptions.setCapability("LT:Options", ltOptions);


	           driver = new RemoteWebDriver(
	                   new URL("https://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub"), chromeOptions);
	       } catch (MalformedURLException e) {
	           e.printStackTrace();
	       }
	       driver.get("https://www.lambdatest.com/selenium-playground/");
	   }
	   
	   @AfterTest
	   public void tearDown() {
	       driver.quit();
	   }

	   @Test
	   public void testNoSuchElmentException()
	   {
		   	driver.findElement(By.xpath("//*[contains(text(),'Table Pagination')]")).click();
		   	driver.findElement(By.id("maxRows")).click();
	   }
	   
	   @Test
	   public void testNoSuchElmentException_fix_tryCatch()
	   {
		   try {
			   driver.findElement(By.xpath("//*[contains(text(),'Table Pagination')]")).click();
			   driver.findElement(By.id("maxRows")).click();   
		   }
		   catch(NoSuchElementException ex)
		   {
			   System.out.println("We are inside catch block");
			   System.out.println("NoSuchElmentException has been handled.");
		   }
	   }
	   
	   @Test
	   public void testNoSuchElmentException_fix_wait()
	   {
		   	driver.findElement(By.xpath("//*[contains(text(),'Table Pagination')]")).click();
		   	
		   	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("maxRows")));
		   	
		    driver.findElement(By.id("maxRows")).click();
			System.out.println("Web element located and clicked successfully.");

	   }
	   
	   

}
