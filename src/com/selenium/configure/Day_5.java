package com.selenium.configure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Day_5 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	ChromeOptions ops = new ChromeOptions();
	ops.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(ops);
	
	//1. Demo.guru99
/*	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	WebElement drag = driver.findElement(By.xpath("//a[text()=' BANK ']"));
	WebElement drop = driver.findElement(By.xpath("(//li[@class = 'placeholder'])[1]"));
	Thread.sleep(1000);
	Actions a = new Actions(driver);
	a.dragAndDrop(drag, drop).perform();
	Thread.sleep(1500);
	WebElement amt = driver.findElement(By.xpath("//a[text() = ' 5000 ']"));
	Thread.sleep(1000);
	WebElement amt1 = driver.findElement(By.xpath("(//div[@class= 'ui-widget-content'])[3]"));
	a.dragAndDrop(amt, amt1).perform();
	
	WebElement sale = driver.findElement(By.xpath("//a[text()=' SALES ']"));
	WebElement sale1 = driver.findElement(By.id("loan"));
	a.dragAndDrop(sale, sale1).perform();
	
	WebElement amount = driver.findElement(By.xpath("//a[text() = ' 5000 ']"));
	WebElement amount1 = driver.findElement(By.id("amt8"));
	a.dragAndDrop(amount, amount1).perform();
	Thread.sleep(2500);
	WebElement txt = driver.findElement(By.xpath("//a[text()='Perfect!']"));
	System.out.println(txt.getText());	*/
	
	
	//2. Amazon 
/*	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Actions a = new Actions(driver);
	WebElement primebtn = driver.findElement(By.xpath("//span[text()='Prime']"));
	a.moveToElement(primebtn).perform();
	Thread.sleep(2000);
	WebElement freedel = driver.findElement(By.xpath("//a[@href='/prime?ref=in-pr-tryprime-unrec-multi-benefit']"));
	freedel.click();	*/
	
	
	//3. flipkart - doubt
/*	driver.get("http://www.flipkart.com\r\n" + "");
	driver.manage().window().maximize();
	WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	close.click();
	driver.findElement(By.xpath("//div[text()='Home & Furniture']")).click();
	Thread.sleep(2000);
	WebElement home = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
	Actions a = new Actions(driver);
	a.moveToElement(home).perform();
	driver.findElement(By.xpath("//a[@title='Bath Towels']")).click();	
	driver.findElement(By.xpath("//a[@class='s1Q9rs']")).click();	*/
	
	
	
	//5. shopclues
	driver.get("https://www.shopclues.com/wholesale.html");
	driver.manage().window().maximize();
	WebElement sports = driver.findElement(By.xpath("//a[text()='Sports & More']"));
	Actions a = new Actions(driver);
	a.moveToElement(sports).perform();
	
	WebElement weight = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
	weight.click();	
	
	//6. GT
/*	driver.get("http://greenstech.in/selenium-course-content.html");
	WebElement course = driver.findElement(By.xpath("//div[text()='Courses ']"));
	WebElement testing = driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
	Actions a = new Actions(driver);
	a.moveToElement(course).perform();
	a.moveToElement(testing).perform();
	WebElement selenium = driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
	selenium.click();	*/
	
	//7. GT
/*	driver.get("http://greenstech.in/selenium-course-content.html");
	WebElement oracle = driver.findElement(By.xpath("//div[text()='Courses ']"));
	WebElement sql = driver.findElement(By.xpath("//span[text()='Oracle (48)']"));
	Actions a = new Actions(driver);
	a.moveToElement(oracle).perform();
	a.moveToElement(sql).perform();
	WebElement selenium = driver.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Placement Certification Training']"));
	selenium.click();	*/
	
	//8. GT - Doubt
/*	driver.get("http://greenstech.in/selenium-course-content.html");
	WebElement allcourse = driver.findElement(By.xpath("(//a[text()='All Courses'])[1]"));
	allcourse.click();
	
	driver.manage().window().maximize();Thread.sleep(2000);
	
	WebElement course = driver.findElement(By.xpath("(//a[text()='Courses '])[1]"));
	WebElement warehouse = driver.findElement(By.xpath("(//a[text()='Data Warehousing Training '])[1]"));
	Actions a = new Actions(driver);
	Thread.sleep(1000);
	a.moveToElement(course).perform();
	a.moveToElement(warehouse).perform();
	WebElement selenium = driver.findElement(By.xpath("//span[text()='Microstrategy Training']"));
	selenium.click();	*/
	
	//9. GT
/*	driver.get("http://greenstech.in/selenium-course-content.html");
	WebElement Courses = driver.findElement(By.xpath("(//div[text()='Courses '])"));
	WebElement rpa = driver.findElement(By.xpath("(//span[text()='RPA (6)'])"));
	Actions a = new Actions(driver);
	a.moveToElement(Courses).perform();
	a.moveToElement(rpa).perform();
	WebElement blue = driver.findElement(By.xpath("(//span[text()='Blue Prism Certification Training'])"));
	blue.click();	*/
	
	
	//10. GT
