package io.github.peteplako;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	
	protected WebDriver driver;
	
	@BeforeAll
	static void setupClass() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

	}
	
	@BeforeEach
	void setUp() {

		driver = new ChromeDriver();

	}

	
	@AfterEach
	void tearDown() {

		driver.close();
		driver.quit();

	}


}
