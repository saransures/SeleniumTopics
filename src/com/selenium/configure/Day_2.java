package com.selenium.configure;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Day_2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.driver.chromedriver",
			"C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	/*ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");*/
	
	//WebDriver driver = new ChromeDriver(opt);
	//1.facebook
	/*driver.get("https://www.facebook.com/");
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("saran@gmail.com");
	
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("suresh123");*/
	
	//2.redbus
/*	driver.get("https://www.redbus.in/");
	WebElement from = driver.findElement(By.id("src"));
	from.sendKeys("Madurai");
	
	//WebElement m = driver.findElement(By.className("sub-city"));
	//m.click();
	
	WebElement to = driver.findElement(By.id("dest"));
	to.sendKeys("Chennai");
	//WebElement t = driver.findElement(By.className("selected"));
	//t.click();    */
	
	//3.Google
/*	driver.get("https://www.google.com/");
	WebElement google = driver.findElement(By.name("q"));
	google.sendKeys("Green Technology");	*/
	
	//4.icici
/*	driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
	WebElement click = driver.findElement(By.name("DUMMY1"));
	click.click();
	WebElement id = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
	id.sendKeys("Saran@123");
	WebElement pass = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
	pass.sendKeys("Saran123");	*/
	
	//5.hdfc - doubt
	WebDriver drive = new EdgeDriver();
	drive.get("https://netbanking.hdfcbank.com/netbanking/");
	drive.manage().window().maximize();
	
	drive.switchTo().frame(0);
	WebElement in = drive.findElement(By.xpath("//input[@size='13']"));
	in.sendKeys("9965684868");
	WebElement con = drive.findElement(By.xpath("//a[text()='CONTINUE']"));
	con.click();
	
	
	
	
	//6.Swiggy
/*	drive.get("https://www.swiggy.com/\r\n" + "");
	WebElement loc = drive.findElement(By.id("location"));
	loc.sendKeys("Madurai");	*/
	
	//7. Snapdeal
	/*drive.get("https://www.snapdeal.com/login");
	WebElement mob = drive.findElement(By.xpath("//input[@type='text']"));
	mob.sendKeys("99789696986785");
	
	WebElement clk = drive.findElement(By.xpath("//button[@class='btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30']"));
	clk.click();*/
	
	//8.instagram
	/*drive.get("https://www.instagram.com/");
	WebElement username = drive.findElement(By.name("username"));
	username.sendKeys("Saran@123");
	WebElement password = drive.findElement(By.name("password"));
	password.sendKeys("Saran!23");*/
	
	//9.Automation Testing
/*	drive.get("http://demo.automationtesting.in/Register.html");
	WebElement first = drive.findElement(By.xpath("//input[@placeholder='First Name']"));
		first.sendKeys("Suresh");	
	WebElement last = drive.findElement(By.xpath("//input[@placeholder='Last Name']"));
	last.sendKeys("V");
	
	WebElement Add = drive.findElement(By.xpath("//textarea[@rows='3']"));
	Add.sendKeys("Madurai");
	
	WebElement Email = drive.findElement(By.xpath("//input[@type='email']"));
	Email.sendKeys("Saran@123");
	
	WebElement ph = drive.findElement(By.xpath("//input[@type='tel']"));
	ph.sendKeys("9952801979");	*/
	
	//10.hotel
/*	drive.get("http://adactinhotelapp.com/");
	WebElement user = drive.findElement(By.id("username"));
	user.sendKeys("Saran@123");
	
	WebElement pass = drive.findElement(By.id("password"));
	pass.sendKeys("Saran123"); */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
