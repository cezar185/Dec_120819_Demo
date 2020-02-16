
		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class DateSel { //note to Faisal bhie; this code will only print the date of the month on the console.

		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\PS_QA\\SeleniumAuto\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.get("https://www.expedia.com/");


		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tab-hotel-tab-hp\"]/span[2]")).click();
		Thread.sleep(2000);

		String mon= "Mar 2020";
		String date ="20";
		driver.findElement(By.xpath("//*[@id=\'hotel-checkin-hp-hotel\']")).click();

		while (true)
		{
		String text = driver.findElement(By.xpath("//*[@id=\'hotel-checkin-wrapper-hp-hotel\']/div/div/div[3]/table/caption")).getText();


		if (text.equals(mon))
		{
		break;
		}

		else {

		driver.findElement(By.xpath("//*[@id=\'hotel-checkin-wrapper-hp-hotel\']/div/div/button[2]")).click();;
		}

		List<WebElement>allCalDate= driver.findElements(By.xpath("//*[@id=\'hotel-checkin-wrapper-hp-hotel\']/div/div/div[3]/table/tbody"));

		for (WebElement elem : allCalDate)


		{
		String date_value = elem.getText();
		
		String day[]= date_value.split("\n");
		
		if (day[1].equals(date)) 
		{
			
			elem.click();
			break;
		}

		//System.out.println(elem.getText());
		}

		}


	}

}
