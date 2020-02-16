package Helper;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browserNa, String urls)
	
	{
		if(browserNa.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserNa.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\PS_QA\\SeleniumAuto\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserNa.equals("IE"))
		{
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get("");
		return driver;
		
		}
	}


