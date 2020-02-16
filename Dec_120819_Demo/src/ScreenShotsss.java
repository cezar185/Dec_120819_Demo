import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class ScreenShotsss {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\PS_QA\\SeleniumAuto\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");	
		
File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

FileHandler.copy(srcfile, new File("C:\\Users\\Cezar\\Desktop\\PorScreenShots\\amazon_home.png"));


	}

}
