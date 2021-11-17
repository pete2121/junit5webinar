package io.github.peteplako;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class CompleteOrder extends TestClass{

	private static final String Loginbutton="login-button";
	private static final String addToCartBoltTshirt="add-to-cart-sauce-labs-bolt-t-shirt";
	private static final String UserName = "user-name";
	private static final String Password = "password";
	
	WebElement userName=driver.findElement(By.id(UserName));
	
	
	@Test
	void test2() {
		driver.get("https://www.saucedemo.com/");
		
		//WebElement userName=driver.findElement(By.id(UserName));
		WebElement password = driver.findElement(By.id(Password));
		WebElement LoginButton = driver.findElement(By.name(Loginbutton));
	
		userName.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		LoginButton.click();
			
			
			
			
			
			
			driver.findElement(By.id(addToCartBoltTshirt)).click();
			driver.findElement(By.className("shopping_cart_link")) .click();
			assertTrue(driver.findElement(By.className("title")).getText().contentEquals("YOUR CART"));	
			driver.findElement(By.id("checkout")) .click();
			WebElement firstName=driver.findElement(By.id("first-name"));
			firstName.sendKeys("Petros");
			driver.findElement(By.id("last-name")).sendKeys("Plakogiannis Fotiou");
			driver.findElement(By.name("postalCode")).sendKeys("16343");
			driver.findElement(By.id("continue")).click();
			assertTrue(driver.findElement(By.className("title")).getText().contentEquals("CHECKOUT: OVERVIEW"));
			driver.findElement(By.name("finish")).click();
			assertTrue(driver.findElement(By.className("complete-header")).getText().contentEquals("THANK YOU FOR YOUR ORDER"));
			driver.findElement(By.name(LoginButton)).click();
			
			
			
			
			driver.findElement(By.name(LoginButton)).click();
	}
		

}
