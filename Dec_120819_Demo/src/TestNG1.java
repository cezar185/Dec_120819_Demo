import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	WebDriver driver;
	// pre condition
	@BeforeTest
	public void OpenBrowser() { // name of the test
	driver.get("https://www.facebook.com/");// place your script here for testing
	System.out.println("Browser Opened");

	}

	   @Test(enabled= false,priority=0, description= "This is a mandatory step", testName= "Smoke")
	   public void Firsname() { // name of the test, priority to set which sequence test will be executed.
	  System.out.println("write first name");
	 
	 
	 
	   }
	   
	   @Test(priority=1)
	   public void login() {
	  // your code here
	  System.out.println("Login Success");
	 
	   }

	   @Test
	   public void PrepareEmail() {
	  //your code here
	  System.out.println("create mail");
	 
	   }
	   
	   @Test
	   public void Signout() {
	  System.out.println("Sign out Successful");
	 
	   }

	   @AfterTest
	   public void Closebrower() {
	  System.out.println("Browser closed");
	 
	   }

	}


