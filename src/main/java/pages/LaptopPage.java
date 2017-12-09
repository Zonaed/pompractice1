package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LaptopPage {
	public static void verify(WebDriver driver) {
		System.out.println(driver.getTitle());
		
		String title = "Laptops - Walmart.com";
		
		if(driver.getTitle().equals(title)) {
			System.out.println("We are in the right page!!!");
		}else {
			System.out.println("Something is wrong.");
		}
	}
	
	public static void click(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("2-in-1 Laptops")).click();
		
	}

}
