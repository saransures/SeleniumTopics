package com.selenium.configure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;



public class Alert {
public static void main(String[] args) throws InterruptedException {

	
	//System.setProperty("webdriver.edge.driver", "C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\msedgedriver.exe");
	//	WebDriver driver = new EdgeDriver();
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	ChromeOptions ops = new ChromeOptions();
	ops.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(ops);
	
	driver.get("https://demo.automationtesting.in/Alerts.html");
	
/*		WebElement Click1 = driver.findElement(By.className("analystic"));
		Click1.click();
		
		WebElement Click2 = driver.findElement(By.xpath("//button[@onclick = 'alertbox()']"));
		Click2.click();
	
		//accept method inside Alert Interface
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();	*/
	
/*	WebElement Click1 = driver.findElement(By.xpath("//a[text()= 'Alert with OK & Cancel ']"));
	Click1.click();
	WebElement Click2 = driver.findElement(By.xpath("//button[@onclick = 'confirmbox()']"));
	Click2.click();
	
	org.openqa.selenium.Alert alert = driver.switchTo().alert();
	Thread.sleep(2000);
	alert.dismiss();	*/
	
	
	WebElement Click1 = driver.findElement(By.xpath("//a[text()= 'Alert with Textbox ']"));
	Click1.click();
	WebElement Click2 = driver.findElement(By.xpath("//button[@onclick= 'promptbox()']"));
	Click2.click();
	
	org.openqa.selenium.Alert alert = driver.switchTo().alert();
	alert.getText();
	alert.sendKeys("Suresh");
	//alert.accept();
	
	
	
}
}
