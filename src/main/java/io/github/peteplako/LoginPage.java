package io.github.peteplako;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) throws Exception {
		super(driver);
		this.driver = driver;
		waitUntilElementLocated("login-button");
	}


	private static final String Loginbutton="login-button";
	private static final String UserNameElement = "user-name";
	private static final String PasswordElement = "password";
	
	
	
	public void clickLoginButton() {
		
		WebElement LoginButton = driver.findElement(By.name(Loginbutton));
		LoginButton.click();
	}
	
	
	public ProductsPage submitLogin(String userNametext, String Passwordtext) {
		
		typebyId(userNametext,UserNameElement);
		typebyId(Passwordtext,PasswordElement);
		clickLoginButton();
		return new ProductsPage(driver);
	}
	

}
