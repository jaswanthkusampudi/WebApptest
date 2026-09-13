package com.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElectronicsPage {

	WebDriver driver;

	public ElectronicsPage(WebDriver driver) {
		this.driver = driver;

	}

	By electronics = By.linkText("Electronics");
	By camera = By.partialLinkText("Camera");
	By digitalSLR = By.partialLinkText("Digital SLR");
	By addToCart = By.xpath("//input[@id='add-to-cart-button-18']");
	By shoppingCart = By.linkText("Shopping cart");

	public void addProductToCart() {

		driver.findElement(electronics).click();

		driver.findElement(camera).click();

		driver.findElement(digitalSLR).click();

		WebElement addBtn = driver.findElement(addToCart);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);", addBtn);
		js.executeScript("arguments[0].click();", addBtn);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bar-notification.success")));

		driver.findElement(shoppingCart).click();
	}
}
