package io.github.peteplako;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductsTest extends TestClass {

	

	@Test
	void test() {
		driver.get("https://www.saucedemo.com/");
		WebElement userName=driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		assertTrue(driver.findElement(By.className("title")).getText().contentEquals("PRODUCTS"));	
	}
	
}
