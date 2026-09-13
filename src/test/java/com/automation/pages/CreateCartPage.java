package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateCartPage {

	WebDriver driver;

	public CreateCartPage(WebDriver driver) {

		this.driver = driver;
	}

	By country = By.xpath("//select[@id='CountryId']");
	By terms = By.id("termsofservice");
	By checkout = By.id("checkout");

	public void selectCountry() {

		Select s = new Select(driver.findElement(country));
		for (WebElement option : s.getOptions()) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}

	}

	public void checkout() {

		driver.findElement(terms).click();
		driver.findElement(checkout).click();

	}

}
