package com.selenium.configure;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\msedgedriver.exe");
		
	
		WebDriver Drive = new EdgeDriver();
Drive.get("http://www.greenstechnologys.com/");
		
		System.out.println("Current url: "+Drive.getCurrentUrl());
		System.out.println();
		System.out.println("Title: "+Drive.getTitle());
		


Drive.get("https://www.facebook.com/");
		System.out.println();
		
		System.out.println("Current url: "+Drive.getCurrentUrl());
		System.out.println();
		System.out.println("Title: "+Drive.getTitle());
		

Drive.get("https://www.amazon.in/");
		System.out.println();
		
		System.out.println("Current url: "+Drive.getCurrentUrl());
		System.out.println();
		System.out.println("Title: "+Drive.getTitle());
		Drive.get("http://traininginchennai.in/selenium-training-in-chennai.html");
		System.out.println();
		
		
		
		
		
		

	}

}
