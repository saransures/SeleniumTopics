package com.selenium.configure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Launch_Chrome {
public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("http://www.greenstechnologys.com/");
		System.out.println("Cuurent url - "+driver.getCurrentUrl());
		System.out.println("Title: "+driver.getTitle());
		System.out.println();


		driver.get("https://www.google.com/gmail/about/");
		System.out.println("Current url: "+driver.getCurrentUrl());
		System.out.println("Title: "+driver.getTitle());
		System.out.println();

		driver.get("https://www.flipkart.com/");
		System.out.println("Current url: "+driver.getCurrentUrl());
		System.out.println("Title: "+driver.getTitle());
		System.out.println();
				
		driver.get("http://greenstech.in/selenium-course-content.html");
		System.out.println("Current url: "+driver.getCurrentUrl());
		System.out.println("Title: "+driver.getTitle());
			
		
	
		
	}
}
