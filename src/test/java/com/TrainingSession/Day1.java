package com.TrainingSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
	String	url ="https://www.amazon.in";
		driver.navigate().to(url);
		Thread.sleep(3000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		//driver.switchTo().newWindow(WindowType.TAB);
		if (url.equals(currentUrl)) {
			System.out.println("Both URl are same so navigating back");
			driver.navigate().back();
			Thread.sleep(3000);
			
		} else {
			System.out.println("Both URl are not same so refreshing the page");
			driver.navigate().refresh();
			Thread.sleep(3000);
			

		}driver.quit();
	}

}
