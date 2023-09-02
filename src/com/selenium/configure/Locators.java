package com.selenium.configure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
ChromeOptions option = new ChromeOptions();
option.addArguments("--remote-allow-origins=*");

	WebDriver driver = new ChromeDriver(option);
	driver.get("https://www.facebook.com/");
	
	//returntype generate for driver.findelement
	WebElement W = driver.findElement(By.id("email"));
	
	W.sendKeys("Saran@gmail.com");
	
	WebElement password = driver.findElement(By.id("pass"));
	
	password.sendKeys("23#$#45");
	
	
}
}