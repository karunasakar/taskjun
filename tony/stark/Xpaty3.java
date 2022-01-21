package tony.stark;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaty3 {
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace last chance\\seleniumproject\\driver\\chromedriver.exe");
		
		WebDriver driv = new ChromeDriver();
		
		driv.get(" https://www.irctc.co.in/nget/train-search");
		 
		driv.manage().window().maximize();
		
		WebElement frotxt = driv.findElement(By.xpath("//a[contains(@aria-label,'Click here to r')]"));
		frotxt.click();
		
		WebElement ttotxt = driv.findElement(By.xpath("//div[contains(@aria-label,'male')]"));
		ttotxt.click();
		
		
	 
	}	
}
