package tony.stark;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Workout3 {
public static void main (String[]args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace last chance\\seleniumproject\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	String likk ="https://www.amazon.in/";
	driver.get(likk);
	
	driver.manage().window().maximize();
	
	WebElement mveto = driver.findElement(By.xpath("//a[contains(@id,'nav-link-prime')]"));
	Actions asss = new Actions(driver);
   asss.moveToElement(mveto).perform();
   
   
   
}
}
