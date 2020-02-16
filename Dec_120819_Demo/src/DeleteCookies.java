import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\PS_QA\\SeleniumAuto\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.get("https://www.expedia.com/");
		//way 1
		//driver.manage().deleteAllCookies();
		// way 2
		driver.navigate().to("https://www.expedia.com/");
		driver.manage().deleteCookieNamed("test@yahoo.com");
		
		Set<Cookie> cookiestorage = driver.manage().getCookies();
		for(Cookie getcookies:cookiestorage) {
			System.out.println(getcookies);
			
		}
				

	}

}
