import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\PS_QA\\SeleniumAuto\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// switching to a frame
		driver.switchTo().frame(0);
		
		WebElement drag=driver.findElement(By.id("draggable"));
		
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions action= new Actions(driver);
		
		action.clickAndHold(drag).moveToElement(drop).release().build().perform();

	}

}
