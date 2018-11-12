package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestClass {
public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Nuwan\\Software\\Selinium\\Chromedriver\\v2.42\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String baseurl="http://demo.guru99.com/test/newtours/register.php";
			
		driver.get(baseurl);
		try{
		Select drpCountry=new Select(driver.findElement(By.name("countryl")));
		
		//drpCountry.selectByVisibleText("AUSTRALIA");
		//drpCountry.selectByValue("COLOMBIA");
		drpCountry.selectByIndex(11);
		}
		catch(NoSuchElementException nsee){
			System.out.println(nsee.toString());
		}
		
		
		
	}
}
