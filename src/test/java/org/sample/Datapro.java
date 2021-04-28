package org.sample;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datapro extends Basecls {
	WebDriver driver;

	@BeforeClass
	private void launch() {
	Basecls.getDriver();
	Basecls.launchUrl("http://adactinhotelapp.com/");
	}

	@AfterClass
	private void quit1() {
	Basecls.quit();
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
	@Test(dataProvider= "res")
	public void adatin(String s1, String s2) {
	WebElement txtuser = Basecls.findElementByid("username");
	txtuser.sendKeys(s1);
	WebElement txtpass = Basecls.findElementByid("password");
	txtpass.sendKeys(s2);
	WebElement btnlogin = Basecls.findElementByid("login");
	btnlogin.click();
	
}
	@DataProvider(name="res")
	public Object[][] data() {
	
	return new Object[][] {{"Ram","test@123"},{"bala","ede@123"},{"sinc","teseddd@123"},{"Raded","tesssst@123"},{"Rad","tesssst@123"},{"Raserf","test@123"},{"Raded","tesssst@123"}};
	}
}
