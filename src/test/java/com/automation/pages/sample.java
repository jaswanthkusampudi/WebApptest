package com.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sample {

	
		// TODO Auto-generated method stub
		
		public static WebDriver driver;
		
		@Test
		public void launchBrowser() throws InterruptedException {
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demowebshop.tricentis.com/build-your-own-computer");
			
			Thread.sleep(2000);
			
			WebElement el =  driver.findElement(By.id("//input[@id=\"product_attribute_16_3_6_18\"]"));
			el.click();
			
			
			driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-16\"]")).click();
			System.out.println("hi");
			
			
			
		}
		
	

	}


