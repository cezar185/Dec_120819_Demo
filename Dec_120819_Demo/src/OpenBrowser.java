import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\PS_QA\\SeleniumAuto\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("prosmart123@pro.com");
		driver.findElement(By.id("pass")).sendKeys("pro12345");
		driver.findElement(By.name("firstname")).sendKeys("John123");
		driver.findElement(By.name("lastname")).sendKeys("Smith");
		driver.findElement(By.name("reg_email__")).sendKeys("123456789");
		driver.findElement(By.name("reg_passwd__")).sendKeys("rockon123");
		
		Select dropdown = new Select(driver.findElement(By.id("month")));
		dropdown.selectByIndex(5);
		//add pause
		Thread.sleep(3000);
		Select dropdown2 = new Select(driver.findElement(By.id("day")));
		dropdown2.selectByIndex(10);
		
		Select dropdown3 = new Select(driver.findElement(By.id("year")));
		dropdown3.selectByValue("1985");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#u_0_9")).click();
		
		driver.findElement(By.name("websubmit")).click();
	}

}
