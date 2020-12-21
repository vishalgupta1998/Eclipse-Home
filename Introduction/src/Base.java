import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Base {

	public static void main(String[] args) throws InterruptedException {

		// Declare the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// To maximize the window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Needed Vegetables
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		//open url 
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");



		//Perform addItems Method
		addItems(driver, itemsNeeded);

		//click on cart
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();

		//click on button proceed to check
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		// Thread.sleep(3000);

		//To Enter The PromoCode
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();

		//For Explicit Wait
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[contains(text(),'Code applied ..!')]")));

		//Click on the Place order button
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();

		// Select Country from the dropdown
		Select s2 = new Select(driver.findElement(By.xpath("//Select[@style='width: 200px;']")));
		s2.selectByVisibleText("Australia");
		
		driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		String test=driver.findElement(By.xpath("//a[text()='Home']")).getText();
		Assert.assertEquals(test, "Home");
		System.out.println("Assert Pass");
		
		String str=  driver.getCurrentUrl();
		System.out.println(str);
	
		
		driver.quit();

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded)

	{

		//    ((//div[@class='product'])[1]//following::a[text()='+'])[1]

		//Storing products   in list
		for(int s=0;s<=2;s++)
		{
			driver.findElement(By.xpath("(//div[@class='product'][1]//following::a[@class='increment'])[1]")).click();
			System.out.println("Added Brocolli");
			
		}
		for(int l=0;l<1;l++)
		{
			driver.findElement(By.xpath("//div[@class='products']//div[1]//following::a[@class='decrement']")).click();
			System.out.println("Removed Brocolli");
			
		}
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++)

		{

			// Brocolli - 1 Kg
			// Brocolli, 1 kg

			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim();

			// format it to get actual vegetable name
            // convert array into array list for easy search
			// check whether name you extracted is present in arrayList or not-

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName))

			{
                int j=0;
				j++;

				// click on Add to cart
				

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length)

				{

					break;

				}
			}
			
			

		}

	}
}










//Thank you, your order has been placed successfully You'll be redirected to Home page shortly!!
		/*
		String Successmessage="Thank you, your order has been placed successfully You'll be redirected to Home page shortly!!";
		//String Xpatht = '"//contains[text(),'Thank you,']).x findElement(By.xpath("//contains[text(),'Thank you,']"))
		 * */
		 
		