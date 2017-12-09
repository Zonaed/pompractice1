package testNG;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LaptopPage;
import pages.TwoInOne;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public static WebDriver driver = new FirefoxDriver();
	
  @Test
  public void f() {
	  driver.get("https://www.walmart.com/");
	  HomePage.verify(driver);
	  HomePage.click(driver);
	  LaptopPage.verify(driver);
	  LaptopPage.click(driver);
	  TwoInOne.verify(driver);
	  TwoInOne.click(driver);
  }
  @BeforeTest
  public void beforeTest() {
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.quit();
  }

}
