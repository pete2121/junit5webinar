package io.github.peteplako;



import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumJUnitTestDifferentSessionsBasic2 {

    static WebDriver driver;

    @BeforeAll
   static void setupClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/chromedriver.exe");
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
    
    @AfterAll
    static void teardown() {
        	driver.close();
            driver.quit();
        }
    


}
