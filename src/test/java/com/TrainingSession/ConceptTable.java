package com.TrainingSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConceptTable {
	public static void main(String[] args) {
		try {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
			driver.navigate().to(url);
			
			List<WebElement> iTable = driver.findElements(By.tagName("table"));
			for (int i = 0; i < iTable.size(); i++) {
				WebElement table = iTable.get(i);
				WebElement iBody = table.findElement(By.tagName("tbody"));
				List<WebElement> iRow = iBody.findElements(By.tagName("tr"));
				for (int j = 0; j < iRow.size(); j++) {
					WebElement row = iRow.get(j);
					List<WebElement> iData = row.findElements(By.tagName("td"));
					for (int k = 0; k < iData.size(); k++) {
						WebElement data = iData.get(k);
						String text = data.getText();
						System.out.println(text);
						
					}
				}
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
