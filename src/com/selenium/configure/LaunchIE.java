package com.selenium.configure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class LaunchIE {
public static void main(String[] args) {
	
	System.setProperty("webdriver.ie.driver", 
			"C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\IEDriverServer.exe");
	

	
	WebDriver d = new InternetExplorerDriver();
	d.get("https://www.flipkart.com/");
	System.out.println();
	
	System.out.println("Current url: "+d.getCurrentUrl());
	System.out.println("Title: "+d.getTitle());
	
	
	
	
	
	

}
}
