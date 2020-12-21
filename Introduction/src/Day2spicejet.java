import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day2spicejet {
	@Test(priority = 1)
	public void test() throws InterruptedException {
		// Declare the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		
		// To maximize the window
		driver.manage().window().maximize();

	

		// for 'Departure City' dropdown menu
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		Thread.sleep(3000);

		// Second way
		/*
		  driver.findElement(By.cssSelector("select[name*='destinationStation1'
		  ] a[text()*='Bengaluru (BLR)']")).click();
		 */

		// for arrival dropdown
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(3000);

		// to check Return Date picker is enabled or not
		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		//To check the attribute value return date picker equal to 1
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		{

			System.out.println("its enabled");

			Assert.assertTrue(true);

		}

		else

		{
            //  When attribute return Date picker value not equal to 1
			Assert.assertTrue(false);

		}

		
		// to click on the current date
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();

		
		// select currency
		Select s1 = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s1.selectByValue("BDT");
		
		// driver.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency
		// "));
		Thread.sleep(2000);

		// For select passengers
		driver.findElement(By.xpath("//div[@class='paxinfo']")).click();

		Select s2 = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		s2.selectByValue("2");
		Select s3 = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']")));
		s3.selectByValue("2");

		Thread.sleep(2000);

		//  click the friendsandfamily checkbox
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();

		Thread.sleep(2000);
		//click the search button
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		//Get Url
		String Url = driver.getCurrentUrl();
		System.out.println("Page Redirect To Following URL:" +Url);
				
		driver.quit();

	}

}
