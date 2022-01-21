package tony.stark;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day6task {

	public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace last chance\\seleniumproject\\driver\\chromedriver.exe");
		
		WebDriver driv = new ChromeDriver();
		
		String cpy = "http://demo.guru99.com/test/drag_drop.html";
		driv.get(cpy);
		
		String titl = driv.getTitle();
		System.out.println(titl);
		
		String curl= driv.getCurrentUrl();
				System.out.println(curl); 
				
		driv.manage().window().maximize();
	 
		WebElement source1 =  driv.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement target1 = driv.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Thread.sleep(5000);
		Actions botn1 = new Actions(driv);
		botn1.dragAndDrop(source1, target1).perform();
		
		WebElement source2 = driv.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement target2 = driv.findElement(By.xpath("(//li[@cass='placeholder'])[1]"));
		Actions botn2 = new Actions(driv);
		botn2.dragAndDrop(source2, target2).perform();
		
		
		WebElement source3 =driv.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement target3 =driv.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Actions botn3 = new Actions(driv);
		botn3.dragAndDrop(source3, target3).perform();
		
		
		WebElement source4 = driv.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement target4 = driv.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Actions botn4 = new Actions(driv);
		botn3.dragAndDrop(source4, target4).perform();
		
		WebElement fin= driv.findElement(By.xpath("//a[text()='Perfect!']"));
		String pri = fin.getText();
		String voc ="Perfect!";
		
		//boolean y =pri.equals(voc);
		
		if(pri.equals(voc)) {
			System.out.println("d&D pass");
		}else {
			System.out.println("fail");
		}
		
		
		
	}
	
	
	
	
	
}
