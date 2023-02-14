package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Invoking a browser
		//Concept of interface
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe"); //key-value
		//WebDriver driver = new ChromeDriver();	 //using webDriver because
		//driver.get("https://www.google.com/");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());		
		//driver.close();
		//quit and close-> close will get closed one window that got opened with selenium i.e. current window
		//and quit will close all the associated tabs
		
		//Selenium 4.60 selenium manager will turn off if system property is set
		
		
		//Launch on firefox
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver\\geckodriver.exe"); //key-value //D:\\chromedriver_win32\\geckodriver.exe
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/ ");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());		//ignore the javascript errors they are related to browser
		driver.close();
		
		//proxy server set property
		
	}

}
