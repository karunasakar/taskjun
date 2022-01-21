package tony.stark;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Workout2 {

	public static void main (String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace last chance\\seleniumproject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String lik = " https://www.amazon.in/";
		driver.get(lik);
		
		driver.manage().window().maximize();
		
		WebElement roll= driver.findElement(By.xpath("//a[contains(@id,'nav-link-prime')]"));
		
		  Actions prim = new Actions(driver);
		  prim.moveToElement(roll).perform();
		
	}
	
	
	
}
