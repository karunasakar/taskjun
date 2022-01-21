package tony.stark;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toworkout {

	
	
	
	public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace last chance\\seleniumproject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String got ="https://twitter.com/login";
		
		driver.get(got);
		
		driver.manage().window().maximize();
		
		Thread.sleep(7000);
		
		WebElement usrid =driver.findElement(By.xpath("//input[contains(@name,'text')]"));
		usrid.sendKeys("karunasakar");
		 
		WebElement clik =driver.findElement(By.xpath("(//div[@dir='auto'])[7]"));
		clik.click();
		Thread.sleep(3000);
		
		WebElement paswod= driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		paswod.sendKeys("nniohfoje");
		
		
	}
}
