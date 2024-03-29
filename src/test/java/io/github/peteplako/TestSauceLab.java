package io.github.peteplako;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class TestSauceLab {
	
    private WebDriver driver;

    @BeforeAll
   static void setupClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/chromedriver.exe");
    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
    }

    @Disabled
    @Test
   void test() {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        assertTrue(driver.findElement(By.className("title")).getText().contentEquals("PRODUCTS"));
        		          
    }
    
    //Selenium4 locators
    @Test
    void test2() {
    	
          
         driver.get("https://www.saucedemo.com/");
         driver.findElement(By.id("user-name")).sendKeys("standard_user");
         driver.findElement(By.id("password")).sendKeys("secret_sauce");
         driver.findElement(By.name("login-button")).click();
         WebElement firstArticle = driver.findElement(By.xpath("(//div[@class='inventory_item'])[1]"));
         System.out.println("First Article Name: " + firstArticle.findElement(By.className("inventory_item_name")).getText());
         WebElement belowOfFirstArticle = driver.findElement(with(By.className("inventory_item")).below(firstArticle));
         System.out.println("Below Of First Article Name: " + belowOfFirstArticle.findElement(By.className("inventory_item_name")).getText());
         		          
     }
    
    
    @AfterEach
    void teardown() {
        	driver.close();
            driver.quit();
        }
    

}
