import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/#/index");
		driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[2]/nav[1]/div[2]/ul[1]/li[4]/a[1]")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Vishal");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vishalgupta10oct@gmail.com");
		driver.findElement(By.xpath("//button[@id= \"form-submit\"]")).click();
		driver.findElement(By.xpath("//a[text()='Automation Practise - 2']")).click();

		Thread.sleep(2000);
		driver.quit();
		/*
		public class Base {

			public static void main(String[] args) throws InterruptedException{
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Documents\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
				Thread.sleep(3000);
				String itemsneeded[]={"Brocolli","Cucumber"};
				List<String> itemsNeededList = Arrays.asList(itemsneeded);
				
				
				
				List<WebElement> products = driver.findElements(By.cssSelector("h.product-name"));
				
			    
				
				for(int i=0;i<=products.size();i++)
				{
					String[] proname =products.get(i).getText().split("-");
					String formattedName =proname[0].trim();
					
					
					if(itemsNeededList.contains(formattedName))

				       int j=0;
					{    j++;
						driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					System.out.println("hin");
					}
					}
					
				}

		}

		*/
		
		
		
		
		
		
		
		
		
	}

}
