package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Homepage {
	public static WebElement element = null;
	
	public static WebElement Personal(WebDriver driver){
		element=driver.findElement(By.className("personalLink"));
		return element;
		}
	public static WebElement Business(WebDriver driver){
		element=driver.findElement(By.className("businessLink"));
		return element;
		}
	public static WebElement Enterprise(WebDriver driver){
		element=driver.findElement(By.className("enterpriseLink"));
		return element;
		}
	public static void NavigatetoPersonal(WebDriver driver){
		element=Personal(driver);
		element.click();
	}
	public static void NavigatetoBusiness(WebDriver driver){
			element=Business(driver);
			element.click();	
		}
	public static void NavigatetoEnterprise(WebDriver driver){
		element=Enterprise(driver);
		element.click();
		}
}
