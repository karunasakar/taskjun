package tony.stark;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	
	public static void main(String[]args) {
		//browser and path
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace last chance\\seleniumproject\\driver\\chromedriver.exe");
	
	 // to open browser must interface obeject itself
	 WebDriver dri = new ChromeDriver();
	 
	 //url
	 dri.get("https://www.facebook.com/");
	
	 // to get current title
	String title = dri.getTitle();
	System.out.println(title);
	
	//to get current url
	String curl = dri.getCurrentUrl();
	System.out.println(curl);
	
	//	to quit browser
	dri.close();
}
}