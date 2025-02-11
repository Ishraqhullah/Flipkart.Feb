package com.TrainingSession;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WritePractice {
	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver edge = new EdgeDriver();
		edge.manage().window().maximize();
		String url = "https://www.flipkart.com";
		edge.navigate().to(url);
		
		WebElement search = edge.findElement(By.name("q"));
		search.sendKeys("Redmi mobiles",Keys.ENTER);
			List<WebElement> mob = edge.findElements(By.xpath("//div[@class='KzDlHZ']"));
			File f = new File("C:\\Users\\Ishraq\\eclipse-workspace\\Selenium\\target\\Practicing.xlsx");
			FileOutputStream fop = new FileOutputStream(f);
			XSSFWorkbook book = new XSSFWorkbook();
		    XSSFSheet sheet = book.createSheet("Mobilenames");
			for (int i = 0; i < mob.size(); i++) {
				WebElement header = mob.get(i);
				String name = header.getText();
				System.out.println(name);
				XSSFRow row = sheet.createRow(i);
				XSSFCell cell = row.createCell(0);
				cell.setCellValue(name);
				List<WebElement> prc = edge.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
				for (int j = i; j == i; j++) {
					WebElement prchead = prc.get(j);
					String price = prchead.getText();
					XSSFCell cell1 = row.createCell(1);
					cell1.setCellValue(price);
					
				}
				}
			book.write(fop);
			fop.close();
			
	}

}
