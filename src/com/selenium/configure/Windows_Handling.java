package com.selenium.configure;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Windows_Handling {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	ChromeOptions ops = new ChromeOptions();
	ops.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(ops);
	
	driver.get("https://www.snapdeal.com/");
	WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search products & brands']"));
	search.sendKeys("Game of Thrones Book",Keys.ENTER);
	Thread.sleep(2500);
	WebElement book = driver.findElement(By.xpath("//img[@title='GAME OF THRONES']"));
	book.click();
	//to get parent window
	String par = driver.getWindowHandle();
	System.out.println(par);
	//to get all windows
	Set<String> all = driver.getWindowHandles();
	System.out.println(all);
	
	//using for each
	for (String c : all) {
		if (!par.equals(c)) {
			driver.switchTo().window(c);
		}
	}
	WebElement cart = driver.findElement(By.xpath("//span[text()='add to cart']"));
	cart.click();
	
	
	
	
	
	
	
	
}
}
