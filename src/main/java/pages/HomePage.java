package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	public static void verify(WebDriver driver) {
		System.out.println(driver.getTitle());
		
		String title = "Walmart.com: Free 2-Day Shipping on Millions of Items";
		
		if(driver.getTitle().equals(title)) {
			System.out.println("We are at the right page!!!");
		}else {
			System.out.println("Somethhing is wrong.");
		}
		
	}
	public static void click(WebDriver driver) {
		WebElement allDepartments = driver.findElement(By.id("header-GlobalLefthandNav-toggle-1"));
		Actions ac = new Actions(driver);
		ac.moveToElement(allDepartments).build().perform();
		WebElement electronics = driver.findElement(By.id("superDeptId-0"));
		ac.moveToElement(electronics).build().perform();
		WebElement laptop = driver.findElement(By.xpath(".//*[@id='superDept-0']/div[2]/div[2]/a[2]"));
		laptop.click();
	}

}
