package automationtest;

import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.pages.CreateCartPage;
import com.automation.pages.ElectronicsPage;
import com.automation.pages.RegistrationPage;

public class FirstTest extends BaseClass {

	@Test
	public void launch() throws InterruptedException {

		launchBrowser();

		RegistrationPage register = new RegistrationPage(driver);
		ElectronicsPage electronics = new ElectronicsPage(driver);
		CreateCartPage cart = new CreateCartPage(driver);

		register.registerUser();
		electronics.addProductToCart();
		cart.selectCountry();
		cart.checkout();
		System.out.println("Good afternoon!!!");
		closeBrowser();
		
		
	}
}
