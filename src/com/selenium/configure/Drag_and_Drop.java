package com.selenium.configure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\msedgedriver.exe");
	 
	WebDriver driver = new EdgeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	
	WebElement debit = driver.findElement(By.xpath("//a[text() =' BANK '] "));
	
	WebElement Debit2 = driver.findElement(By.className("placeholder"));
	Thread.sleep(1000);
	Actions a = new Actions(driver);
	a.dragAndDrop(debit, Debit2).perform();
	
	WebElement amount = driver.findElement(By.xpath("//a[text() = ' 5000 ']"));
	WebElement amount1 = driver.findElement(By.className("placeholder"));
	a.dragAndDrop(amount, amount1).perform();
	
	WebElement sales = driver.findElement(By.xpath("//a[text() = ' SALES ']"));
	WebElement sales1 = driver.findElement(By.className("placeholder"));
	a.dragAndDrop(sales, sales1).perform();
	
	WebElement amt = driver.findElement(By.xpath("//a[text() = ' 5000']"));
	WebElement amt1 = driver.findElement(By.className("placeholder"));
	a.dragAndDrop(amt, amt1).perform();
	Thread.sleep(4000);
	
	WebElement text = driver.findElement(By.xpath("//a[text() = 'Perfect!']"));
	String attribute = text.getAttribute("text");
	System.out.println(attribute);
}
}
