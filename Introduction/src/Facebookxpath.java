import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://facebook.com");
		// Xpath SYNTAX
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Vishalgupta10oct@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("ASDFFHHJ@123");
		// driver.findElement(By.xpath("//button[@value='1']")).click();

		// CSS Selector SYNTAX
		// System.out.println(driver.findElement(By.cssSelector("div[id='error_box']")).getText());

		// driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.cssSelector("a._97w4")).click();
	}

}
