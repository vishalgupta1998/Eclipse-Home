package MulipleWindows;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

import java.io.IOException;

import java.util.Iterator;

import java.util.Set;



//import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.WindowType;

import org.openqa.selenium.chrome.ChromeDriver;


import java.util.*;

public class WindowHandler {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
//		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> lps=driver.getWindowHandles();
	    Iterator<String> itr = lps.iterator();
	    String parentid = itr.next();
	    String childid = itr.next();
	    driver.switchTo().window(childid);
	   String hey= driver.findElement(By.xpath("//a[contains(@href,'https://courses.rahulshettyacademy.com/p/core-java-for')][1]")).getText();
	   driver.switchTo().window(parentid);
	   WebElement name=driver.findElement(By.xpath("//input[@name='name']"));
	   name.sendKeys(hey);
//	   File src =((TakesScreenshot)driver)
//	  File file= name.getScreenshotAs(OutputType.FILE);
//	 FileUtils.copyFile(srcFile, destFile);
	   
		

	}

}
