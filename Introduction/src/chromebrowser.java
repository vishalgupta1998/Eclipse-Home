import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		Thread.sleep(6000);
		/*
		 * driver.findElement(By.id("email")).sendKeys(
		 * "vishalgupta10oct@gmail.com");
		 * driver.findElement(By.name("pass")).sendKeys("Hello");
		 * driver.findElement(By.linkText("Forgotten password?")).click();
		 */
		driver.get("http://login.salesforce.com");
		// driver.findElement(By.name("username")).sendKeys("Vishalgupta10oct@gmail.com");
		driver.findElement(By.cssSelector("#username")).sendKeys("Vishalgupta10oct@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("abcd");

		driver.findElement(By.xpath("//*[@id='Login']")).click();
		/*
		 * driver.findElement(By.cssSelector("#forgot_password_link")).click();
		 * driver.findElement(By.cssSelector("#un")).sendKeys("Vishalgupta10oct"
		 * ); driver.findElement(By.xpath("//*[@id=\'continue\']")).click();
		 * driver.findElement(By.xpath("//*[@id=\'video-link\']")).click();
		 * driver.findElement(By.cssSelector(
		 * "//*[@id=\'playlist_container\']/div[1]/div[1]/div/button/svg")).
		 * click(); driver.findElement(By.
		 * cssSelector("#playlist_container > div.player-wrapper.black-background.splash-screen-showing.splash-showing.vy-user-inactive.vjs-user-inactive > div.splash-screen-wrapper.show > div > div"
		 * )).click();
		 */
		Thread.sleep(3000);
		// String actualmsg =
		// driver.findElement(By.xpath("//div[@id='error']")).getText();
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());

		// System.out.println(actualmsg);
	}

}
