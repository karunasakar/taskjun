 package tony.stark;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4task {

	public static void main (String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace last chance\\seleniumproject\\driver\\chromedriver.exe");
		
		WebDriver driv = new ChromeDriver();
		
		driv.get(" https://www.redbus.in/");
		
		driv.manage().window().maximize();
		
		//send keys wit string
		WebElement frtxt =  driv.findElement(By.xpath(" (//input[@type='text'])[1]"));
		String from="pattukkottai";
		frtxt.sendKeys(from);
		
		//get attribute store place for pattukkottai with [value]
		String gtstorevalue =frtxt.getAttribute("value");
		 System.out.println( gtstorevalue);
		 
		 if (gtstorevalue.equals(from)) {
			 
			 System.out.println("passed");
		 }
		 else {
			 System.out.println("falid");
		 }
		 
		WebElement serbuton= driv.findElement(By.xpath("//button[text()='Search Buses']"));
		String u= serbuton.getText();
		System.out.println(u );
		
		
		
		
	}
	
	
	
	
	
	
}
