package tony.stark;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windohandle {

	public  static void main (String []args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace last chance\\seleniumproject\\driver\\chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys("Apple mobiles");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		  driver.findElement(By.xpath("(//div[contains(@class,'rR')])[4]")).click();
		 
		
	
		//to handle parent
		//String pwiw = driver.getWindowHandle();
		
		Set<String> alwind =driver.getWindowHandles();
		
		//for(String f :alwind) {
		//	if (!f.equals(pwiw)) {
		//		driver.switchTo().window(f);
			//}
	//	}
		List<String> e = new ArrayList<>();
		e.addAll(alwind);
		String cwin = e.get(1);
		driver.switchTo().window(cwin);
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		
	}
	
	
	
}
