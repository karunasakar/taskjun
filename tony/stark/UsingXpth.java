package tony.stark;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpth {
public static void main (String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace last chance\\seleniumproject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.redbus.in/");
	
		driver.manage().window().maximize();
       
		
		WebElement frmtxt = driver.findElement(By.xpath("//div[contains(@id,'signin-block')]"));
		frmtxt.click();
	 
		WebElement totxt = driver.findElement(By.xpath("//div[contains(@id,'hc')]"));
		totxt.click();
		
	 WebElement phoenub = driver.findElement(By.xpath("(//input[contains(@id,'mobileNoInp')]"));
	 phoenub .sendKeys("7547478535");
}
}