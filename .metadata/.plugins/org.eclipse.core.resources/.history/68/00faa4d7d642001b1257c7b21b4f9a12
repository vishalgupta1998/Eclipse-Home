package SSLcertificates;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Brokenlinksdemo {

	public static void main(String[] args) throws MalformedURLException, IOException {
	     
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> Links = driver.findElements(By.xpath("//li[@class='gf-li']//a"));
		for(WebElement Link : Links)
		{
			String url = Link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respcode =conn.getResponseCode();
			System.out.println(respcode);
			if(respcode>400)
			{
				System.out.println("The link text :"+Link.getText()+"is broken with code"+respcode);
				Assert.assertTrue(false);
			}
		}

	}

}
