package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://web.easyinvoiceapp.com/auth/register");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("Email")).sendKeys("tererer@yopal.com");
	    driver.findElement(By.name("Password")).sendKeys("Hello@123");
	    driver.findElement(By.xpath("//input[@id='lvdajuedo']")).sendKeys("Hello@123");
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	    driver.findElement(By.name("Register")).click();
	    
  }
}
