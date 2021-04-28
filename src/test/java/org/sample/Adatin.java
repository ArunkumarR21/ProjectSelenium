package org.sample;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Adatin {
	WebDriver driver;

	@BeforeClass
	private void launch() {
	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hp\\eclipse-workspace\\TestingTNG\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	driver.manage().window().maximize();
	}
	@AfterClass
	private void quit() {
	driver.quit();
	}
	@BeforeMethod
	private void beforeDate() {
	Date date = new Date();
	System.out.println(date);
	}
	@AfterMethod
	private void afterDate() {
	Date date = new Date();
	System.out.println(date);
	}
	@Test
	private void login() throws InterruptedException {
	driver.findElement(By.id("username")).sendKeys("testNG");
	driver.findElement(By.id("password")).sendKeys("password@123");
	driver.findElement(By.id("login")).click();
	Thread.sleep(1000);
	}	
	
}