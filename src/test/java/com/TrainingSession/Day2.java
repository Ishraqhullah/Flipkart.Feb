package com.TrainingSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2 {
	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement fe = driver.findElement(By.id("email"));
		fe.sendKeys("9791550846");
		Thread.sleep(3000);
		WebElement fe1 = driver.findElement(By.name("pass"));
		fe1.sendKeys("Ishraq");
		Thread.sleep(3000);
		WebElement fe2 = driver.findElement(By.name("login"));
		fe2.click();
		
	}

}
