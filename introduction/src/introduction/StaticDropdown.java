package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //dropdown with select tag
				WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
				Select dropdown = new Select(staticDropdown);
				dropdown.selectByIndex(2); //dropdown has many methods, so that it could be used
				System.out.println(dropdown.getFirstSelectedOption().getText()); //multiple select select multiple 
				//get first only one is selected
				//Visible text
				dropdown.selectByVisibleText("USD");
				System.out.println(dropdown.getFirstSelectedOption().getText());
				//single selection do not support deselect option.
				dropdown.selectByValue("INR"); //value is an attribute
				System.out.println(dropdown.getFirstSelectedOption().getText());
				
				
			
				

	}

}
