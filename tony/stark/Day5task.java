package tony.stark;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5task {

	public static void main (String[]args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace last chance\\seleniumproject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String cpy = " https://www.redbus.in/";
		driver.get(cpy);
		
		driver.manage().window().maximize();
		
		WebElement totext=  driver.findElement(By.xpath("//input[@id='dest']"));
		String txt = "chennai";
		totext.sendKeys(txt);
		
		String locati =totext.getAttribute("value");
		System.out.println(locati);
		
		if (locati.equals(txt)) {
			System.out.println("passed");
		} else {
	   System.out.println("failed");
		}
WebElement toext =		driver.findElement(By.xpath("//label[text()='TO']"));
String yup = toext.getText();
System.out.println(yup);
}
}