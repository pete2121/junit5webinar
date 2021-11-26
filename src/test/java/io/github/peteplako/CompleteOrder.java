package io.github.peteplako;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CompleteOrder extends TestClass {

	@DisplayName("This is the Login and go to productPage")
	@Test
	void testThatLoginIsSuccessful() {

		productspage = loginpage.submitLogin("standard_user", "secret_sauce");
		assertTrue(productspage.getTitle().contentEquals("PRODUCTS"));
		productspage.addToCart("add-to-cart-sauce-labs-backpack");
		productspage.addToCart("add-to-cart-sauce-labs-bike-light");
		productspage.navigateToCart();
	}

	
	@DisplayName("This is failed Login")
	@Test
	void testthatLoginFailed() {
		loginpage.submitLogin("petros", "petros");
		assertTrue(loginpage.getHeader()
				.contentEquals("Epic sadface: Username and password do not match any user in this service"));
		
	}

}
