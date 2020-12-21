import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://rediff.com");
		driver.findElement(By.cssSelector("a[title*='Already a user? Sign in']")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input#password")).sendKeys("password");
		// driver.findElement(By.xpath("//a[contains(text(),'Forgotten
		// password?')]")).click();
		driver.findElement(By.xpath("//td[contains(@class='alnl')]/following-sibling::td[-1]")).click();
	}

}
