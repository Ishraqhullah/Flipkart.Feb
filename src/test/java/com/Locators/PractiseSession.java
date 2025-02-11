package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PractiseSession {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(3000);
		
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Ishraq");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("S");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("ishraqishraa@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("abcdef");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("abcdef");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
