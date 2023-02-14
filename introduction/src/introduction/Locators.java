package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());	
		//with id
		driver.findElement(By.id("inputUsername")).sendKeys("Ramsha" ); //Locator by ID
		driver.findElement(By.name("inputPassword")).sendKeys("Hello123"); //Locator by name
		driver.findElement(By.className("signInBtn")).click(); //Locator by Classname 
		driver.findElement(By.linkText("Forgot your password?")).click(); //it has to be an anchor tag
		//System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); timeout issue add implicit timeout it won't show any error
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("test321.com");
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ramsha");
		Thread.sleep(3000); //Implicit wait and explicit wait
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("ramsha@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("0900 123456");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());//Travelling from parent to child
		driver.findElement(By.xpath("//div[@class=\"forgot-pwd-btn-conainer\"]/button[1]")).click();
		Thread.sleep(3000);
		//driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//div/button[@class='reset-pwd-btn']; other way of writing locator
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("ramsha"); 
		driver.findElement(By.cssSelector("input[placeholder*=Pass]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[value='rmbrUsername\']")).click();
		driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click(); 
	
		
	}
}