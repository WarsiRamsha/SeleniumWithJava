package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\rwa\\\\Downloads\\\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //dropdown with select tag
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//("//div[@ id='glsctl00_mainContent_ddl_originStation1_CTNR']")).click();
		//driver.findElement(By.xpath("//a[@text='Chennai (MAA)']")).click();
		//driver.findElement(By.xpath("Chennai (MAA)']")).click();
		//driver.findElement(By.xpath("//a[@text='Bangkok (BKK)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		//traveling from parent to child
		
		//a[@text='Dubai, All Airports(DWC) (DXB)'] Xpath for dubai
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@text='Muscat (MCT)'])[2]")).click(); //because the element was not reachable
		////a[@text='Muscat (MCT)'] muscat two matching nodes
		
		//Calendar will populate afterwards
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		//System.out.println(driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active\")));
		
	}
}
