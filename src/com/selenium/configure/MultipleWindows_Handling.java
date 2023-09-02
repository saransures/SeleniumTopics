package com.selenium.configure;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleWindows_Handling {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	ChromeOptions ops = new ChromeOptions();
	ops.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(ops);
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	WebElement search = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
	search.sendKeys("Remote cars",Keys.ENTER);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//img[@class='product-image '])[1]")).click();
	Thread.sleep(1000);

	String parent = driver.getWindowHandle();
	Set<String> all = driver.getWindowHandles();
	
	//multiple windows handling using count
	int count=0;
	for (String x : all) {
		if (count==1) {
			driver.switchTo().window(x);
		}
		count++;
	}
	driver.findElement(By.xpath("//span[text()='add to cart']")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//p[text()='TrustPay']")).click();
	Thread.sleep(1000);
	
	String parent1 = driver.getWindowHandle();
	Set<String> all1 = driver.getWindowHandles();
	
	int count1 =0;
	for (String a : all1) {
		if (count1==2) {
			driver.switchTo().window(a);
		}
		count1++;
	}
	Thread.sleep(2000);
	WebElement text = driver.findElement(By.xpath("//h2[text()='WHAT DOES TRUSTPAY STAND FOR?']"));
	System.out.println(text.getText());
	
	WebElement Scrolldown = driver.findElement(By.xpath("//a[text()='RAISE A COMPLAINT']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", Scrolldown);
	
	driver.findElement(By.xpath("//p[text()='Help Center']")).click();
	
	String Parent2 = driver.getWindowHandle();
	Set<String> all2 = driver.getWindowHandles();
	//Multiple window handles using List
	
	List<String> l = new ArrayList<>();
	l.addAll(all2);
	driver.switchTo().window(l.get(3));
	
	WebElement faq = driver.findElement(By.xpath("//div[contains(text(),'Top FAQs')]"));
	System.out.println(faq.getText());	
	
	
}
}
