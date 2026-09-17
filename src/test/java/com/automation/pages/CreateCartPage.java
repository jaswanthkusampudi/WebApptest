package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;

public class CreateCartPage {

	WebDriver driver;

	public CreateCartPage(WebDriver driver) {

		this.driver = driver;
	}

	By country = By.xpath("//select[@id='CountryId']");
	By terms = By.id("termsofservice");
	
	public void takeScreenshot() throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tar = new File(System.getProperty("user.dir")+"/test-output/Screesnhots/cart.png");
		FileUtils.copyFile(src,tar);
	}
	
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

	public void checkout() throws IOException {

		driver.findElement(terms).click();
		takeScreenshot();
		driver.findElement(checkout).click();

	}

}
