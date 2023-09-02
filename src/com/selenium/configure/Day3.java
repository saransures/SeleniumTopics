package com.selenium.configure;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day3 {
public static void main(String[] args) throws InterruptedException, AWTException  {
	System.setProperty("webdriver.edge.driver", 
			"C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\msedgedriver.exe");
	
	WebDriver driver = new EdgeDriver();
	/*1. Amazon
	driver.get("https://www.amazon.in/");
	WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	
	search.sendKeys("Iphone");
	
	WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
	button.click(); */
	
	/*2.fb
	driver.get("https://www.facebook.com/");
	WebElement Email = driver.findElement(By.xpath("//input[@autofocus='1']"));
	Email.sendKeys("Saran@123");
	
	WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	pass.sendKeys("suresh1234");
	
	WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
	button.click(); 	*/
	
	/*automation testing
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement name = driver.findElement(By.xpath("//input[@type='text'][1]"));
	name.sendKeys("Suresh");
	Thread.sleep(1000);
	
	WebElement Lname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	Lname.sendKeys("Velraj");
	
	WebElement add = driver.findElement(By.xpath("//textarea[@rows='3']"));
	add.sendKeys("Madurai");
	
	WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys("saran@123");
	
	WebElement ph = driver.findElement(By.xpath("//input[@type='tel']"));
	ph.sendKeys("9876543201");
	Thread.sleep(2000);
	
	WebElement male = driver.findElement(By.xpath("//input[@value='Male']"));
	male.click();
	Thread.sleep(2000);
	
	WebElement cri = driver.findElement(By.xpath("//input[@value='Cricket']"));
	cri.click();	*/
	
	/*4. toolsqa
	driver.get("https://toolsqa.com/selenium-training?q=banner#enroll-form");
	WebElement fn = driver.findElement(By.id("first-name"));
	fn.sendKeys("Suresh");
	
	WebElement ln = driver.findElement(By.id("last-name"));
	ln.sendKeys("Velraj");
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("Saran@123");
	Thread.sleep(1000);
	
	WebElement ph = driver.findElement(By.id("mobile"));
	ph.sendKeys("9988776655");
	
	WebElement city = driver.findElement(By.id("city"));
	city.sendKeys("Madurai");
	Thread.sleep(1000);
	
	WebElement info = driver.findElement(By.xpath("//textarea[@minlength='1']"));
	info.sendKeys("Need Info"); */
	
	/*5.CTS
	driver.get("http://greenstech.in/selenium-course-content.html");
	WebElement clk1 = driver.findElement(By.id("heading20"));
	clk1.click();
	Thread.sleep(1000);
	
	WebElement cts = driver.findElement(By.xpath("//a[contains(text(),'CTS')]"));
	cts.click();	*/
	
	//6.redbus - doubt - i'm not robot
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
WebElement dropdown = driver.findElement(By.xpath("//div[@id = 'sign-in-icon-down']"));
	
	dropdown.click();
	
	WebElement click = driver.findElement(By.id("signInLink"));
	click.click();
	Thread.sleep(1000);
	
	driver.switchTo().frame(0);
	
	WebElement mob = driver.findElement(By.xpath("//input[@type='number']"));
	mob.sendKeys("9965266386");	
	
/*	7. cleartrip	
	driver.get("https://www.cleartrip.com/trains");
	WebElement from = driver.findElement(By.xpath("(//input[@title='From station'])"));
	from.sendKeys("Madurai");
	WebElement to = driver.findElement(By.xpath("(//input[@title='To station'])"));
	to.sendKeys("Chennai");
	driver.manage().window().maximize();
	WebElement button = driver.findElement(By.xpath("(//button[@type='submit'])"));
	button.click();	*/
	
//	8. Resume - 
/*	driver.get("http://greenstech.in/selenium-course-content.html");
	
	driver.manage().window().maximize();
	
	WebElement res = driver.findElement(By.xpath("//div[@id='heading201']"));
	res.click();
	
	Thread.sleep(4000);
	
	WebElement resume1 = driver.findElement(By.xpath("//a[text()='Resume Model-1 ']"));
	resume1.click();	*/
	
//9. Flipkart -Doubt - can't enter id
/*	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	close.click();
Thread.sleep(500);
	WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
	login.click();
	
	WebElement user = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
	user.sendKeys("9965266386");
	WebElement otp = driver.findElement(By.xpath("(//button[text()='Request OTP'])"));
	otp.click();	*/
	
/*	10. Amazon	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement dd = driver.findElement(By.xpath("//select[@name='url']"));
	dd.click();
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
	search.click();	*/
	
	//11.Google
	
	/*driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	WebElement fn = driver.findElement(By.id("firstName"));
	fn.sendKeys("Suresh");
	
	WebElement ln = driver.findElement(By.id("lastName"));
	ln.sendKeys("V");
	
	WebElement user = driver.findElement(By.xpath("//input[@type='email']"));
	user.sendKeys("sureshluvlizzy");
	
	WebElement pass = driver.findElement(By.xpath("//input[@name='Passwd']"));
	pass.sendKeys("lizzy$love");
	
	WebElement con = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
	con.sendKeys("lizzy$love");*/
	

	//12. snapdeal - ph no. doubt
	
/*	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	WebElement login = driver.findElement(By.xpath("//span[text()='Sign In']"));
	
	Actions a = new Actions(driver);
	a.moveToElement(login).perform();
	Thread.sleep(2000);
	
	WebElement btn = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
	btn.click();
	
	
	driver.switchTo().frame(0);
	Thread.sleep(3000);
	WebElement ph = driver.findElement(By.id("userName"));
	ph.sendKeys("9965266386");  
	
	WebElement chk = driver.findElement(By.id("checkUser"));
	chk.click();	*/
	
	//13.
	
/*	driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
	WebElement ph = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
	ph.sendKeys("9965266386");
	
	WebElement sub = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
	sub.click();
	Thread.sleep(32000);
	sub.click();	*/
	
	
	//14. swiggy
/*	driver.get("https://www.swiggy.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	WebElement sign = driver.findElement(By.xpath("//a[text()='Sign up']"));
	sign.click();
	WebElement ph = driver.findElement(By.id("mobile"));
	ph.sendKeys("9965266386");
	
	WebElement nm = driver.findElement(By.id("name"));
	nm.sendKeys("suresh");
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("saransuresh1995@gmail.com");
	
	WebElement cli = driver.findElement(By.xpath("//a[@class='a-ayg']"));
	cli.click();	*/
	
	
}
}
