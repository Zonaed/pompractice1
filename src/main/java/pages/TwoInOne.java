package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TwoInOne {
	public static void verify(WebDriver driver) {
		System.out.println(driver.getTitle());
		
		String title = "Shop Laptops by Type - Walmart.com";
		
		if(driver.getTitle().equals(title)) {
			System.out.println("We are in the right page!!!");
		}else {
			System.out.println("We are in the wrong page");
		}
	}
	
	public static void click(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'2-Day Shipping')]")).click();
	}

}
