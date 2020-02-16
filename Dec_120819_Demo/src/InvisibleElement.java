import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InvisibleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\PS_QA\\SeleniumAuto\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		
		WebDriver driver= new ChromeDriver(options);

		driver.get("https://www.facebook.com/");
		System.out.println("Title Page"+driver.getTitle());
	}

}
