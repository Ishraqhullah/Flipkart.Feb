package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToUnderstandCoOrdinates {

	public static void main(String[] args) throws InterruptedException {
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  driver.get("https://skillrary.com/");
		  
		  System.out.println(driver.manage().window().getPosition());
		  System.out.println(driver.manage().window().getSize());
		  
		  Thread.sleep(4000);
		
		  
		  driver.quit();
		  

	}

}
