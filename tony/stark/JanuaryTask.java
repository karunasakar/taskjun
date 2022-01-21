package tony.stark;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.nio.file.Files;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class JanuaryTask {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace last chance\\seleniumproject\\driver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		String lik ="http://demo.guru99.com/test/drag_drop.html";
		driver.get(lik);
		driver.manage().window().maximize();
//		takescreenshot using
		TakesScreenshot j = (TakesScreenshot)driver;
		File socr = j.getScreenshotAs(OutputType.FILE);
	   File talget = new File("C:\\Users\\Admin\\eclipse-workspace last chance\\seleniumproject\\screenshot\\domo\\docx");
	   FileUtils.copyFile(socr, talget);
//	   using actions class
		WebElement blik= driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement drop =driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions ref1 = new Actions(driver);
		ref1.dragAndDrop(blik,drop).perform();
		WebElement b5000 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement drop1 =driver.findElement(By.xpath("//li[contains(@class,'placeholder' )][1]"));
		Actions ref2 = new Actions(driver);
		ref2.dragAndDrop(b5000, drop1).perform();
	    WebElement salb =driver.findElement(By.xpath("//a[text()=' SALES ']"));
	    WebElement drop2= driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	    Actions ref3 = new Actions(driver);
	    ref3.dragAndDrop(salb, drop2).perform();
	    WebElement b15000 =driver.findElement(By.xpath("//a[text()=' 5000']"));
	    WebElement drop3 =driver.findElement(By.xpath("//li[@class='placeholder']"));
	    Actions ref4 = new Actions (driver);
	    ref4.dragAndDrop(b15000, drop3).perform();
	    WebElement clik =driver.findElement(By.xpath("//a[contains(text(),'Perfect!')]"));
	    String fi = clik.getText();
	    String ho = "Perfect!";
	    if (fi.equals(ho)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	    WebElement cli =driver.findElement(By.xpath("//a[text()='Insurance Project']"));
	    Actions hope = new Actions(driver);
	    hope.moveToElement(cli).contextClick(cli).build().perform();
//	    using robot class
	    Robot auto = new Robot();
	     auto.keyPress(KeyEvent.VK_DOWN);
	     auto.keyRelease(KeyEvent.VK_DOWN);
	     auto.keyPress(KeyEvent.VK_ENTER);
	     auto.keyRelease(KeyEvent.VK_ENTER);
//	     using windows handles
	     Thread.sleep(3000);
	 String priw=  driver.getWindowHandle();
	Set<String> clwind =driver.getWindowHandles();	
	for (String po : clwind) { 
		if (!po.equals(priw)) {
			driver.switchTo().window(po);
		}
	}
   driver.findElement(By.xpath("//a[text()='Register']")).click();
   Thread.sleep(3000);
//   dropdown concept
   WebElement dropdown =driver.findElement(By.xpath("//select[@name='title']"));
    Select tony = new Select(dropdown);
    tony.selectByValue("Doctor");
    tony.selectByIndex(10);
    tony.selectByVisibleText("Master");
   
				     
	}
}







