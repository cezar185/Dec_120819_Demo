package com.app.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.app.Pages.loginAP;

import Helper.BrowserFactory;

public class VerifyValidLogin {

		@Test
		public void CheckUser()
		{
			//this will launch the browser and hit url
			WebDriver driver=BrowserFactory.startBrowser("Chrome", "http://automationpractice.com/index.php?controller=authentication&back=my-account");
			//Created page object using page Factory						
			loginAP login_page=PageFactory.initElements(driver, loginAP.class);
			//Call the method
			login_page.login_apsite("testj3913@gmail.com", "abc123");
		}
		
}
