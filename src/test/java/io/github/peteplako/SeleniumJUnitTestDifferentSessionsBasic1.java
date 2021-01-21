package io.github.peteplako;



import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumJUnitTestDifferentSessionsBasic1 {

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

  
    @Test
   void test() {
        driver.get("https://www.seleniumhq.org");
        assertTrue(driver.getTitle().startsWith("Selenium"));
               
    }
    
    @Test
    void test2() {
        driver.get("https://junit.org/junit5");
        assertTrue(driver.getTitle().startsWith("JUnit 5"));
                
    }
    
    @AfterEach
    void teardown() {
        	driver.close();
            driver.quit();
        }
    


}
