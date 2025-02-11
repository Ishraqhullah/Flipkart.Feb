package com.TrainingSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6 {
	public static void main(String[] args) {
		try {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			String url = "https://www.demo.guru99.com/test/drag_drop.html";
			driver.navigate().to(url);
			driver.manage().window().maximize();
			
			WebElement drag = driver.findElement(By.xpath("//a[contains(text(),' BANK ')]"));
			WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
			
			Actions a = new Actions(driver);
			a.dragAndDrop(drag, drop).build().perform();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
