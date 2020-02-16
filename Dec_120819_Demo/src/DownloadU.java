import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadU {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\PS_QA\\SeleniumAuto\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		//driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		//upload
		driver.get("http://demo.automationtesting.in/FileUpload.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"input-4\"]")).sendKeys("C:\\Users\\Cezar\\Downloads\\info.pdf");
		
		
		/*driver.findElement(By.id("textbox")).sendKeys("JavaSel");
		driver.findElement(By.id("createtxt")).click();
		
		driver.findElement(By.id("pdfbox")).sendKeys("second text");
		driver.findElement(By.xpath("//*[@id=\"createPdf\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"pdf-link-to-download\"]")).click();*/
		
	}
}
		
		
	