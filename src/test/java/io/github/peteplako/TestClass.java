package io.github.peteplako;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestClass {
	
	protected WebDriver driver;
	protected LoginPage loginpage;
	protected ProductsPage productspage;
	
	@BeforeAll
	static void setupClass() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

	}
	
	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		loginpage = new LoginPage(driver);
		driver.get("https://www.saucedemo.com/");
		
	}

	@AfterEach
	void tearDown() {

		driver.close();
		driver.quit();

	}


}
