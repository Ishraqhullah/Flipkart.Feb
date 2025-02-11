package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractiseClass {

	public static void main(String[] args) {
		
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			String url = "https://unifiedportal-mem.epfindia.gov.in/memberinterface/";
			driver.navigate().to(url);
			
//			Alert a = driver.switchTo().alert();
//			a.accept();
//			
			driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
			
		
		
		
		

	}

}
