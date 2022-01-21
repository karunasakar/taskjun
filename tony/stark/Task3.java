package tony.stark;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Task3 {

	public static void main (String[]args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Admin\\eclipse-workspace last chance\\seleniumproject\\driver\\IEDriverServer.exe");
		
		WebDriver dri = new InternetExplorerDriver();
		
		String p = "https://www.instagram.com/accounts/login/";
		dri.get(p);
		
	
		String title = dri.getTitle();
		System.out.println(title);
		
		String curl = dri.getCurrentUrl();
		System.out.println(curl);
		
		boolean y = p.equals(curl);
		System.out.println(y);
		
		if (y) {
			System.out.println("url pass");
		} else {
			System.out.println("denied");
		}	
			dri.close();
			
		}
		
		
		
		
	}
	
	

