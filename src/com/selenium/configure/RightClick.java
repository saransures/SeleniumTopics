package com.selenium.configure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", 
			"C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.google.com/");
	WebElement Gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
	
	Actions a = new Actions(driver);
	a.contextClick(Gmail).perform();
	
	
	
	
	
}
}
