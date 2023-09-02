package com.selenium.configure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locate_Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.facebook.com/");
		
		//to maximize window
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		
	WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("saran@gmail.com");
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("Saran@1234");
		
		Thread.sleep(2000);
	WebElement login = driver.findElement(By.xpath("//button[@value='1']"));
		login.click();
		Thread.sleep(4000);
		
		//WebElement Create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	//	Create.click();
		
		//to minimize
		//driver.manage().window().minimize();
		
		// to close the current tab
	
			}
}
