package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Locators2 {
	public static void main(String[] args) throws InterruptedException {
		//String name= "Ramsha"; //so that it is not hard coded
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		//one way to call method is with object or mark static.
		WebDriver driver = new ChromeDriver();
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());	
		driver.findElement(By.id("inputUsername")).sendKeys(name );
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.tagName("p")).getText()); //scanning from left. 
		//only one tag that's why it is used otherwise it should not
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),  "Hello "+name+ ",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click(); //This is an End to end scenario
	    //button based on text //* anywhere in the page
		driver.quit();
	}
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String passwordText =driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray1 = passwordText.split("'");
		String password = passwordArray1[1].split(",")[0];
		return password;
		//extracted Array  'rahulshettyacademy' to Login.
		//string: Please use temporary password 'rahulshettyacademy' to Login.
		//0 Please use temporary password 
		//1 rahulshettyacademy' to Login.
		// String[] passwordArray1 = passwordText.split("'")
		// String[] passwordArray2 = passwordArray1[1].split("'"); 
		//passwordArray2[0]
		//one way to split the splitted array other way is to extract with respect to index
	}

}
