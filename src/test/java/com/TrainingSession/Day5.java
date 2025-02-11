package com.TrainingSession;



import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5 {
	public static void main(String[] args) {
		try {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			String url = "https://www.facebook.com";
			driver.navigate().to(url);
			driver.manage().window().maximize();
			
			WebElement user = driver.findElement(By.id("email"));
//			user.sendKeys("IshraQ");
			
			Actions a = new Actions(driver);
			a.keyDown(Keys.SHIFT).sendKeys("ishraq").keyUp(Keys.SHIFT).build().perform();
			a.doubleClick(user).contextClick().build().perform();
			
			Robot r = new Robot();
			
			for (int i = 0; i < 3; i++) {
				
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);
				
			}
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			
			r.keyRelease(KeyEvent.VK_CONTROL);
		    r.keyRelease(KeyEvent.VK_V);
			
			
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

}
