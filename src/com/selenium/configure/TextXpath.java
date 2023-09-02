package com.selenium.configure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class TextXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.facebook.com/");
	//Xpath text
		WebElement Crtbtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
		Crtbtn.click();
		
	//Xpath partial text
		WebElement Word = driver.findElement(By.xpath("//h2[contains(text(),'share')]"));
	//gettext() - used to get existing words in the web page
		String text = Word.getText();
		
		System.out.println(text); 
		Thread.sleep(10000);
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S906061087%3A1679062564960477&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AWnogHcTcegkKS7uFR8S7D0nu-OtluuXlOS033FgfWfpI_gMCiyd0wPxQP46mmNDpAiIDG809v5FWg&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("suresh@gmail.com");
		
	String attribute = email.getAttribute("value");
	System.out.println(attribute);
	driver.manage().window().minimize();
		
	}
}
