package com.selenium.configure;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_fb {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement crebtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
	crebtn.click();
	Thread.sleep(2500);
	
/*	WebElement month = driver.findElement(By.id("month"));

	//object creation for Select class
	//Classname objName = new ClassName(WebElement refName)
	Select s = new Select(month);
	
	//To get particular value
	//s.selectByIndex(8);
	//s.selectByValue("9");
	s.selectByVisibleText("Sep");
	
	//to get all options - getOptions()
	//iterate using for loop
	List<WebElement> options = s.getOptions();
	System.out.println("Using For Loop");
	for (int i = 0; i < options.size(); i++) {
		WebElement Element = options.get(i);
		String text = Element.getText();
		System.out.println(text);
	}
	
	//iterate using for each
	System.out.println();
	System.out.println("Using for each");
	for (WebElement Element : options) {
		System.out.println(Element.getText());
	}	*/
	
	
	WebElement day = driver.findElement(By.id("day"));
	Select s = new Select(day);
	s.selectByIndex(16);
	
	System.out.println("Using for loop");
	
	List<WebElement> options = s.getOptions();
	for (int i = 0; i < options.size(); i++) {
		WebElement store = options.get(i);
		System.out.println(store.getAttribute("day"));
	}
	
	System.out.println();
	System.out.println("Using for each");
	for (WebElement Stored : options) {
		System.out.println(Stored.getAttribute("option"));
		
	}	
	
	
/*	WebElement year = driver.findElement(By.id("year"));
	Select s = new Select(year);
	
	s.selectByValue("1995");
	System.out.println("Using for loop");
	
	List<WebElement> options = s.getOptions();
	
	for (int i = 0; i < options.size(); i++) {
		WebElement Element = options.get(i);
		System.out.println(Element.getText());
	}
	
	System.out.println();
	System.out.println("Using Enhanced for");
	for (WebElement store : options) {
		System.out.println(store.getAttribute("options"));	
	} */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
