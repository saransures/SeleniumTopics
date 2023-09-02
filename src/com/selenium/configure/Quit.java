package com.selenium.configure;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Quit {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\msedgedriver.exe");
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new EdgeDriver();
		//launching URL's
		driver.get("https://www.greenstechnologys.com/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("http://gmail.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

Thread.sleep(2000);
driver.quit();
}
}

