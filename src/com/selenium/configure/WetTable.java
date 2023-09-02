package com.selenium.configure;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WetTable {
public static void main(String[] args) {
	
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
//	ChromeOptions ops = new ChromeOptions();
//	ops.addArguments("--remote-allow-origins=*");
//	WebDriver driver = new ChromeDriver(ops);
//	
//	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
//	driver.manage().window().maximize();
//	WebElement Table = driver.findElement(By.id("customers"));
//	
	//to print heading from Table
/*	List<WebElement> theading = Table.findElements(By.tagName("th"));
	System.out.println("Table Headings");
	for (int i = 0; i < theading.size(); i++) {
		WebElement text = theading.get(i);
		System.out.println(text.getText() );
	}
	
	//to print rows from table
	System.out.println();
	List<WebElement> trow = Table.findElements(By.tagName("tr"));
	System.out.println("Table rows");
	for (int i = 0; i < trow.size(); i++) {
		WebElement text = trow.get(i);
		System.out.println(text.getText());
	}	*/
	
	
	//to get data from table
/*	List<WebElement> trow = Table.findElements(By.tagName("tr"));
	System.out.println();
	System.out.println("Data from Table: ");
	for (int i = 0; i < trow.size(); i++) {
		WebElement row = trow.get(i);
	List<WebElement> data = row.findElements(By.tagName("td"));
	for (int j = 0; j < data.size(); j++) {
		WebElement datatxt = data.get(j);
		System.out.println(datatxt.getText());
	}
	}	*/
	
	
	//To get a Particular data from table
/*	List<WebElement> trow = Table.findElements(By.tagName("tr"));
	System.out.println("To get a Particular data from table:");
	for (int i = 0; i < trow.size(); i++) {
		WebElement row = trow.get(i);
	List<WebElement> tdata = row.findElements(By.tagName("td"));
	for (int j = 0; j < tdata.size(); j++) {
		WebElement text = tdata.get(j);
		String text2 = text.getText();
		if (text2.contains("Germany")) {
			System.out.println(text2);
		}
	}
	
	}	*/
	
	
	//To check wet or dynamic table
//	List<WebElement> trow = Table.findElements(By.tagName("tr"));
//	for (int i = 0; i < trow.size(); i++) {
//		WebElement row = trow.get(i);
//		List<WebElement> tdata = row.findElements(By.tagName("td"));
//		for (int j = 0; j < tdata.size(); j++) {
//			WebElement data = tdata.get(j);
//			String text = data.getText();
//			if (text.contains("UK")) {
//				System.out.println(text);
//				System.out.println(i);
//				System.out.println(j);
//			}
//		}
//	}
//	
	
	
        String s = "Santhosh Kumar Chennai";
        
        // Remove spaces
        String sWithoutSpaces = s.replaceAll("n", "m");
        
        // Print string without spaces
        System.out.println(sWithoutSpaces);
        
        // Print length of string without spaces
        System.out.println("Total characters: " + sWithoutSpaces.length());
    }

	
}

