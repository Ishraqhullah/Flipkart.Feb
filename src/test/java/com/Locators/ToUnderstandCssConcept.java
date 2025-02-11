package com.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToUnderstandCssConcept {


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		// to select all the elements
		
		List<WebElement> allele = driver.findElements(By.cssSelector("*"));
		System.out.println(allele.size());
		
		for(WebElement ele : allele);{
			//System.out.println(ele);
			
		
		}

	}

}
