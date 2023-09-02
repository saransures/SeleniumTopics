package com.selenium.configure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorEdge {
public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\msedgedriver.exe");
		
	
		WebDriver Drive = new EdgeDriver();
		Drive.get("https://www.swiggy.com/?utm_source=Google-Sok&utm_medium=CPC&utm_campaign=perf_food_nu_google_search_sok_narm_brand_v1_v2_march%2723_brand_em&gclid=Cj0KCQjw2cWgBhDYARIsALggUhrUhueyeEjyL0c94QYkkgf074nDNRdwEVurg56-Gc_SYy-jTMBnG5waAk4yEALw_wcB");
		
		WebElement mobile = Drive.findElement(By.name("mobile"));
		mobile.sendKeys("9965266386");
}
}