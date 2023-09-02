package com.selenium.configure;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecutor {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	ChromeOptions ops = new ChromeOptions();
	ops.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(ops);
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement txtUser = driver.findElement(By.id("email"));
	txtUser.click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[1].setAttribute('value',('Suresh@123','Lizzy@123'))", txtUser);
}
}
