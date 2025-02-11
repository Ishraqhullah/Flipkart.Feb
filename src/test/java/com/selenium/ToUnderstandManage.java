package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToUnderstandManage {

	public static void main(String[] args) throws InterruptedException {
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  
		  // Manage method
		  driver.manage().window().maximize();
		  
		  driver.get("https://skillrary.com/");
		  Thread.sleep(2000);
		  driver.manage().window().fullscreen();

	}

}
