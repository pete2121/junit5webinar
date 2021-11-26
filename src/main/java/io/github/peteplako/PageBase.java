package io.github.peteplako;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
	
	protected WebDriver driver;
	
	public PageBase(WebDriver driver) {
		this.driver = driver;
	}

	public String getTitle() {
		return driver.findElement(By.className("title")).getText();
	}
	
	public String getHeader() {
		return driver.findElement(By.tagName("h3")).getText();
	}

	
	public void typebyId(String text, String identifier) {
		WebElement userName=driver.findElement(By.id(identifier));
		userName.sendKeys(text);
	}
	
	
	public Duration getWaitForTimeout() throws Exception {
		Duration waitForTimeout = null;
		int configuredWaitForTimeoutInMilliseconds;

		Properties properties = new Properties();
		properties.load(new FileReader("src/test/resources/conf.properties"));

		String WebDriverWait = properties.getProperty("WEBDRIVER_WAIT_FOR_TIMEOUT");
		if (waitForTimeout == null) {
			configuredWaitForTimeoutInMilliseconds = Integer.parseInt(WebDriverWait);
			waitForTimeout = Duration.ofMillis(configuredWaitForTimeoutInMilliseconds);
		}
		return waitForTimeout;
	}

	
	public void waitUntilElementLocated(String detailIdentifier) throws Exception {
		WebDriverWait wait = (new WebDriverWait(driver, Duration.ofSeconds(getWaitForTimeout().getSeconds())));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name(detailIdentifier)));
		Thread.sleep(5000);

	}
}
