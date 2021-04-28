package org.sample;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo extends Basecls{
	WebDriver driver;

	@BeforeClass
	private void launch() {
	Basecls.getDriver();
	Basecls.launchUrl("http://demo.automationtesting.in/Register.html");
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
	@Test
	private void demo() throws IOException, InterruptedException, AWTException {
	WebElement firstn = Basecls.findElementByXpath("//input[@placeholder='First Name']");
	firstn.sendKeys(Basecls.filecreationpath("C:\\Users\\Hp\\eclipse-workspace\\TestingTNG\\Excel\\demo.xlsx", "sheet1", 0, 0));
	String name = firstn.getAttribute("value");
	Assert.assertEquals(name, "Arun");
	WebElement last = Basecls.findElementByXpath("//input[@placeholder='Last Name']");
	last.sendKeys(Basecls.filecreationpath("C:\\Users\\Hp\\eclipse-workspace\\TestingTNG\\Excel\\demo.xlsx", "sheet1", 1, 0));
	String lastn= last.getAttribute("value");
	Assert.assertEquals(lastn, "Kumar");
	WebElement address = Basecls.findElementByXpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']");
	address.sendKeys(Basecls.filecreationpath("C:\\Users\\Hp\\eclipse-workspace\\TestingTNG\\Excel\\demo.xlsx", "sheet1", 2, 0));
	String add= address.getAttribute("value");
	Assert.assertEquals(add, "Flat no 11 sakthivel buider");
	WebElement email = Basecls.findElementByXpath("//input[@ng-model='EmailAdress']");
	email.sendKeys(Basecls.filecreationpath("C:\\Users\\Hp\\eclipse-workspace\\TestingTNG\\Excel\\demo.xlsx", "sheet1", 3, 0));
	String ema= email.getAttribute("value");
	Assert.assertEquals(ema, "Arunbss23@gmail.com");
	WebElement phone = Basecls.findElementByXpath("//input[@ng-model='Phone']");
	phone.sendKeys(Basecls.filecreationpath("C:\\Users\\Hp\\eclipse-workspace\\TestingTNG\\Excel\\demo.xlsx", "sheet1", 4, 0));
	String phno= phone.getAttribute("value");
	Assert.assertEquals(phno, "8015820652");
	WebElement fpassword = Basecls.findElementByid("firstpassword");
	fpassword.sendKeys(Basecls.filecreationpath("C:\\Users\\Hp\\eclipse-workspace\\TestingTNG\\Excel\\demo.xlsx", "sheet1", 5, 0));
	String fpw= fpassword.getAttribute("value");
	Assert.assertEquals(fpw, "test@12344r");
	WebElement spassword = Basecls.findElementByid("secondpassword");
	spassword.sendKeys(Basecls.filecreationpath("C:\\Users\\Hp\\eclipse-workspace\\TestingTNG\\Excel\\demo.xlsx", "sheet1", 6, 0));
	String spw= spassword.getAttribute("value");
	Assert.assertEquals(spw, "passse@12w");
	WebElement btnClick = Basecls.findElementByXpath("//input[@value='Male']");
	btnClick.click();
	boolean f = btnClick.isSelected();
	Assert.assertTrue(f);
	Basecls.findElementByXpath("//input[@value='Cricket']").click();
	Basecls.selectByVisibleText(Basecls.findElementByid("Skills"),"Analytics");
	Basecls.selectByIndex(Basecls.findElementByid("countries"),2);
	Basecls.selectByIndex(Basecls.findElementByid("yearbox"), 20);
	Basecls.selectByVisibleText(Basecls.findElementByXpath("//select[@ng-model='monthbox']"), "March");
	Basecls.selectByIndex(Basecls.findElementByid("daybox"), 20);
	Basecls.findElementByid("msdd").click();
	Basecls.findElementByXpath("//a[text()='Arabic']").click();
	Basecls.findElementByXpath("//label[text()='Languages']").click();
	Thread.sleep(3000);
	Basecls.findElementByXpath("//span[@role='combobox']").click();
	Robot rb = new Robot();
	rb.keyPress(KeyEvent.VK_DOWN);
	rb.keyRelease(KeyEvent.VK_DOWN);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	}
	


}
