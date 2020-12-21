package Javastream;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SourceType;

public class test2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Documents\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Veg/fruit name']")).click();
		List<WebElement> listelements =driver.findElements(By.xpath("//tr/td[1]"));
		List <String> newlist = listelements.stream().map(s->s.getText()).collect(Collectors.toList());
	    //listelements.forEach(s->System.out.println(s));
		newlist.stream().sorted().forEach(s->System.out.println(s));
		
		List<Object> updatedlist =listelements.stream().filter(s->s.getText().contains("Beans")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
		updatedlist.forEach(l->System.out.println(l));
		
		
	}

	private static Object getPriceVeggie(WebElement s) {
		String price= s.findElement(By.xpath("following-sibling::td[1]")).getText();
		int j =Integer.parseInt(price);
		return j;
		
	}
	

}
