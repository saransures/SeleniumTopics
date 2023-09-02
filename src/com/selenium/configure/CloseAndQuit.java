package com.selenium.configure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CloseAndQuit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(opt);
		
	driver.get("https://www.swiggy.com/?utm_source=Google-Sok&utm_medium=CPC&utm_campaign=perf_food_nu_google_search_sok_narm_brand_v1_v2_march23_brand_em&gclid=CjwKCAjw_MqgBhAGEiwAnYOAejdUosxOXG_i-fF_AcipaxIzpXjhl6Mr8G5vOcmC80Pgm6BIg3UxDxoCmvwQAvD_BwE");
		
		driver.findElement(By.linkText("About us")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
