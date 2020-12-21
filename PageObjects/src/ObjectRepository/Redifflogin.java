package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Redifflogin {

	
		
		
		WebDriver driver;
		public Redifflogin(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;	
		}

		
		
		By Username = By.xpath("//input[@id='login1']");
		By Password = By.name("passwd");
		
		
	
		public WebElement username()
		{
			return driver.findElement(Username);
		}
		
		
		
		

	}


