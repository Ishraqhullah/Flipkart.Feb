package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToUnderstandXpathByText {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.name("username")).sendKeys("abcds");
		driver.findElement(By.name("password")).sendKeys("abcds123");
		//driver.findElement(By.xpath(null))
		
	}

}
