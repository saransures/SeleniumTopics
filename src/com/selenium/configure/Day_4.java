package com.selenium.configure;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import sun.print.resources.serviceui;

public class Day_4 {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\msedgedriver.exe");

	WebDriver driver = new EdgeDriver();
	//1.Green Technology
	
	driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	WebElement word = driver.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centers in Chennai']"));
	String text = word.getText();
	System.out.println(text);	
	
	
//	ChromeOptions opt = new ChromeOptions();
//	opt.addArguments("--remote-allow-origins=*");
//	WebDriver driver = new ChromeDriver(opt);
	
	//2. GT
/*	driver.get("https://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	WebElement tab = driver.findElement(By.xpath("//a[@role='tab'][1]"));
	tab.click();
	Thread.sleep(2000);
	WebElement para = driver.findElement(By.xpath("//p[contains(text(),'400+')]"));
	String text = para.getText();
	System.out.println(text);	*/
	
	
	//3.GT - adayar
/*	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();

	WebElement findadyaraddress= driver.findElement(By.xpath("(//ul[@class='address'])[1]"));
	System.out.println("Print the adayar branch address");
	System.out.println(findadyaraddress.getText());
	
	System.out.println();
	System.out.println("OMR branch");
	WebElement omr = driver.findElement(By.xpath("(//p[@class='mail-info'])[3]"));
	System.out.println(omr.getText()); 	*/
	
	//4. GT - OMR
	
/*	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	WebElement omr = driver.findElement(By.xpath("(//p[@class='mail-info'])[3]"));
	System.out.println(omr.getText());	*/
	
	
	//5. GT - Para
/*	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	WebElement overview = driver.findElement(By.xpath("(//a[@role='tab'])[3]"));
	overview.click();
	Thread.sleep(2000);
	WebElement para = driver.findElement(By.xpath("(//p[contains(text(),'Selenium')])[2]"));
	System.out.println(para.getText());	*/
	
	
	//6. FB
/*	driver.get("https://www.facebook.com/ ");
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("Saran@123");
	
	String attribute = email.getAttribute("value");
	System.out.println(attribute);
	
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("Lizzy_Love");
	
	String attribute2 = pass.getAttribute("value");
	System.out.println(attribute2);	*/
	
	//7. GT
/*	driver.get("http://www.google.com/");
	WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
	search.sendKeys("greens velmurugan");
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	
	WebElement link = driver.findElement(By.xpath("//h3[contains(text(),'Velmurugan')][1]"));
	link.click();	*/
	
	
	//8.adactinhotelapp
/*	driver.get("http://adactinhotelapp.com/");
	WebElement id = driver.findElement(By.id("username"));
	id.sendKeys("Saran@123");
	
	String id1 = id.getAttribute("value");
	System.out.println(id1);
	
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("Lizzy_Love");
	
	String pass2 = pass.getAttribute("value");
	System.out.println(pass2);	*/
	
	//9. Snapdeal
/*	driver.get("https://www.snapdeal.com/ ");
	WebElement name = driver.findElement(By.className("keyword"));
	name.sendKeys("star");
	WebElement search = driver.findElement(By.xpath("//span[text()='Search']"));
	search.click();
	
	WebElement pdt = driver.findElement(By.xpath("//img[@class='product-image '] [1]"));
	pdt.click();	*/
	
	
	
	//10. flipkart
	
/*	driver.get("https://www.flipkart.com/ ");
	WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	close.click();
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("Gift");
	WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
	button.click();
	Thread.sleep(1500);
	WebElement item = driver.findElement(By.xpath("(//div[@class='_4ddWXP'])[1]"));
	item.click(); 	*/
				
	//11. flipkart
	
/*	driver.get("https://www.flipkart.com/ ");
	WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	user.sendKeys("9965266386");
	System.out.println(user.getAttribute("value"));	*/
	
	//12. Shopclues
	
/*	driver.get("https://www.shopclues.com/wholesale.html");
	WebElement search = driver.findElement(By.xpath("//input[@onfocus='autoComplete()']"));
	search.sendKeys("Harry Potter comics book");
	
	WebElement btn = driver.findElement(By.xpath("//a[@onclick='searchTrigger()']"));
	btn.click();
	
	WebElement book = driver.findElement(By.xpath("(//a[@target='_blank'])[12]"));
	book.click();	*/
	
	
	
	
	
	
	
	
	
	
	
}
}
