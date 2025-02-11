package com.TrainingSession;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConceptScreenshot {
	public static void main(String[] args) {
		try {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			String url = "https://www.amazon.in/";
			driver.navigate().to(url);

			TakesScreenshot tc = (TakesScreenshot) driver;
			File src = tc.getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\Ishraq\\eclipse-workspace\\Selenium\\src\\test\\resources\\ReserveEditionTon.png");
			FileUtils.copyFile(src, dest);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
