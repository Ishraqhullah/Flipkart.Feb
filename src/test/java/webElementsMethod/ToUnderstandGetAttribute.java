package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToUnderstandGetAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
	 WebElement searchBar = driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]"));
       System.out.println(searchBar.getAttribute("class"));
       Thread.sleep(3000);
       driver.quit();

	}

}
