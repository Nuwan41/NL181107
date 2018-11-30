package firsttestngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class PGTestNG3bTest {
	
	public WebDriver driver;
	String driverpath="C:\\Nuwan\\Software\\Selinium\\Chromedriver\\v2.42\\chromedriver.exe";
	public String baseurl="http://demo.guru99.com/test/newtours/";
	String expectedTitle="";
	String actualTitle= "";	
	
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
	@BeforeMethod
	public void verifyHomePageTitle(){
		 expectedTitle="Welcome: Mercury Tours";
		 actualTitle= driver.getTitle();	
		 Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	@AfterMethod
	public void nevigateBack(){
		driver.navigate().back();
	}

  @Test(priority=0)
  public void verifyRegistorPageTitle() {
	  WebElement linkRegisterPage=driver.findElement(By.linkText("REGISTER"));	  
	  linkRegisterPage.click();
	  
	  expectedTitle="Register: Mercury Tours";
	  actualTitle= driver.getTitle();	
	  Assert.assertEquals(actualTitle, expectedTitle);
	  
	  
  
  }

  @Test(priority=1)
  public void verifySupportPageTitle() {
	  
	  WebElement linkSupportPage = driver.findElement(By.linkText("SUPPORT"));
	  
	  linkSupportPage.click();
 	  
 	  expectedTitle="Under Construction: Mercury Tours";
 	  actualTitle= driver.getTitle();	
 	  Assert.assertEquals(actualTitle, expectedTitle);
 	  
 	  
   
  }
}
