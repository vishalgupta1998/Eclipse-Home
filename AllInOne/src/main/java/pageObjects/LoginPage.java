package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resources.Base;

public class LoginPage {
	public WebDriver driver;
	
	
	/*public LandingPage(WebDriver driver) throws IOException
	{
		Base accessDriver= new Base();
		WebDriver driver =accessDriver.base();
		//By signInbutton =By.cssSelector("a[href*='sign_in'] span");
		
		
	}*/
	
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	By email =By.id("user_email");
	By pass =By.id("user_password");
	By login =By.xpath("//input[@name='commit' and @value='Log In']");
	
	public WebElement email()
	{
	WebElement emaildata=driver.findElement(email);
	
	
	return emaildata;
	
	}
	
	public WebElement pass()
	{
	WebElement passdata=driver.findElement(pass);
	
	
	return passdata;
	
	}
	
	public WebElement login()
	{
	WebElement logindata=driver.findElement(login);
	
	
	return logindata;
	
	}
}
