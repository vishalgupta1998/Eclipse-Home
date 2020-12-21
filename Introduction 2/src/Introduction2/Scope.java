package Introduction2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS); 
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footer1 = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer1.findElements(By.tagName("a")).size());
		
		
		WebElement ColumnDriver = footer1.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(ColumnDriver.findElements(By.tagName("a")).size());
		
		
		for(int i=0;i<ColumnDriver.findElements(By.tagName("a")).size();i++)
		{
			String hey=Keys.chord(Keys.CONTROL,Keys.ENTER);
			ColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(hey);
			Thread.sleep(5000L);
		}
		
		
		Set<String> s2= driver.getWindowHandles();
		Iterator<String> itr = s2.iterator();
		
		while(itr.hasNext())
		{
		driver.switchTo().window(itr.next());
	    System.out.println(driver.getTitle());
		
		}
		

	}

}
