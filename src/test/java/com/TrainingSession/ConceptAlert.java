package com.TrainingSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConceptAlert {

	public static void main(String[] args) {
		try {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			String url = "https://demo.automationtesting.in/Alerts.html";
			driver.navigate().to(url);
			driver.manage().window().maximize();

			driver.findElement(By.id("alertButton")).click();
			Alert a = driver.switchTo().alert();
			Thread.sleep(3000);
			a.accept();

			Thread.sleep(3000);
			driver.findElement(By.xpath("(//div[@class='col']//following::button[text()='Click me'])[2]")).click();
			Thread.sleep(3000);
			a.dismiss();

			driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
			a.sendKeys("Ishraq");
			Thread.sleep(3000);
			a.accept();

			String text = a.getText();
			System.out.println(text);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
