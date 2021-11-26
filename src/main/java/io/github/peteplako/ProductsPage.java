package io.github.peteplako;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends PageBase {
	
	//private static final String addToCartBoltTshirt="add-to-cart-sauce-labs-bolt-t-shirt";
	
	private WebDriver driver;

	public ProductsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void addToCart(String Identifier) {
		
		driver.findElement(By.id(Identifier)).click();
		
	}
	
	public void navigateToCart() {
		
		driver.findElement(By.className("shopping_cart_link")).click();
		
	}
	
}
