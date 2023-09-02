package com.selenium.configure;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\91995\\eclipse-workspace\\Selenium\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();

		TakesScreenshot tk = (TakesScreenshot) driver;

//		File src = tk.getScreenshotAs(OutputType.FILE);
//		System.out.println(src);
//
//		File dest = new File("D:\\snapdeal.jpg");
//		FileUtils.copyFile(src, dest);

		File source = tk.getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		
		File dest = new File("D:\\snapde.jpg");
		FileUtils.copyFile(source, dest);
		
	}
}
