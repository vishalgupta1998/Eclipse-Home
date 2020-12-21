package Cricbuzz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz2 {

	public static void main(String[] args) {
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/31622/mi-vs-dc-final-indian-premier-league-2020");
		WebElement tablecontent = driver.findElement(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]"));
		int rowcount =tablecontent.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count  = tablecontent.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']//div[3]")).size();
		for (int i=1;i<count-11;i++)
		{
			String value=tablecontent.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']//div[3]")).get(i).getText();
			System.out.println("Player "+i+ " Score:"+value);
			int m=Integer.parseInt(value);
			sum= sum + m;
			System.out.println("Team Score :"+sum);
		}
		
		
		String Extras=tablecontent.findElement(By.xpath("((//div[text()='Extras'])[1]//following::div[@class='cb-col cb-col-8 text-bold cb-text-black text-right'])[1]")).getText(); 
		String l1 =Extras.trim();
		int k=Integer.parseInt(l1);
		int withExtras =sum+k;
		System.out.println("Team Extras:"+k);
		System.out.println("Team Score with extras: "+withExtras);
		
		
		
				}

}
