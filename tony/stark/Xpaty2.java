package tony.stark;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaty2 {

	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace last chance\\seleniumproject\\driver\\chromedriver.exe");
		
		WebDriver driv = new ChromeDriver();
		
		driv.get(" https://www.cleartrip.com/trains");
		 
		driv.manage().window().maximize();
		
		WebElement frotxt = driv.findElement(By.xpath("//input[@name='from_station']"));
		frotxt.sendKeys("pattukkot");
		
		WebElement ttotxt = driv.findElement(By.xpath("//input[@title='To station']"));
		ttotxt.sendKeys("chennai Beach");
		
		
		WebElement btntxt = driv.findElement(By.xpath("//select[@tabindex='3']"));
		btntxt.sendKeys("first class");
		
		
		WebElement dtdtxt = driv.findElement(By.xpath("//input[@size='14']"));
		dtdtxt.sendKeys("15 12 2021");
		
		
		WebElement settxt = driv.findElement(By.xpath("//select[@name='adults']"));
		settxt.sendKeys("2");
		

		WebElement setttxt = driv.findElement(By.xpath("//select[@name='children']"));
		setttxt.sendKeys("2");
		
		WebElement septtxt = driv.findElement(By.xpath("//select[@name='male_seniors']"));
		septtxt.sendKeys("2");
		

		WebElement septuxt = driv.findElement(By.xpath("//select[@name='female_seniors']"));
		septuxt.sendKeys("2");
		
		WebElement stuxt = driv.findElement(By.xpath("//button[@type='submit']"));
		stuxt.click();
		
	}
	
	
}
