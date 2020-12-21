package Calendar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.id("travel_date")).click();
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		List<WebElement> l1=driver.findElements(By.className("day"));
		int count = driver.findElements(By.className("day")).size();
		for(int i=0;i<count;i++)
		{
			String s2=driver.findElements(By.className("day")).get(i).getText();
			if(s2.equalsIgnoreCase("28"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
			
			
			
		}
		Thread.sleep(4000);
		driver.close();
		
		
	}

}
