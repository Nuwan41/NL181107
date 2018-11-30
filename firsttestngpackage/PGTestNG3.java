package firsttestngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PGTestNG3 {
	public WebDriver driver;
	String driverpath="C:\\Nuwan\\Software\\Selinium\\Chromedriver\\v2.42\\chromedriver.exe";
	public String baseurl="http://demo.guru99.com/test/newtours/";
	
	
	
	@BeforeTest
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		driver=new ChromeDriver();
		driver.get(baseurl);		
	}
	@AfterTest
	public void closeBrowser(){
		driver.close();
	}
	
	
  @Test
  public void verifyHomePageTitle() {
	  
	  String expectedTitle="Welcome: Mercury Tours";
	  String actualTitle= driver.getTitle();	
	  Assert.assertEquals(actualTitle, expectedTitle);
	  
  }
  
  
  @Test
 public void verifyRegistorPageTitle() {
	  WebElement linkRegisterPage=driver.findElement(By.linkText("REGISTER"));
	  
	  linkRegisterPage.click();
	  
	  String expectedTitle="Register: Mercury Tours";
	  String actualTitle= driver.getTitle();	
	  Assert.assertEquals(actualTitle, expectedTitle);
	  
	  driver.navigate().back();
	  
  }
  @Test
  public void verifySupportPageTitle() {
	  WebElement linkSupportPage = driver.findElement(By.linkText("SUPPORT"));
	  
	  linkSupportPage.click();
 	  
 	  String expectedTitle="Under Construction: Mercury Tours";
 	  String actualTitle= driver.getTitle();	
 	  Assert.assertEquals(actualTitle, expectedTitle);
 	  
 	 driver.navigate().back();
 	  
   }
  
  
  
}
