package tony.stark;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Task2 {

	public static void main(String[]args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\eclipse-workspace last chance\\seleniumproject\\driver\\geckodriver.exe");
	
		WebDriver w = new  FirefoxDriver();
		
		String u= "https://www.quora.com/";
		w.get(u);
		
	   String title=w.getTitle();
	   System.out.println(title);
	   
	   String curl = w.getCurrentUrl();
	   System.out.println(curl);
	   
	   boolean r = u.equals(curl);
	   System.out.println(r);
	   
	   if  (r) {
		   System.out.println("url pass");
	   } else {
		   System.out.println("denied");
	   }
	 
	   w.close();
	   
		
		
		
		
		
		
		
		
	}
	
	
	
}
