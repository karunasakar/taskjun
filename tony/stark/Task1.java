package tony.stark;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace last chance\\seleniumproject\\driver\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		String r ="https://www.instagram.com/accounts/login/";
		d.get(r);
		
		String title= d.getTitle();
		System.out.println(title);
		 
		String curl = d.getCurrentUrl();
		System.out.println(curl);
		
		boolean e = r.equals(curl);
		System.out.println(e);
		
		if(e) {
			System.out.println("url pass");
		} else {
			System.out.println("url failed");
		}
		d.close();
		
		
		
		
	}
	
}
