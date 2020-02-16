package com.app.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginAP {
	
	WebDriver Driver;
	public loginAP(WebDriver pdriver)
	{
		this.Driver=pdriver;
	}
	//option 1
	@FindBy(id="email")
	WebElement username;
	//option 2
	@FindBy(how= How.ID,using="passwd")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"SubmitLogin\"]/span")
	WebElement SignIn_button;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"login_form\"]/div/p[1]/a")
	WebElement forgetPassword;
	
		public void login_apsite(String uid, String passs)
		{
			username.sendKeys(uid);
			password.sendKeys(passs);
			SignIn_button.click();
		}
	
}
