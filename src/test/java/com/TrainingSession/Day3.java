package com.TrainingSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day3 {
	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		String url = "https://www.facebook.com";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		String mail = "ishraqishraa@gmail.com";
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys(mail);
		String at = user.getAttribute("value");
		if (at.isEmpty()) {
			System.out.println("Doesn't accept.");
			
			
		}else {
			System.out.println("Accept ");
		}
		String psd = "Sahana1501";
		WebElement pswd = driver.findElement(By.id("pass"));
		pswd.sendKeys(psd);
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Log in']"));
		if (button.isDisplayed()) {
			button.click();
			
		}
	Thread.sleep(3000);
		
		
		
		
	}

}
