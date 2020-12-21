package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base {
	   
	   public WebDriver driver;
	   @Test
	   public WebDriver base() throws IOException
	   {
		   
	FileInputStream fis = new FileInputStream("C:\\Users\\pc\\workspace\\AllInOne\\src\\main\\java\\Resources\\Demo.properties");
	Properties prop =new Properties();
     
	prop.load(fis);
	String Browser_name=prop.getProperty("Browser");
	System.out.println(Browser_name);
	if(Browser_name.contentEquals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.3.0");
	}
	else if(Browser_name.contentEquals("Firefox"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Documents\\chromedriver.exe");
		//driver = new Firefox();
	}
	//return driver;
	return driver;
	
	
//	
//	driver=new ChromeDriver();

}
}