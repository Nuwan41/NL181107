package firsttestngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class FirstTestNGFile2 {
	public String baseurl="http://demo.guru99.com/test/newtours/";
	String driverpath="C:\\Nuwan\\Software\\Selinium\\Chromedriver\\v2.42\\chromedriver.exe";
	public WebDriver driver;
	
  @Test
  public void verifyHomepageTitle() {
	  String extectedTitle="Welcome: Mercury Tours";
	  String actualTitle= driver.getTitle();
	  
	  System.out.println("Actual Title is"+actualTitle);
	  
	  Assert.assertEquals(actualTitle, extectedTitle);
  }
  @BeforeTest
  public void LaunchBrowser() {
	  
	  System.out.println("Launching Chrome Browser");
	  System.setProperty("webdriver.chrome.driver", driverpath);
	  
	  driver= new ChromeDriver();
	  driver.get(baseurl);
  }

  @AfterTest
  public void TerminateBrowser() {
	  driver.close();
  }

}
