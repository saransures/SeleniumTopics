package com.selenium.configure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Debug {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", 
			"C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\msedgedriver.exe");

	WebDriver driver = new EdgeDriver();
	driver.get("https://www.facebook.com/");
	WebElement crbtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
	crbtn.click();
	Thread.sleep(3000);
	WebElement malebtn = driver.findElement(By.xpath("//input[@type='radio']"));
	malebtn.click();

}
}
