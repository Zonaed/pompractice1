package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.HomePage;
import pages.LaptopPage;
import pages.TwoInOne;

public class PomTest {

	    public static void main(String[] args) {
		System.setProperty("WebDriver.geco.driver", "C:\\Users\\MD ZONAED BHUIYAN\\eclipse-workspace\\PomPractice1\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.walmart.com/");
		HomePage.verify(driver);
		HomePage.click(driver);
		LaptopPage.verify(driver);
		LaptopPage.click(driver);
		TwoInOne.verify(driver);
		TwoInOne.click(driver);
		driver.quit();
		

	}

}