/*	driver.get("http://greenstech.in/selenium-course-content.html");
	WebElement course = driver.findElement(By.xpath("//div[text()='Courses ']"));
	WebElement data = driver.findElement(By.xpath("(//span[text()='Data Warehousing (5)'])"));
	Actions a = new Actions(driver);
	a.moveToElement(course).perform();
	a.moveToElement(data).perform();	*/
	
	//11. Home depot
/*	driver.get("https://www.homedepot.com/");
	driver.manage().window().maximize();
	WebElement all = driver.findElement(By.xpath("//a[text()='All Departments']"));
	WebElement handc = driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
	
	Actions a = new Actions(driver);
	a.moveToElement(all).perform();
	a.moveToElement(handc).perform();
	Thread.sleep(3500);
	WebElement ac = driver.findElement(By.xpath("//a[@title='Air Conditioners']"));
	a.moveToElement(ac).perform();
	WebElement ac2 = driver.findElement(By.xpath("(//a[text()='Portable Air Conditioners'])"));
	ac2.click();		*/
	
	//12. home depot
/*	driver.get("https://www.homedepot.com/");
	WebElement all = driver.findElement(By.xpath("//a[text()='All Departments']"));
	Actions a = new Actions(driver);
	a.moveToElement(all).perform();
	WebElement paint = driver.findElement(By.xpath("(//a[@data-cta='Get Inspired'])[1]"));
	a.moveToElement(paint).perform();
	WebElement inpaint = driver.findElement(By.xpath("//a[text()='Interior Paint']"));
	a.moveToElement(inpaint).perform();
	WebElement ceiling = driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
	ceiling.click();	*/
	
	//13. snapdeal
/*	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	Thread.sleep(5500);
	WebElement mob = driver.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
	Actions a = new Actions(driver);
	a.moveToElement(mob).perform();
	WebElement cover = driver.findElement(By.xpath("//span[text()='Printed Back Covers']"));
	cover.click();	*/
	
	
	//14. Snapdeal
/*	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	WebElement wmn = driver.findElement(By.xpath("(//span[@class='labelIcon'])[2]"));
	Actions a = new Actions(driver);
	a.moveToElement(wmn).perform();
	driver.findElement(By.xpath("(//span[text()='Heels'])")).click();	*/
	
	
	//15.Amazon
/*	driver.get("https://www.amazon.in/\r\n" + "");
	driver.manage().window().maximize();
	WebElement hello = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
	Actions a = new Actions(driver);
	a.moveToElement(hello).perform();
	driver.findElement(By.xpath("//a[text()='Start here.']")).click();
	
	WebElement name = driver.findElement(By.id("ap_customer_name"));
	name.sendKeys("Suresh Velraj");
	WebElement ph = driver.findElement(By.id("ap_phone_number"));
	ph.sendKeys("9965266386");
	WebElement pass = driver.findElement(By.id("ap_password"));
	pass.sendKeys("Luvu$3000");	*/
	
	
	/*QUESTON 16
	----------
	URL : https://www.amazon.in/
	NOTE: signin is a first mouseover
	      Click SD Cash*/    //it's not available so i click Your Seller Account
/*	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement signin = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
	Actions a = new Actions(driver);
	a.moveToElement(signin).perform();
	driver.findElement(By.xpath("//span[text()='Your Seller Account']")).click();	*/
	
	//17. Flipkart
/*	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
	Actions a = new Actions(driver);
	a.moveToElement(fashion).perform();
	WebElement women = driver.findElement(By.xpath("//a[text()='Women Footwear']"));
	a.moveToElement(women).perform();
	driver.findElement(By.xpath("//a[text()='Women Heels']")).click();	*/
	
	
	//18. Flipkart
/*	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	WebElement toys = driver.findElement(By.xpath("//img[@alt='Beauty, Toys & More']"));
	Actions a = new Actions(driver);
	a.moveToElement(toys).perform();
	WebElement toys1 = driver.findElement(By.xpath("//a[text()='Toys & School Supplies']"));
	a.moveToElement(toys1).perform();
	driver.findElement(By.xpath("//a[text()='Remote Control Toys']")).click();	*/
	
	//19. Flipkart
/*	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
	Thread.sleep(1500);
	WebElement elec = driver.findElement(By.xpath("//span[text()='Electronics']"));
	Actions a = new Actions(driver);
	a.moveToElement(elec).perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Realme']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[text()='realme C30 (Denim Black, 32 GB)'])[1]")).click();	*/
	
	
	
	//20. Flipkart
/*	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//div[text()='TVs & Appliances']")).click();
	Thread.sleep(2000);
	WebElement tv = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
	Actions a = new Actions(driver);
	a.moveToElement(tv).perform();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//a[@title='Mi']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[contains(text(),'Mi 5A 80 cm (32 inch)')]")).click();	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}
