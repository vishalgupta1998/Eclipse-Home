package TableExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TableExercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement table =driver.findElement(By.xpath("//table[@id='product']"));
		int rowcount=table.findElements(By.tagName("tr")).size();
		int columncount=table.findElements(By.xpath("//tr[2]//td")).size();
		System.out.println(rowcount);
		System.out.println(columncount);
		WebDriverWait w = new WebDriverWait(driver,5); 
		System.out.println(table.findElement(By.xpath("//tr[4]//td[2]")).getText());
		driver.close();

	}

}
