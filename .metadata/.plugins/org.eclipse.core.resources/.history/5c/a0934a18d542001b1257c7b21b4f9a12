package Testcasesdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.Redifflogin;

public class Testcase {

	
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		Redifflogin rd =new Redifflogin(driver);
		rd.username().sendKeys("hello");
		Thread.sleep(1000);
		driver.close();
		 
		

	}

}
