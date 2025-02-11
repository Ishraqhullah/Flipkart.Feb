package com.TrainingSession;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4 {
	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver edge = new EdgeDriver();
		edge.manage().window().maximize();
		String url = "https://www.flipkart.com";
		edge.navigate().to(url);
		
		WebElement search = edge.findElement(By.name("q"));
		search.sendKeys("Redmi mobiles",Keys.ENTER);
			List<WebElement> mob = edge.findElements(By.xpath("//div[@class='KzDlHZ']"));
			for (int i = 0; i < mob.size(); i++) {
				WebElement header = mob.get(i);
				String name = header.getText();
				//System.out.println(name);
				List<WebElement> prc = edge.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
				for (int j = i; j == i; j++) {
					WebElement prchead = prc.get(j);
					String price = prchead.getText();
					Map<String,String> mp = new LinkedHashMap<>();
					mp.put(name, price);
					Set<Entry<String,String>> entrySet = mp.entrySet();
					for (Entry<String, String> entry : entrySet) {
						System.out.println(entry);
						
					}
					//Thread.sleep(5000);
					//edge.quit();
					
					
				}
				
			}
		
		
	
}

}
