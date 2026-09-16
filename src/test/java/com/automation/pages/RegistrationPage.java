package com.automation.pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

	WebDriver driver;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}

	By registerLink = By.xpath("//a[@class='ico-register']");
	By maleradio = By.xpath("//input[@id='gender-male']");
	By firstName = By.id("FirstName");
	By laststName = By.id("LastName");
	By email = By.id("Email");
	By password = By.id("Password");
	By cpassword = By.id("ConfirmPassword");
	By registerButton = By.id("register-button");

	public void registerUser() {
		Random random = new Random();
		int num = random.nextInt();

		driver.findElement(registerLink).click();
		driver.findElement(maleradio).click();
		driver.findElement(firstName).sendKeys("Hari");
		driver.findElement(laststName).sendKeys("ram");
		driver.findElement(email).sendKeys("Hariram" + num + "@gmail.com");
		driver.findElement(password).sendKeys("Hariram@" + num);
		driver.findElement(cpassword).sendKeys("Hariram@" + num);
		driver.findElement(registerButton).click();
		System.out.println("Register button clicked successfully");
	}

}
