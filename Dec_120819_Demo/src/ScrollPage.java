import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\PS_QA\\SeleniumAuto\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.get("https://www.bestbuy.com/");
		
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//1=pxile
		//js.executeScript("window, scrollBy (0,500","");
		
		//2-using element
		//WebElement social=driver.findElement(By.xpath("//*[@id=\"u_0_1\"]/div/button/span"));
		//js.executeScript("Arguments[0], scrollintoView();",social);
		
		//3-bottom of the page		
		js.executeScript("window.scrollto(0,document,body.scrollHeight)");
		
		


	}

}
