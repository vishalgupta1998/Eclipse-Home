 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://rahulshettyacademy.com/#/index");
		 * driver.findElement(By.xpath(
		 * "//header/div[2]/div[1]/div[1]/div[2]/nav[1]/div[2]/ul[1]/li[4]/a[1]"
		 * )).click();
		 * driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Vishal"
		 * ); driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
		 * "vishalgupta10oct@gmail.com");
		 * driver.findElement(By.xpath("//button[@id= \"form-submit\"]")).click(
		 * );
		 * driver.findElement(By.xpath("//a[text()='Automation Practise - 2']"))
		 * .click();
		 */
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("Vishal");
		driver.findElement(By.xpath("//input[@value='Alert']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		// System.out.println(driver.switchTo().alert().getText());
		// Thread.sleep(2000);
		// driver.quit();
	}

}
