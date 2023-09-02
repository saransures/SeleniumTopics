package com.selenium.configure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", 
			"C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\geckodriver.exe");
	
	WebDriver dr = new FirefoxDriver();
	
	dr.get("https://greenstech.in/selenium-course-content.html");
	System.out.println();
	System.out.println("Current url: "+dr.getCurrentUrl());
	System.out.println();
	System.out.println("Title: "+dr.getTitle());
	
	}
}
