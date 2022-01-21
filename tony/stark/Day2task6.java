package tony.stark;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2task6 {
  
	
	public static void main (String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace last chance\\seleniumproject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://www.facebook.com/");
	
		driver.manage().window().maximize();
        
	 
		 
		WebElement frmtxt = driver.findElement(By.xpath("//input[@id='email']"));
		frmtxt.sendKeys("875657567");
	 
		WebElement totxt = driver.findElement(By.xpath("//input[@id='pass']"));
		totxt.sendKeys("87637huigfc ");
		
		WebElement clibtn = driver.findElement(By.xpath("//button[contains(@name,'login')]"));
		clibtn.click();
		
		
		
	}
	
	
	
}
