package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//XPath: Parent to child and targeting one child with respect to sibling
		//header/div/button[2] 2 button 
		//click button next to practice
		// requirement if the button text is 
		//dynamically changing or there are more buttons 
		//you need to click the one next to practice
		//header/div/button[1]/following-sibling::button[1] 
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		//to click on the ahref then
		driver.findElement(By.xpath("//button/parent::div/parent::header/a[@class='blinkingText']")).click(); //child to parents parents 
		Thread.sleep(5000);
		driver.quit();
	}

}
