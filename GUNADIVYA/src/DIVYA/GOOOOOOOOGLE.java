package DIVYA;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class GOOOOOOOOGLE {
	public WebDriver driver;
  @Test
  public void f() {
	 driver.findElement(By.name("q")).sendKeys("myntra shopping");
	 driver.findElement(By.name("btnK")).click(); 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\chromedriver\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("https://www.google.co.in/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }

}
