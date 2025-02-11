package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToUnderstandGetCssValue {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		WebElement errorMsg = driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
		System.out.println(errorMsg.getCssValue("font-family"));
		Thread.sleep(2000);
		driver.quit();
		
	}

}
