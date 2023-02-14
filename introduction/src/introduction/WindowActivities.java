package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com"); //components are fully loaded in built wait is added
		driver.navigate().to("https://rahulshettyacademy.com"); //it doesn't have inbuilt wait"
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward(); //end to end applications
	}
}