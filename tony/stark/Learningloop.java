package tony.stark;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learningloop {

	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace last chance\\seleniumproject\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	String link ="https://www.redbus.in/";
	 
		driver.get(link);
		
	driver.manage().window().maximize();
    driver.findElement(By.xpath("(//input[contains(@class,'db')])[3]")).click();
	
	WebElement tabl =driver.findElement(By.tagName("table"));
	
	List<WebElement> trow =driver.findElements(By.tagName("tr"));
	
	WebElement prirow = trow.get(6);
	
		List <WebElement> tdatacoco = driver.findElements(By.tagName("td"));
		
	 for (int i = 0; i < tdatacoco.size(); i++) {
		WebElement data= tdatacoco.get(i);
		String txtx =data.getText();
		
		if (txtx.equals(28)) {
			
		}
	}
	
		
	}
	
}
