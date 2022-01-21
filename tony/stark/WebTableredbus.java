package tony.stark;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableredbus {

	
	public static void main (String[]args ) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace last chance\\seleniumproject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	String link ="https://www.redbus.in/";
	 
		driver.get(link);
		
	driver.manage().window().maximize();
	//short click for date
	driver.findElement(By.xpath("(//input[contains(@class,'db')])[3]")).click();
	
	WebElement tabl =driver.findElement(By.tagName("table"));
	
	List<WebElement> trow =driver.findElements(By.tagName("tr"));
	
	WebElement partirow = trow.get(6);
	
	List<WebElement> tdatacolo =driver.findElements(By.tagName("td"));
	
	for (int i = 0; i < tdatacolo.size(); i++) {
		WebElement data = tdatacolo.get(i);
		String k = data.getText();
		
		
		if (k.equals("28")) {
			data.click();
			break;
		}
	}
	

	
	
	
 
	}
	
}
