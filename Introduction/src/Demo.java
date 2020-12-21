import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());

		driver.get("http://yahoo.com");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		// driver.navigate().forward();
		driver.close();// it closes current browsers
		// driver.quit();// It Closes all browsers
	}

}

/*
 * public static void main(String[] args) {
 * System.setProperty("webdriver.chrome.driver","//Users//nikks//chromedriver");
 * WebDriver driver = new ChromeDriver(); String baseUrl =
 * "http://www.facebook.com"; String tagName = "";
 * 
 * driver.get(baseUrl); tagName =
 * driver.findElement(By.id("email")).getTagName(); System.out.println(tagName);
 * driver.close(); System.exit(0); } }
 */