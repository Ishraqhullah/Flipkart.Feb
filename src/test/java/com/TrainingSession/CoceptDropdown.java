package com.TrainingSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CoceptDropdown {
	public static void main(String[] args) {
		
		try {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			String url = "https://www.globalsqa.com/demo-site/select-dropdown-menu/";
			driver.navigate().to(url);
			
			WebElement options = driver.findElement(By.tagName("select"));
			
			Select s = new Select(options);
			s.selectByIndex(2);
			Thread.sleep(2000);
			s.selectByVisibleText("Antarctica");

			List<WebElement> option = s.getOptions();
			for (int i = 0; i < option.size(); i++) {
				WebElement element = option.get(i);
				String text = element.getText();
				System.out.println(text);
				if (text.equals("Uzbekistan")) {
					s.selectByVisibleText(text);
					
				}
				
				
			}
//			s.deselectByValue("UZB");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
