package com.TrainingSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeOptions {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-notifications");
		options.addArguments("disable-popups");
		WebDriver driver = new EdgeDriver(options);
		String url = "https://www.amazon.in/";
		driver.navigate().to(url);

		
	}

}
