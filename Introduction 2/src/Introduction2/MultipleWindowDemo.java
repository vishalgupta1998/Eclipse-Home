package Introduction2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        String Urlgoogle = "https://accounts.google.com/signin/v2/identifier?hl=en&passive=true&continue=https%3A%2F%2Fwww.google.com%2F&ec=GAZAAQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Urlgoogle);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("*[target='_blank'] ")).click();
		System.out.println(driver.getTitle());
		
		
		Set<String> id = driver.getWindowHandles();
		Iterator<String> itr=id.iterator();
		String Parentid =itr.next();
		String Childid =itr.next(); 
		driver.switchTo().window(Parentid);
		
		
		

	}

}
